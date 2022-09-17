package br.edu.senai.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.edu.senai.model.Aluno;
import br.edu.senai.model.ExibirDadosAlunos;

public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno>alunos = Arrays.asList(new Aluno("Jorge", "j@gmail.com", 45), new Aluno("Mateus", "m@gmail.com", 50));
		
		//ExibirDadosAlunos exibirDadosAluno = new ExibirDadosAlunos();
		alunos.forEach(t -> {
		System.out.println("-----Dados do Aluno------");
		System.out.println(t.getNome());
		System.out.println(t.getEmail());
		
	});
}
}

