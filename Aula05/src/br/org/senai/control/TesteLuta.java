package br.org.senai.control;

import br.org.senai.model.Categoria;
import br.org.senai.model.Luta;
import br.org.senai.model.Lutador;

public class TesteLuta ex {

	public static void main(String[] args) {
		Categoria categoria1 = new Categoria("PESO PESADO");
		Categoria categoria2 = new Categoria("PESO MÉDIO");

		Lutador lutador1 = new Lutador("José", 90., 40, categoria2);
		Lutador lutador2 = new Lutador("José", 92., 43, categoria2);
		
	Luta luta = new Luta(lutador1, lutador2, false);
	
	System.out.println((luta.confirmacaoLuta()) ? "confirmada a luta":"Não confirmada");
	
	ex
	}
	

}
