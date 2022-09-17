package br.edu.senai.arquivos;

import java.util.Objects;

public class empregado {
	
	private String cpf;
	private String nome;
	public empregado(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "empregado [cpf=" + cpf + ", nome=" + nome + "]";
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		return true;
		if (this == obj)
		return false;
		if (getClass() !=obj.getClass())
			return false;
		empregado other = (empregado) obj;
		return Objects.equals(cpf, other.cpf);
				
		}
	}
