package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Destino;

public class DestinoDao implements CRUD_Destino {

	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;

	public static void create(Destino destino) {
		sql = "INSERT INTO destinos VALUES (null, ?, ?, ?, ?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, destino.getDestino());
			preparedStatement.setString(2, destino.getCidade());
			preparedStatement.setString(3, destino.getUf());
			preparedStatement.setString(4, destino.getPais());

			preparedStatement.executeUpdate();

			System.out.println("--correct insert on database");

		} catch (SQLException e) {
			System.out.println("--incorrect insert on database. " + e.getMessage());
		}
	};

	public static void delete(int destinoId) {
		sql = "DELETE FROM destinos WHERE idDestino = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, destinoId);
			preparedStatement.executeUpdate();

			System.out.println("--correct delete on destino");

		} catch (SQLException e) {
			System.out.println("--incorrect delete on destino. " + e.getMessage());
		}

	};

	public static List<Destino> find(String pesquisa) {

		sql = String.format("SELECT * FROM destinos WHERE destino like '%s%%' OR cidade LIKE '%s%%' ", pesquisa, pesquisa);
		List<Destino> destinos = new ArrayList<Destino>();

		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				Destino destino = new Destino();

				destino.setIdDestino(resultSet.getInt("idDestino"));
				destino.setDestino(resultSet.getString("destino"));
				destino.setCidade(resultSet.getString("cidade"));
				destino.setUf(resultSet.getString("uf"));
				destino.setPais(resultSet.getString("pais"));

				destinos.add(destino);
			}

			System.out.println("--correct find destinos");
			return destinos;

		} catch (SQLException e) {
			System.out.println("--incorrect find destinos. " + e.getMessage());
			return null;
		}

	};

	public static Destino findByPK(int destinoId) {

		sql = String.format("SELECT * FROM destinos WHERE idDestino = %d ", destinoId);

		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Destino destino = new Destino();

			while (resultSet.next()) {

				destino.setIdDestino(resultSet.getInt("idDestino"));
				destino.setDestino(resultSet.getString("destino"));
				destino.setCidade(resultSet.getString("cidade"));
				destino.setUf(resultSet.getString("uf"));
				destino.setPais(resultSet.getString("pais"));

			}

			System.out.println("--correct find by pk destino");
			return destino;

		} catch (SQLException e) {
			System.out.println("--incorrect find by pk destino. " + e.getMessage());
			return null;
		}

	};

	public static void update(Destino destino) {
		sql = "UPDATE destinos SET destino=?, cidade=?, uf=?, pais=? WHERE idDestino=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, destino.getDestino());
			preparedStatement.setString(2, destino.getCidade());
			preparedStatement.setString(3, destino.getUf());
			preparedStatement.setString(4, destino.getPais());
			preparedStatement.setInt(5, destino.getIdDestino());

			preparedStatement.executeUpdate();

			System.out.println("--correct update on database");

		} catch (SQLException e) {
			System.out.println("--incorrect update on database. " + e.getMessage());
		}
	};

}
