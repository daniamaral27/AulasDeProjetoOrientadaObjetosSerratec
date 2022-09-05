package br.org.serratec.model;
//a classe nao podera ser intanciada - empregado empregado= new Empregado();

public abstract class Empregado {
	private String CPF;
	private String nome;
	protected Double salario;
	public Empregado(String cPF, String nome, Double salario) {
		super();
		CPF = cPF;
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado [cpf + cpf + nome + "nome" + salario + "salario";";
	}
	
	public String getCPF() {
		return CPF;
	}
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	//é uma assinatura de metodo abstrato. este metodo nao tem implementacao
	//todo filho obrigatoriamente deverao implementar essse metodo.
	
	public abstract void aumentarSalario();
	
}
