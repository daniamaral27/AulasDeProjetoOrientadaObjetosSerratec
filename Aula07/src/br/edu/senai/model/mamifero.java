package br.edu.senai.model;

public abstract class mamifero extends Animal {
	protected String raca;

		
	public mamifero(String nome, LocalDate dataVacinacao, String raca) {
		super(nome, dataVacinacao);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public abstract void amamentar();
}
