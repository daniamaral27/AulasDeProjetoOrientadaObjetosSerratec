package br.org.serratec.model;

public class atletaProfissional extends maratona{
	private Double peso;

	public atletaProfissional(Double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public Double getPeso() {
		return peso;
	}
	
}
