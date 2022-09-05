package exerciciosIndividuais;

import exerciciosIndividuais.Livro; 

public class Operacao {
	private String tipo;
	private Double valorOperacao;
	private Livro livro;
		
	
	public Operacao(String tipo, Double valorOperacao, Livro livro) {
		super();
		this.tipo = tipo;
		this.valorOperacao = valorOperacao;
		this.livro = livro;
		}
	
	public String venderLivro() {
		return "Tipo: " + tipo + "valor da Operação: " + valorOperacao + "Livro escolhido :" + livro;
		
	}
	
	public String getTipo() {
		return tipo;
	}
	public Double getValorOperacao() {
		return valorOperacao;
	}
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	
	
	 }
	 
