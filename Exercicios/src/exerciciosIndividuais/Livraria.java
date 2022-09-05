package exerciciosIndividuais;

public class Livraria extends Operacao {
private Double taxaEmprestimo = 2.8;

public Livraria(String tipo, Double valorOperacao, Livro livro, Double taxaEmprestimo) {
	super(tipo, valorOperacao, livro);
	this.taxaEmprestimo = taxaEmprestimo;
}

public Double getTaxaEmprestimo() {
	return taxaEmprestimo;
}

public void setTaxaEmprestimo(Double taxaEmprestimo) {
	this.taxaEmprestimo = taxaEmprestimo;
}


	
	
}
