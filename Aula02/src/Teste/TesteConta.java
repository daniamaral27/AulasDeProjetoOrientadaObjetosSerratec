package Teste;

import Modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {
		//instancia do objeto
	Conta conta1 =  new Conta();
	conta1.NumeroConta = 62598;
	conta1.Titular = "Maria";
	conta1.Saldo = 2000;
	
	//deposito
	
	conta1.deposito(500);
	
	//saque
	if (conta1.Saque(200));
	System.out.println("Saque efetuado com sucesso!");
	} else {
	System.out.println("Não tem dinheiro");

	}

	//imprimir saldo
	System.out.println("Saldo: " + Conta1.Saldo);
	
	
}

}

