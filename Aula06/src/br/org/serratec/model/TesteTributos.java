package br.org.serratec.model;

public class TesteTributos {

	public static void main(String[] args) {
		Empresa e = new Empresa ("ACB", 259000.);
		Pessoa p = new Pessoa ("Marcos", 82000.);
		TotalizaTributos t = new TotalizaTributos();
		
		System.out.println(e + "Tributos a pagar: ICMS"
				+ e.calcularICMS() + "IR: " + e.calcularImpostoDeRenda());
		System.out.println(p+ "Tributos a pagar: IR:" + p.calcularImpostoDeRenda());
		
		t.totalGeralTributos(e);
		t.totalGeralTributos(p);
		System.out.println("Totalização dos tributos: " + t.getTotal());

	}

}
