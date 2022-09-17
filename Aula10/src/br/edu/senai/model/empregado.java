package br.edu.senai.arquivos;

public class empregado {
	private String cpf;
	private String nome;
	public empregado(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "empregado [cpf=" + cpf + ", nome=" + nome + "]";
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	
	
}
