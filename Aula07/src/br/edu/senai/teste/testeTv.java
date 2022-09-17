package br.edu.senai.teste;

import br.edu.senai.model.Tv;
import br.edu.senai.model.enums.marcaTv;

public class testeTv {
	
	public static void main(String[] args) {
	Tv tv = new Tv("SN/2332", 42., marcaTv.PHILCO);
	System.out.println(tv);
}

}
