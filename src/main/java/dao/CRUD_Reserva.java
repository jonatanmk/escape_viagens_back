package dao;

import java.util.List;

import model.Reserva;

public interface CRUD_Reserva {
	
	public static void create(Reserva reserva) {};
	public static void delete(int reservaId) {};
	public static List<Reserva> find(String pesquisa) {return null;};
	public static Reserva findByPK(int reservaId) {return null;};
	public static void update(Reserva reserva) {};

}