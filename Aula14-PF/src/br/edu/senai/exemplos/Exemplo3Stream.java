package br.edu.senai.exemplos;

import java.util.Arrays;
import java.util.List;

public class Exemplo3Stream {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(10,100,200,300,400,5000);
		
		
		numeros.stream().map(t -> t + 10).forEach(t -> System.out.println(t));
		numeros.forEach(t -> System.out.println(t));
		
		System.out.println("--------------------------");
		List<String>numeros2 = Arrays.asList("30", "40", "50", "60", "70");
		numeros.stream().map(n -> new Double(n)).forEach(n -> System.out.println(n));
		
		System.out.println(numeros2.stream().map(n -> new Double(n)).count());
		
		numeros.stream().distinct().sorted().forEach(n -> System.out.println(n));
	}

}
