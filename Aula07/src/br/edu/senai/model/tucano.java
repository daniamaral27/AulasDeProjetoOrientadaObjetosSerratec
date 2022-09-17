package br.edu.senai.model;

import java.time.LocalDate;

public class tucano extends ave {
	private Double peso;
	
	
	public tucano(String nome, LocalDate dataVacinacao, String cor, Double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}

	public Double getPeso() {
		return peso;
	}
	
	
	@Override
	public String voar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

}
