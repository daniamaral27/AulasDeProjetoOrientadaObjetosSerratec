package br.org.serratec.teste;

import br.org.serratec.model.atletaAmador;
import br.org.serratec.model.atletaProfissional;
import br.org.serratec.model.maratona;


public class TesteMaratona {

	public static void main(String[] args) {

		maratona maratona1 = new atletaAmador("João", "M", 17, 1.80, false);
		maratona maratona2 = new atletaProfissional("Marcos", "M", 18, 1.80, 75.);
		
	
		
		System.out.println(maratona1.toString());
		maratona1.getVerificarSituacao();
	
		System.out.println(maratona2.toString());
		maratona2.getVerificarSituacao();
	
	}

}
