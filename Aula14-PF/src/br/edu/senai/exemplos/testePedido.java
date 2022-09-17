package br.edu.senai.exemplos;

import br.edu.senai.model.Pedido;

public class testePedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido();
		pedido1.finalizarPedido();
		
		
		//classe anônima 
		Pedido pedido2 = new Pedido() {
			@Override
			public void finalizarPedido() {
				System.out.println("Pdedido enviado com sucesso!");
			}
		};
		pedido2.finalizarPedido();
		Pedido pedido3 = new Pedido() {
		};

	}

}
