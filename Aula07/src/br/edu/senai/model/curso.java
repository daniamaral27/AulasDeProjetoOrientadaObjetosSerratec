package br.edu.senai.model;

import br.edu.senai.model.enums.periodoCurso;

public class curso {
	private String nome;
	private periodoCurso periodo;
	public curso(String nome, periodoCurso periodo) {
		super();
		this.nome = nome;
		this.periodo = periodo;
	}
	@Override
	public String toString() {
		return "curso [nome=" + nome + ", periodo=" + periodo + "]";
	}
	public String getNome() {
		return nome;
	}
	public periodoCurso getPeriodo() {
		return periodo;
	}
	
	
	
	
	
	
	
}
