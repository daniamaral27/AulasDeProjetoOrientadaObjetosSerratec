package br.org.serratec.grupo;

import java.util.ArrayList;
import java.util.List;

public class testeAluno {

	public static void main(String[] args) {
			List<aluno> alunos = new ArrayList();
			
			alunos.add(new aluno("João", 7.5, 10.));
			alunos.add(new aluno("Maria", 8.5, 5.));
			alunos.add(new aluno("João Maria", 7.6, 10.));
			alunos.add(new aluno("Maria João", 7.8, 10.));
		
			
			for (aluno aluno : alunos) {
				System.out.println(aluno);
				System.out.println("Média: " + aluno.calcularMedia());
				
			}
			

		}

	}