package br.edu.senai.model;

import java.io.Serializable;

public class Fornecedor implements Serializable{
	/**
	 * Classe para criacao de objetos de itpo fornecedor
	 * @author DaniAmaral
	 * @since criada na sexta, dia 16/09
	 * @version 1.0
	 * 
	 */
	private static final long serialVersionUID = 6893509539042885939L;
	/**
	 * identificacao unica da empresa no cadastro geral de pessoas
	 * 
	 */
	private String cnpj;
	/**
	 * identificacao
	 * a razao social da empresa
	 */
	private String nome;
	private String email;
	public Fornecedor(String cnpj, String nome, String email) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
	}
	/**
	 * metodo usado para imprimir dados de um ojbeto
	 * fornecedor
	 * cnpj
	 */
	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", nome=" + nome + ", email=" + email + "]";
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	/**
	 * Método para calcular o pagamento dos fornecedores onde o retorno deverá ser de 
	 * 1% de comissão.
	 * @author Roni Schanuel
	 * @since 16-09-2022
	 * @param valor recebe um valor como parâmetro
	 * @return Double retorna um valor acrescido de 1% 
	 * @throws IllegalArgumentException Uma exeception poderá ser lançada caso um valor negativo seja digitado.
	 */
	public Double calcularPagamento(Double valor)throws IllegalArgumentException{
		return 0.0;
	}
}
