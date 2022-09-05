package br.org.serratec.model;

//Uma interface não pode ter instancias
//não posso fazer - Conta conta = new Conta();
//É uma forma de substituir a herança em alguns casos
//toda interface é criada para ter somente assinaturas
//interface não tem implementacao

public interface Conta {
	Double taxaBancaria = 2.50;
		
	
	
	//não é necessario colocar o abstract porque fica implicito
	
	public Boolean saque(Double valor);
	public Boolean deposito(Double valor);
	
}
