package model;

public class Teste {

	private int id;
	private String campo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	@Override
	public String toString() {
		return this.campo;
	}
	
	
}
