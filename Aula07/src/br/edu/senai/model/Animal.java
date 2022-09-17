package br.edu.senai.model;
	
public class Animal {
	protected String nome;
	protected LocalDate dataVacinacao;
	
	
	public Animal(String nome, LocalDate dataVacinacao) {
		super();
		this.nome = nome;
		this.dataVacinacao = dataVacinacao;
	}

	public abstract String emitirSom();

	public String getNome() {
		return nome;
	}

	public LocalDate getDataVacinacao() {
		return dataVacinacao;
	}
	
	
}

