package br.org.serratec.grupo;

public class Vendedor {

	String nome;
	String CPF;
	
	public Vendedor(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	

	
}
