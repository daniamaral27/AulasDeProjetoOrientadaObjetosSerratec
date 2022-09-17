package br.org.serratec.teste;

public class MeuGenerico <T>{
	private T valor;

	public MeuGenerico(T valor) {
		super();
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "MeuGenerico [valor=" + valor + "]";
	}

	public T getValor() {
		return valor;
	}
	
	

}