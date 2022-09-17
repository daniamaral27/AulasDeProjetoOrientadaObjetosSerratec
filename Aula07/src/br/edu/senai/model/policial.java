package br.edu.senai.model;
//final: essa classe nao podera ter filhos
//imutavel Math
//public final class policial {

public class policial {
	private String nome;
	private String matricula;
	public policial(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	//quando colocar o final no método estamos proibindo a sobreecrita
	//public final String toString()

	@Override
	public String toString() {
		return "policial [nome=" + nome + ", matricula=" + matricula + "]";
	}
	public String getNome() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	
	
}
