package br.edu.senai.model.enums;

public enum Bebida {
	REFRIGERANTE("Refrigerante", 6.00), 
	AGUA("agua", 2.5), 
	SUCO("Suco de laranja", 7.0), 
	CERVEJA("cerveja", 8.);

	private String tipo;
	private Double valor;

	private Bebida(String tipo, Double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public Double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Tipo: " + tipo + "valor" + valor;
	}
}
