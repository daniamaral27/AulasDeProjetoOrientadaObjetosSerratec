package br.edu.senai.teste;

public class vetorEmpregado {

	public static void main(String[] args) {
		Empregado[] empregados = new Empregado[3];
		
		empregados[0] = new Empregado("Lucas", "1236547");
		empregados[1] = new Empregado("Dani", "1986547");
		empregados[2] = new Empregado("Alice", "456987");

		for(Empregado empregado: empregados) {
		System.out.println(empregado);
	}
	
}
}
