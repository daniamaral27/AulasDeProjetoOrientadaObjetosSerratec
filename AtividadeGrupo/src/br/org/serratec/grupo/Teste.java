package br.org.serratec.grupo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Fixo vendedor1 = new Fixo("Maria", "1234", 1200., 0.08, 1200.);
		Fixo vendedor2 = new Fixo("João", "5678", 1200., 0.08, 1200.);
		Scanner sc = new Scanner(System.in);
		String opcao;
		Double valorVenda;
		do {
			
			Scanner sc = new Scanner(System.in);
			String opcao;
			Double valorVenda;
			do {
				System.out.println("Escolha um vendedor.\nVendedores:\n" + "1) " + vendedor1.getNome() + "\n2) "
						+ vendedor2.getNome());
				int numero = sc.nextInt();

				switch (numero) {
				case 1:
					System.out.println("Digite o valor da venda.");
					valorVenda = sc.nextDouble();

					break;
				case 2:
					System.out.println("Digite o valor da venda.");
					valorVenda = sc.nextDouble();
					break;
				default:
					System.out.println("Volte Sempre!");
					break;

				}//
				System.out.println("Deseja encerrar o programa?  (S/N)");
				opcao = sc.next();
				
			} while (!opcao.equals("S"));
			System.out.println(vendedor1.toString());
			//System.out.println("Nome: "+vendedor1.getNome()+"\nSalario Bruto"+vendedor1.calcularSalario());
			//System.out.println("Nome: "+vendedor2.getNome()+"\nSalario Bruto"+vendedor2.getSalarioBruto());
		}

	}
