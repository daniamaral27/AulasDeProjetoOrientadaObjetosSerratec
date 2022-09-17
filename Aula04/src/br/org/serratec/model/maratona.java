package br.org.serratec.model;

public class maratona {
	protected String nome;
	protected String sexo;
	protected int idade;
	protected Double altura;
	protected Boolean verificarSituacao;
	
	public maratona(String nome, String sexo, int idade, Double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return super.toString();
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

	public String getSexo() {
		return sexo;
	}

	public String getVerificarSituacao() {
		return(idade > 18 || altura >= 1.80)? "Competirá" : "Não competirá"));
	
		}
		
	}
	
}
	

	
	
