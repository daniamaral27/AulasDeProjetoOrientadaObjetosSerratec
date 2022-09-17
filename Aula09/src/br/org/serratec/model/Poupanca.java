package br.org.serratec.model;

import br.org.serratec.model.Poupanca;
import br.org.serratec.exception.ContaException;

public class Poupanca implements Conta {
	private String titular;
	private Double saldo;
	

	public Poupanca(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	@Override
	public boolean saque(Double valor) {
		if(saldo >= valor) {
			saldo += valor;
			return true;
	}
		throw new ContaException("Saldo Insuficiente!");
	}
	@Override
	public boolean deposito(Double valor) {
		if(valor > 0) {
			saldo += valor;
			return true;
		}
		throw new ContaException("Valor Inválido!"); 
	}
	public String getTitular() {
		return titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	
	
	
}
