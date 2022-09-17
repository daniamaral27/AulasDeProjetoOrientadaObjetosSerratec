package br.edu.senai.arquivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeituraArquivoFileReader {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileReader("/exemplos/leitura.txt"));	
			sc.useDelimiter(";");
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado");
		}
	}
}
