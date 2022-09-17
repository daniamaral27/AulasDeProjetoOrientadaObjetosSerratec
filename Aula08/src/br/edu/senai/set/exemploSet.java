package br.edu.senai.set;

import java.util.Set;
import java.util.TreeSet;

public class exemploSet {

	public static void main(String[] args) {
	//	Set<String> cores = new HashSet<>();
		Set<String> cores = new TreeSet<>();
		cores.add("Azul");
		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Laranja");
		cores.add("Branco");
		System.out.println(cores);

	}

}
