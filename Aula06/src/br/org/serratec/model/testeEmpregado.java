package br.org.serratec.model;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.GerenteAdminstrativo;

public class testeEmpregado {

	public static void main(String[] args) {
		Assistente a = new Assistente ("123", "Roni", 2500., 100.0);
		GerenteAdminstrativo ga = new GerenteAdminstrativo ("13365,", "Dani", 5000., "Administrativo");
		Diretor d = new Diretor ("26897,", "Ana", 8000., "Geral");
			
		a.aumentarSalario();
		ga.aumentarSalario();
		d.aumentarSalario();
		
		System.out.println(a);
		System.out.println(ga);
		System.out.println(d);

			
	}
	
	
	}


	