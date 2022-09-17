package br.edu.senai.model;

public class empregado {
	private String nome;
	private String telefone;
	public empregado(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Empregado: [nome=" + nome + ", telefone=" + telefone + "]";
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	
	
	
	
}
