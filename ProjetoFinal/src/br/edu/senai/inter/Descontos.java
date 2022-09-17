package br.edu.senai.inter;

public interface Descontos {
	public Double calcularIr(Double descontoIR);
	public Double calcularInss(Double descontoInss);
	public Integer qtdDependentes();
	public Double tipoDependentes();
}

