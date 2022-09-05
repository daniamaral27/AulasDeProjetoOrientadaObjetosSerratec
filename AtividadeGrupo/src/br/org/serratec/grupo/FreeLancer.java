package br.org.serratec.grupo;

public class FreeLancer extends Vendedor {
	
	int diasTrabalhados;
	Double valorDia;
	public FreeLancer(int diasTrabalhados, Double valorDia) {
		super();
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
		
	}
	public int getDiasTrabalhados() {
		return diasTrabalhados;
	}
	public void setDiasTrabalhados(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}
	public Double getValorDia() {
		return valorDia;
	}
	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}
	

	
}
