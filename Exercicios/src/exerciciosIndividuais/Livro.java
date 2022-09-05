package exerciciosIndividuais;

public class Livro {
	 private String autor;
	 private String título;
	 private Double valor;
	 private Double reajuste;
	 
	public Livro(String autor, String título, Double valor) {
		super();
		this.autor = autor;
		this.título = título;
		this.valor = valor;
	}

	public String getAutor() {
		return autor;
	}

	public String getTítulo() {
		return título;
	}

	public Double getValor() {
		return valor;
	}
	 
	
	 
	 
}
