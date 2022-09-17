package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.empregado;

public class exemploEmpregado {

	public static void main(String[] args) {
		List<empregado> empregados = new ArrayList<>();
		
		empregados.add(new empregado("Lucas", "1236547"));
		empregados.add(new empregado("Dani", "1986547"));
		empregados.add(new empregado("Alice", "456987"));
	//for: para cada
		for(empregado empregado : empregados) {
			System.out.println(empregado);
		}
	}
	

}


