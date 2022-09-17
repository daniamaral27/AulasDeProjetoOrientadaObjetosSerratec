package br.org.serratec;

import br.org.serratec.model.Funcionario;
import br.org.serratec.teste.MeuGenerico;

public class TesteGenerico {

	public static void main(String[] args) {
		MeuGenerico<String> mg1 = new MeuGenerico<String>("Hello !");
		MeuGenerico<Integer> mg2 = new MeuGenerico<Interger>(1000);
		MeuGenerico<Funcionario> mg3 = new MeuGenerico<Funcionario>(new Funcionario("José", "j@gmail.com", 2600));

		//qualquer coisa que tenha como super a classe funcionario
		
		MeuGenerico<? super Funcionario>
 mg4 = new MeuGenerico<Funcionario>(new Diretor ("Marcos, m@gmail.com", 9000., "Cio"));		
	}

}
