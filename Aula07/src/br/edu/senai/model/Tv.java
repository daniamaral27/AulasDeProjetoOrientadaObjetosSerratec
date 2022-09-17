package br.edu.senai.model;

import br.edu.senai.model.enums.marcaTv;

public class Tv {
	private String modelo;
	private Double tamanho;
	private marcaTv marca;
	
	
	public Tv(String modelo, Double tamanho, marcaTv marca) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Tv modelo=" + modelo + ", tamanho=" + tamanho + "Marca=" + getMarca();
	}

	public String getModelo() {
		return modelo;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public marcaTv getMarca() {
		return marca;
	}
	
	
}
