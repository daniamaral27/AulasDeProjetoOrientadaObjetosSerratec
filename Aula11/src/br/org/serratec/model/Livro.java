package br.org.serratec.model;

public class Livro extends Biblioteca {
	private String titulo;
	private String autor;
	private Double preco;
	
	public Livro(String responsavel, String titulo, String autor, Double preco) {
		super(responsavel);
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Double getPreco() {
		return preco;
	}
	
	
	
	
}
