package br.org.serratec.teste;

import br.org.serratec.model.Veiculo;

public class TesteVeiculo {

	Veiculo  veiculo = new Veiculo();
	veiculo.placa = "ABC-1234";
	veiculo.tipodeCombutivel = "Flex";
	veiculo.valor = 40000.;
	
	System.out.println(veiculo.calcularIPVA())
	System.out.println("O valor do IPVA é:"+veiculo.calcularIPVA());
}