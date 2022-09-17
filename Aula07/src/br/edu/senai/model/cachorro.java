package br.edu.senai.model;

public class cachorro extends mamifero implements animalDomestico {
	private Boolean castrado;

	public cachorro(String nome, LocalDate dataVacinacao, String raca, Boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
	}

		
	
	public Boolean getCastrado() {
		return castrado;
	}
	
	
}
