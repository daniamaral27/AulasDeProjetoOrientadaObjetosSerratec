package br.org.serratec.model;

public class atletaProfissional extends maratona{
	private Double peso;
	
	public atletaProfissional(String nome, String sexo, int idade, Double altura, Double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	
	}
	
	public Double getPeso() {
		return peso;
	}
}

	
	