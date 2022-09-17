package br.org.serratec.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ("Amaral", "a@gmail.com", 55);
		Pessoa p2 = new Pessoa ("Zelia", "z@gmail.com", 25);
		Pessoa p3 = new Pessoa ("Jurena", "j@gmail.com", 14);
	
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
	
		Collections.sort(pessoas);
		System.out.println(pessoas);
		
	}
	
	

}
