package br.edu.senai.model;

public abstract class ave extends Animal {
	protected String cor;

	public ave(String nome, LocalDate dataVacinacao, String cor) {
		super(nome, dataVacinacao);
		this.cor = cor;
	}

	public abstract String voar();

	@Override
	public String toString() {
		return "ave [cor=" + cor + "]";
	}
}
