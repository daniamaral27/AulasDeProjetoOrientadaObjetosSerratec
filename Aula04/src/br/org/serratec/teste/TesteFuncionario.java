package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("123", "Roberto", 5000.90, "Financeiro");
		Assistente assistente = new Assistente("25698", "Paulo", 3000., "Assistente de TI");
		gerente.aumentoSalario();
		assistente.aumentoSalario();
		System.out.println("Dados:" + gerente.getNome() + "\n" + gerente.getSalario());
		System.out.println("Dados: " + assistente.getNome() + "\n" + assistente.getSalario());
					
	}

}
