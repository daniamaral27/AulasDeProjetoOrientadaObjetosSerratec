package br.edu.senai.listas;

import java.util.Arrays;
import java.util.List;

public class exemploListaArrays {

	public static void main(String[] args) {
	//nao pode ser alterada a lista  com "aslist"
		List<String>cores = Arrays.asList("amarelo", "verde", "azul");
	//cores.add("Branco");
		cores.set(0,  "laranja");
	System.out.println(cores);
	if(cores.isEmpty()) {
		System.out.println("A lista está vazia !");
	} else {
		System.out.println(cores);
	}
		System.out.println("A lista contém a cor Verde?" + 
	(cores.contains("verde")? "sim":"não"));

	}

} //list.of (não consegue alterar) 
