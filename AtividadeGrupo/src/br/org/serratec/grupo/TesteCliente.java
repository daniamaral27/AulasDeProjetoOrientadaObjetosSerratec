package br.org.serratec.grupo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {

			public static void main(String[] args) {
				int id = 0, idade = 0;
				String nome, telefone;
				int i = 1;

				Scanner ler = new Scanner(System.in);
				List<Cliente> clientes = new ArrayList();

				do {
					System.out.println("Digite um número negativo para sair:\n");
					System.out.println("Digite o id " + i + "° do cliente: ");
					id = ler.nextInt();
					if (id < 0) {
						break;
					}
					System.out.println("Digite o nome do " + i + "° cliente: ");
					nome = ler.next();
					System.out.println("Digite a idade do " + i + "° cliente: ");
					idade = ler.nextInt();
					System.out.println("Digite o telefone do " + i + "° cliente: ");
					telefone = ler.next();

					clientes.add(new Cliente(id, nome, idade, telefone));
					i++;

				} while (id > 0);
				ler.close();

				for (Cliente cliente : clientes) {
					System.out.println(cliente);
				}
			}

		}


