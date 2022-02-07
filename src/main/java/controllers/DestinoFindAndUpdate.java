package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DestinoDao;
import model.Destino;

@WebServlet("/DestinoUpdate")
public class DestinoFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DestinoFindAndUpdate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int destinoId = Integer.parseInt(request.getParameter("destinoId"));
		Destino destino = DestinoDao.findByPK(destinoId);
		
		request.setAttribute("destino", destino);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdateDestino.jsp");
		requestDispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Destino destino = new Destino();
		
		destino.setIdDestino(Integer.parseInt(request.getParameter("idDestino")));
		destino.setDestino(request.getParameter("destino"));
		destino.setCidade(request.getParameter("cidade"));
		destino.setUf(request.getParameter("uf"));
		destino.setPais(request.getParameter("pais"));
		
		DestinoDao.update(destino);
			
		DestinoCreateAndFind destinoCreateAndFind = new DestinoCreateAndFind();
		destinoCreateAndFind.doGet(request, response);
		
	}

}
