package br.org.serratec.model;

import br.org.serratec.model.Casa;
import br.org.serratec.model.Imovel;
import br.org.serratec.model.Proprietario;


public class teste {

	public static void main(String[] args) {
		Proprietario proprietario1 = new Proprietario("Roni");
		Proprietario proprietario2 = new Proprietario ("Dani");
		
		Casa casa = new Casa (" Centro", 409500.0, true);
		Apartamento apto = new Apartamento ("Centro", 200654., 5);

			casa.setProprietario(proprietario1);
			apto.setProprietario(proprietario2);
			
			System.out.println("Dados do Imovel: " + casa + casa.getProprietario().getNome());
			System.out.println("Dados do Imovel: " + apto + apto.getProprietario().getNome());
			
			
		

	}

}
