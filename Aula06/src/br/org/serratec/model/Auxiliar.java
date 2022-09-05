package br.org.serratec.model;

public abstract class Auxiliar extends Empregado {

	protected String categoria;

	public Auxiliar(String cPF, String nome, Double salario, String categoria) {
		super(cPF, nome, salario);
		this.categoria = categoria;
	}
	
	
	
}
