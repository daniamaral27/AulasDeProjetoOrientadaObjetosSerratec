package br.org.serratec.model;

public class atletaAmador extends maratona{
	private boolean atestado;
	
	public atletaAmador(String nome, String sexo, int idade, Double altura, boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public boolean isAtestado() {
		return atestado;
	}
	
}
