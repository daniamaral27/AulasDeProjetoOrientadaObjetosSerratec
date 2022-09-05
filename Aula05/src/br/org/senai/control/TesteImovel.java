package br.org.senai.control;

import br.org.senai.model.Imovel;
import br.org.senai.model.Pessoa;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Ana", "ana@gmail.com");
		Pessoa pessoa2 = new Pessoa("Maria", "maria@gmail.com");
		
		Imovel imovel1 = new Imovel("casa", "centro", 35000., pessoa2);
		System.out.println(imovel1.getLocal()+"-"+imovel1.getPessoa().getNome());
	}

}
