package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Reserva;

public class ReservaDao implements CRUD_Reserva {

	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;

	public static void create(Reserva reserva) {
		sql = "INSERT INTO reservas VALUES (null, ?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, reserva.getNome());
			preparedStatement.setString(2, reserva.getCpf());
			preparedStatement.setInt(3, reserva.getIdDestino());
			preparedStatement.setString(4, reserva.getDestino());
			preparedStatement.setString(5, reserva.getDiasReserva());
			preparedStatement.setString(6, reserva.getDataReserva());

			preparedStatement.executeUpdate();

			System.out.println("--correct insert on database");

		} catch (SQLException e) {
			System.out.println("--incorrect insert on database. " + e.getMessage());
		}
	};

	public static void delete(int reservaId) {
		sql = "DELETE FROM reservas WHERE id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, reservaId);
			preparedStatement.executeUpdate();

			System.out.println("--correct delete on reserva");

		} catch (SQLException e) {
			System.out.println("--incorrect delete on reserva. " + e.getMessage());
		}

	};

	public static List<Reserva> find(String pesquisa) {

		sql = String.format("SELECT * FROM reservas WHERE nome like '%s%%' OR cpf LIKE '%s%%' ", pesquisa, pesquisa);
		List<Reserva> reservas = new ArrayList<Reserva>();

		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				Reserva reserva = new Reserva();

				reserva.setId(resultSet.getInt("id"));
				reserva.setNome(resultSet.getString("nome"));
				reserva.setCpf(resultSet.getString("cpf"));
				reserva.setIdDestino(resultSet.getInt("idDestino"));
				reserva.setDestino(resultSet.getString("destino"));
				reserva.setDiasReserva(resultSet.getString("diasReserva"));
				reserva.setDataReserva(resultSet.getString("dataReserva"));

				reservas.add(reserva);
			}

			System.out.println("--correct find reservas");
			return reservas;

		} catch (SQLException e) {
			System.out.println("--incorrect find reservas. " + e.getMessage());
			return null;
		}

	};

	public static Reserva findByPK(int reservaId) {

		sql = String.format("SELECT * FROM reservas WHERE id = %d ", reservaId);

		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Reserva reserva = new Reserva();

			while (resultSet.next()) {

				reserva.setId(resultSet.getInt("id"));
				reserva.setNome(resultSet.getString("nome"));
				reserva.setCpf(resultSet.getString("cpf"));
				reserva.setIdDestino(resultSet.getInt("idDestino"));
				reserva.setDestino(resultSet.getString("destino"));
				reserva.setDiasReserva(resultSet.getString("diasReserva"));
				reserva.setDataReserva(resultSet.getString("dataReserva"));

			}

			System.out.println("--correct find by pk reserva");
			return reserva;

		} catch (SQLException e) {
			System.out.println("--incorrect find by pk reserva. " + e.getMessage());
			return null;
		}

	};

	public static void update(Reserva reserva) {
		sql = "UPDATE reservas SET nome=?, cpf=?, idDestino=?, destino=? , diasReserva=? , dataReserva=? WHERE id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, reserva.getNome());
			preparedStatement.setString(2, reserva.getCpf());
			preparedStatement.setInt(3, reserva.getIdDestino());
			preparedStatement.setString(4, reserva.getDestino());
			preparedStatement.setString(5, reserva.getDiasReserva());
			preparedStatement.setString(6, reserva.getDataReserva());
			preparedStatement.setInt(7, reserva.getId());

			preparedStatement.executeUpdate();

			System.out.println("--correct update on database");

		} catch (SQLException e) {
			System.out.println("--incorrect update on database. " + e.getMessage());
		}
	};

}
