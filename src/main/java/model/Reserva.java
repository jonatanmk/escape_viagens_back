package model;

public class Reserva {

	private int id;
	private String nome;
	private String cpf;
	private int idDestino;
	private String destino;
	private String diasReserva;
	private String dataReserva;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDiasReserva() {
		return diasReserva;
	}
	public void setDiasReserva(String diasReserva) {
		this.diasReserva = diasReserva;
	}
	public String getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(String dataReserva) {
		this.dataReserva = dataReserva;
	}
	
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", idDestino=" + idDestino + ", destino="
				+ destino + ", diasReserva=" + diasReserva + ", dataReserva=" + dataReserva + "]";
	}
	
}
