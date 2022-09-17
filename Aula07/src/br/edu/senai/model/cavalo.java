package br.edu.senai.model;

public class cavalo extends mamifero implements AnimalCompeticao {
	private String marcaFerradura;

	public cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}

	public String getMarcaFerradura() {
		return marcaFerradura;
	}
	

