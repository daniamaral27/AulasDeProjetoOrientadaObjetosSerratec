package br.edu.senai.model;

public class empregadoTrabalhoFinal {

public class empregado {
	private String cpf;
	private String nome;
	private String DataNascimento;
	private Double salarioBruto;
	
	public empregado(String cpf, String nome, String dataNascimento, Double salarioBruto) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		DataNascimento = dataNascimento;
		this.salarioBruto = salarioBruto;

	}

	@Override
	public String toString() {
		return "empregado [cpf=" + cpf + ", nome=" + nome + ", DataNascimento=" + DataNascimento + ", salarioBruto="
				+ salarioBruto + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}



}
}
	