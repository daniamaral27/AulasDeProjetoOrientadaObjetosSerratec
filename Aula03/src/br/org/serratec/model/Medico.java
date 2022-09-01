package br.org.serratec.model;

import java.awt.Container;

public class Medico {
	private Integer crm;
	private String nome;
	private Double salario;
	private Double valorConsulta;
	public Medico(Integer crm, String nome, Double salario, Double valorConsulta, int Contador) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		Contador ++;
		
	}
	public Integer getCrm() {
		return crm;
	}
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	public Double getValorConsulta() {
		return valorConsulta;
	}
	
	public void PagamentoDinheiro() {
		salario += valorConsulta;
	}
	
	public void PagamentoPlanoDeSaude() {
		salario = salario + valorConsulta * 0.70;

}
} // aula 03
