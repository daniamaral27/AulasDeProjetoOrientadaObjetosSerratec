package br.edu.senai.model;

public class policialFederal extends policial {
	private final String lotacao;

	public policialFederal(String nome, String matricula, String lotacao) {
		super(nome, matricula);
		this.lotacao = lotacao;
	}

	public String getLotacao() {
		return lotacao;
	}
	
	}
