package br.edu.senai.model;

public class pessoa {

	private String nome;
	private String telefone;
	private estadoCivil estadoCivil;
	private Setor setor;
	
	public pessoa(String nome, String telefone, br.edu.senai.model.estadoCivil estadoCivil, Setor setor) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.estadoCivil = estadoCivil;
	}
	@Override
	public String toString() {
		return "nome:" + nome + " || telefone=" + telefone + ", estadoCivil=" + estadoCivil + "]";
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public estadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	
	public Setor getSetor() {
		return setor;
	}
	
	
}
