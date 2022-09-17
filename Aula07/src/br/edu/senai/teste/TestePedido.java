package br.edu.senai.teste;

import java.time.LocalDate;

import br.edu.senai.model.Pedido;
import br.edu.senai.model.enums.Bebida;
import br.edu.senai.model.enums.Sanduiche;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(LocalDate.of(2022, 9, 5), Bebida.REFRIGERANTE, Sanduiche.HAMBURGUER);
		pedido.imprimirCardapio();
		
		System.out.println("Dados do pedido:");
		System.out.println(pedido);
	}

}
