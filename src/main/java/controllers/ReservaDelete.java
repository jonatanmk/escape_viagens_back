package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReservaDao;

@WebServlet("/ReservaDestroy")
public class ReservaDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReservaDelete() {
    	super(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int reservaId = Integer.parseInt(request.getParameter("reservaId"));
		ReservaDao.delete(reservaId);
		
		ReservaCreateAndFind reservaIdCreateAndFind = new ReservaCreateAndFind();
		reservaIdCreateAndFind.doGet(request, response);
	
	}
	
}
