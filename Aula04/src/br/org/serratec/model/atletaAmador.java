package br.org.serratec.model;

public class atletaAmador extends maratona{
	private static String nome;
	private static String sexo;
	private static int idade;
	private static Double altura;
	private boolean atestado;

	public atletaAmador(boolean atestado) {
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
