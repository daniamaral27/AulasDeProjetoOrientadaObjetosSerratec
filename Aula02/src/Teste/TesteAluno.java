package Teste;

import Modelo.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		System.out.println(".................");
		// Instancia de um objeto
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Carlos";
		aluno1.matrícula = 1234;
//		aluno1.email = "carlos@gmail.com";
		
		System.out.println(aluno1.matrícula + "-" + aluno1.nome);
		
		
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();

		System.out.println("Aluno1" + aluno1);
		System.out.println("Aluno2" + aluno2);
		
		if(aluno1==aluno2) {
			System.out.println("Objetos Iguais!");
		}
	/else {
			System.out.println("Objetos Diferentes!");
		
			}
		

	}

}
