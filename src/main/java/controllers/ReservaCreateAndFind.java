package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReservaDao;
import model.Reserva;

@WebServlet("/CreateAndFindReserva")
public class ReservaCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ReservaCreateAndFind() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		
		if(pesquisa == null) {
			pesquisa="";
		}
		
		List<Reserva> reservas = ReservaDao.find(pesquisa);
		
		request.setAttribute("reservas", reservas);
		RequestDispatcher resquesDispatcher = request.getRequestDispatcher("lista_reserva.jsp");
		resquesDispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Reserva reserva = new Reserva();
		
				
		reserva.setNome(request.getParameter("nome"));
		reserva.setCpf(request.getParameter("cpf"));
		reserva.setIdDestino(Integer.parseInt(request.getParameter("idDestino")));
		reserva.setDestino(request.getParameter("destino"));
		reserva.setDiasReserva(request.getParameter("diasReserva"));
		reserva.setDataReserva(request.getParameter("dataReserva"));
		
		ReservaDao.create(reserva);
		
		doGet(request, response);
	}

}
