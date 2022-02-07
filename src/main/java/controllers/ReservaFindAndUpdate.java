package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReservaDao;
import model.Reserva;

@WebServlet("/ReservaUpdate")
public class ReservaFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReservaFindAndUpdate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int reservaId = Integer.parseInt(request.getParameter("reservaId"));
		Reserva reserva = ReservaDao.findByPK(reservaId);
		
		request.setAttribute("reserva", reserva);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdateReserva.jsp");
		requestDispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Reserva reserva = new Reserva();
		
		reserva.setId(Integer.parseInt(request.getParameter("id")));
		reserva.setNome(request.getParameter("nome"));
		reserva.setCpf(request.getParameter("cpf"));
		reserva.setIdDestino(Integer.parseInt(request.getParameter("idDestino")));
		reserva.setDestino(request.getParameter("destino"));
		reserva.setDiasReserva(request.getParameter("diasReserva"));
		reserva.setDataReserva(request.getParameter("dataReserva"));
		
		ReservaDao.update(reserva);
			
		ReservaCreateAndFind reservaCreateAndFind = new ReservaCreateAndFind();
		reservaCreateAndFind.doGet(request, response);
		
	}

}
