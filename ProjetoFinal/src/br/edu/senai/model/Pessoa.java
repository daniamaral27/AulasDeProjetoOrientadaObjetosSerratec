package br.edu.senai.model;

import java.time.LocalDate;

abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected LocalDate dataNascimento;
	
	
	public Pessoa(String nome, String cpf, LocalDate dataNascimento, Double salarioBruto) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		
	}
	@Override
	public String toString() {
		return "==> Nome:" + nome + ", cpf:" + cpf + ", Data de Nascimento:" + dataNascimento + " ";
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	
	}
}
	