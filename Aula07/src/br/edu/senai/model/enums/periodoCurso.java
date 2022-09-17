package br.edu.senai.model.enums;

public enum periodoCurso {
 TARDE("Terça e Quinta", 40,2500.), 
 NOTURNO ("Segunda e Quarta", 20, 1000.), 
 INTEGRAL("Sexta", 80, 3200.);
	
	//construtor no enum ele é privado
	//serve para organizar a ordem de inserção dos campos
	
	
	private String diasDaSemana;
	private Integer cargaHoraria;
	private Double valor;
	private periodoCurso(String diasDaSemana, Integer cargaHoraria, Double valor) {
		this.diasDaSemana = diasDaSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}
	public String getDiasDaSemana() {
		return diasDaSemana;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public Double getValor() {
		return valor;
	}
	
	
}
