package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.medico;

public class exemploMedico {

	public static void main(String[] args) {
		List<medico> medicos = new ArrayList<>();
		
		medicos.add(new medico("1235", "Dani", 200.));
		medicos.add(new medico("35695", "Carla", 180.));
		medicos.add(new medico("1235", "Dani", 290.));
		Double maior = 0.0;
		String nome = "";
		
		for(medico medico : medicos ) {
			if(medico.getValorConsulta() > maior) {
				maior = medico.getValorConsulta();
			}
		System.out.println(medico);
		}
	System.out.println("O valor mai caro é: " + maior);
	System.out.println(nome);
	
	}

}
