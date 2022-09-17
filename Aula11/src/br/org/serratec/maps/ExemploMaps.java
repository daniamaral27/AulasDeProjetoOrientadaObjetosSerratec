package br.org.serratec.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMaps {

	public static void main(String[] args) {
		
//		LinkedHashMap<String, String> estados = new LinkedHashMap<>();
		TreeMap<String, String> estados = new TreeMap<>(); //mantem na ordem de inserção
//		Map<String, String> estados = new HashMap<>(); // não ordena com foi inserido.
		estados.put("AC", "Acre");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("MG", "Minas Gerais");
		estados.put("SP", "São Paulo");
		estados.put("SE", "Sergipe");
	
		System.out.println("--------Retorna a chave----------");
		for (String string : estados.keySet()) {
			System.out.println(string);
			
			System.out.println("====RETORNA VALORES DO MAPA======");
			for (String string2 : estados.values()) {
				System.out.println(string);
				
			}
			
			System.out.println("====RETORNA AS CHAVES VALORES DO MAPA======");
			for (Map.Entry<String, String> mapa : estados.entrySet()) {
			//	System.out.println(mapa.getKey() + "-" + mapa.getValue());
				System.out.println(mapa);
			}
			
			System.out.println(estados.descendingKeySet());
		}
	
	
	}
	
	

}
