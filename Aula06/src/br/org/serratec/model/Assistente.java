package br.org.serratec.model;

public class Assistente extends Empregado {
	private Double adicional;	
	
	
	public Assistente(String cPF, String nome, Double salario, Double adicional) {
		super(cPF, nome, salario);
		this.adicional = adicional;
	}


	@Override
	public void aumentarSalario() {
		return super.toString() + "Adicional:" + adicional;
		

	}


	public Double getAdicional() {
		return adicional;
	}
	
	@Override
	public void aumentarSalario * 1.10 + adicional;
	

}
