package model;

public class Destino {

	private int idDestino;
	private String destino;
	private String cidade;
	private String uf;
	private String pais;
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Destino [idDestino=" + idDestino + ", destino=" + destino + ", cidade=" + cidade + ", uf=" + uf
				+ ", pais=" + pais + "]";
	}
	
	

}
