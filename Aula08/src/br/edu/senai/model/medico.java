package br.edu.senai.model;

public class medico {
private String crm;
private String nome;
private Double valorConsulta;
public medico(String crm, String nome, Double valorConsulta) {
	super();
	this.crm = crm;
	this.nome = nome;
	this.valorConsulta = valorConsulta;
}
@Override
public String toString() {
	return "medico [crm=" + crm + ", nome=" + nome + ", valorConsulta=" + valorConsulta + "]";
}
public String getCrm() {
	return crm;
}
public String getNome() {
	return nome;
}
public Double getValorConsulta() {
	return valorConsulta;
}


}
