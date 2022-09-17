package br.edu.senai.model;

import java.util.Optional;

public class Seguro {
	private String cobertura;
	private Double valorSeguro;
	private Optional<Seguro> seguro;
	
	public Seguro(String cobertura, Double valorSeguro, Optional<Seguro> seguro) {
		super();
		this.cobertura = cobertura;
		this.valorSeguro = valorSeguro;
		this.seguro = seguro;
	}
	
	@Override
	public String toString() {
		return "Seguro [cobertura=" + cobertura + ", valorSeguro=" + valorSeguro + "]";
	}

	public String getCobertura() {
		return cobertura;
	}

	public Double getValorSeguro() {
		return valorSeguro;
	}

	public Optional<Seguro> getSeguro() {
		return seguro;
	}

	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
