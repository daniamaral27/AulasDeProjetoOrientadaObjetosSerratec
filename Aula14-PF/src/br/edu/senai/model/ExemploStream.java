package br.edu.senai.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {
		List<String> times = Arrays.asList("Flamengo", "Fluminense", "Vasco", "Botafogo");
		times.forEach(t-> System.out.println(t));
//Stream - metodos que permite algumas transformacoes, filtros e outras operacoes
		
		times.stream().map(t -> t.substring(0,3)).forEach(t -> System.out.println(t));
		List<String> timesAbreviados = times.stream().map(t -> t.substring(0,3)).collect(Collectors.toList());
		
		
		//pegou a lista, transformou em string, depois fez um map que é transformar
	//a string, reduzindo para 3 letras, for each pega o map e transforma no que
	//o map pediu. 
		
	}

}
