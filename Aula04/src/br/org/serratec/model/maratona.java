package br.org.serratec.model;

public class maratona {
	protected String nome;
	protected String sexo;
	protected int idade;
	protected Double altura;
	public maratona(String nome, String sexo, int idade, Double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public Double getAltura() {
		return altura;
	}
	public void verificarSituacao() {
	} {
		if (idade > 18 || altura >= 1.8); {
		System.out.println("O atleta pode competir");	
		else {
		System.out.println("O atleta não pode competir");	

		}
	}
		}
}
