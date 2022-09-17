package br.edu.senai.teste;

import br.edu.senai.model.Setor;
import br.edu.senai.model.estadoCivil;
import br.edu.senai.model.pessoa;

public class testePessoa {

	public static void main(String[] args) {
		Setor setor1 = new Setor(234, "RH");
		Setor setor2 = new Setor (654, "DP");
		
		pessoa pessoa1 = new pessoa("Renata", "25469875", estadoCivil.CASADO, setor1);
		pessoa pessoa2 = new pessoa("Guilherme", "569874563", estadoCivil.SOLTEIRO, setor2);
		
				
		System.out.println("Dados pessoais:" + "\n" + pessoa1);
		
		for (estadoCivil situacao : estadoCivil.values()) {
			System.out.println(situacao);
		}
			
		}

	}

