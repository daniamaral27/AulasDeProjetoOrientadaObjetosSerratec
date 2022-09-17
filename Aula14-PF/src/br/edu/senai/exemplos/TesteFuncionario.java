package br.edu.senai.exemplos;

import java.util.Optional;

import br.edu.senai.model.Funcionario;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(1, "Abreu", null, 2700.);
//		Funcionario funcionario = null;
		Optional<Funcionario> funcionario2 = null;
		
		System.out.println(funcionario.getSetor());
		if(funcionario2.isPresent()) {
		System.out.println(funcionario2.get().getNome());
		
		
		}
		
	}
}
