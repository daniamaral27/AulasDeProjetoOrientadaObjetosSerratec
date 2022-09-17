package br.edu.senai.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class exemploEmpregadoArquivo {

	public static void main(String[] args) {
		
		File arquivo = new File("/exemplos/empregado.txt");
		try {
			Scanner sc = new Scanner(arquivo);
			Set<empregado> empregados = new HashSet<>();
			System.out.println("-------Dados do arquivo ---------");
 			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				if(!linha.isEmpty()) {
				String vetor[] = linha.split(";");
				empregados.add(new empregado(vetor[0], vetor[1]));	
				}
			}
			sc.close();
			
			System.out.println("-------Dados do arquivo ---------");
			for(empregado empregado : empregados) {
				System.out.println(empregado);
					
			System.out.println("------- do arquivo ---------");
			FileWriter arquivoGravar = new FileWriter("/exemplos/empregado.txt");
			PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
			for (empregado empregado : empregados) {
				String linha = empregado.getCpf() + ";" + empregado.getNome() + "\n";
				gravacaoArquivo.print(linha);
							}
			
		} catch (IOException e) {
				System.out.println("Não funcionou!");		}
		
	}

}



/*package br.edu.senai.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exemploEmpregadoArquivo {

	public static void main(String[] args) {
		
		File arquivo = new File("/exemplos/empregado.txt");
		try {
			Scanner sc = new Scanner(arquivo);
			List<empregado> empregados = new ArrayList<>();
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				if(!linha.isEmpty()) {
				String vetor[] = linha.split(";");
				empregados.add(new empregado(vetor[0], vetor[1]));	
				}
			}
			sc.close();
			System.out.println("-------Dados do arquivo ---------");
			for(empregado empregado : empregados) {
				System.out.println(empregado);
			}
			
		} catch (FileNotFoundException e) {
				e.printStackTrace();		}
		
	}

}*/