package br.edu.senai.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.edu.senai.enuns.TipoDependentes;
import br.edu.senai.model.Dependente;
import br.edu.senai.model.Funcionario;

public class TesteFuncionario {


	public static void main(String[] args) {

		File file = new File("/exemplos/listagemnova.txt");
		Scanner sc = null;
		Boolean funcionarioPreenchido = false;
		Funcionario funcionario = new Funcionario(null, null, null, null, null);
		Set<Funcionario> funcionarios = new HashSet<>();

		try {
			sc = new Scanner(file);
			System.out.println("----------------Leitura do Arquivo --------------");
			String linha = sc.nextLine();

			while (sc.hasNextLine()) {
				if (!linha.isEmpty()) {
					if (funcionarioPreenchido == false) {
						String vetor[] = linha.split(";");
						String nome = vetor[0];
						String cpf = vetor[1];
						LocalDate nasc = LocalDate.parse(vetor[2]);
						Double salario = Double.parseDouble(vetor[3]);

						funcionario = new Funcionario(nome, cpf, nasc, salario, null);
						// System.out.println(funcionario);

						funcionarios.add(funcionario);
						funcionarioPreenchido = true;

						linha = sc.nextLine();
					}
					if (funcionarioPreenchido == true) {
						Set<Dependente> dependentes = new HashSet<>();
						String vetor1[] = linha.split(";");
						String nome1 = vetor1[0];
						String cpf1 = vetor1[1];
						LocalDate nasc1 = LocalDate.parse(vetor1[2]);
						TipoDependentes parente = TipoDependentes.valueOf(vetor1[3]);
						
						dependentes.add(new Dependente(nome1, cpf1, nasc1, null, parente));
						funcionario.getDependentes().add(new Dependente(nome1, cpf1, nasc1, null, parente));
						Dependente.verificaDependente(nasc1);
						/*
						 * for (Dependente string : dependentes) { System.out.println(string + " " +
						 * Dependente.verificaDependente(nasc1)); }
						 */

					}
				} else {
					Double calculoInss = funcionario.calcularInss();
					Double calculoIR = funcionario.calcularIr();
					Double salarioLiquido = funcionario.getSalarioBruto() - calculoInss - calculoIR;
					
					System.out.printf(
							"%s \nDesconto IR: R$ %.2f, Desconto INSS: R$ %.2f, Salário Líquido: R$ %.2f \nQuantidade de dependentes: %s\n\n",
							funcionario, calculoIR, calculoInss, salarioLiquido, Dependente.contDependente);
					// System.out.println(Dependente.contDependente);

					Dependente.contDependente = 0;
					funcionarioPreenchido = false;
				}
				linha = sc.nextLine();

			}
			System.out.println("--------gravando arquivo------");
			FileWriter arquivoGravar = new FileWriter("/exemplos/listagemsaida.txt");
			PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
			for (Funcionario funcionario1 : funcionarios) {
				String linha1 = funcionario1.getNome() + ";" + funcionario1.calcularInss()+";"+ funcionario1.calcularIr()+ "\n";
				//String linha1 = Funcionario.calculos(funcionario1);
				gravacaoArquivo.print(linha1);
			}

			System.out.println("Arquivo Gravado com sucesso");
			gravacaoArquivo.close();
		} catch (Exception e) {
			System.out.println("ERRO!" + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
