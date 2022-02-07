package dao;

import java.util.List;

import model.Destino;

public interface CRUD_Destino {
	
	public static void create(Destino destino) {};
	public static void delete(int destinoId) {};
	public static List<Destino> find(String pesquisa) {return null;};
	public static Destino findByPK(int destinoId) {return null;};
	public static void update(Destino destino) {};

}
