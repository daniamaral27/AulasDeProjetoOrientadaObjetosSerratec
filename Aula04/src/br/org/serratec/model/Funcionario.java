package br.org.serratec.model;

public class Funcionario {
	private String cpf;
	private String nome;
	private Double salario;
	//Double precisa colocar ponto (.) no final do número
	
	public Funcionario(String cpf, String nome, Double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	
	public Double aumentoSalario() {
		return salario *= 1.10;  
//IGUAL: return salario = salario * 1.10
	}
	
	
}
