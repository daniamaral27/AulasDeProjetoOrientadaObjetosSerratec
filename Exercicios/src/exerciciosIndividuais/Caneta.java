package exerciciosIndividuais;

public class Caneta {
	private String modelo;
	private float ponta;
	
		
	public Caneta(String modelo, float ponta) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void status() {
 		System.out.println("Sobre a caneta: " + "Modelo: " + modelo + "Ponta: " + ponta);
	}
	
}
	
	
	
	
	
	
	
	

