package br.org.serratec.model;

public class Diretor extends Empregado {
	private String categoria;
	
	
	public Diretor(String cPF, String nome, Double salario, String categoria) {
		super(cPF, nome, salario);
		this.categoria = categoria;
	}

	@Override
	public void aumentarSalario() {
		salario = salario * 1.15;

	}

	public String getCategoria() {
		return categoria;
		}

	@Override
	public void aumentarSalario() {
		
	}
	
}

