package br.org.serratec.teste;

public class TesteEmpregado {

	public static void main(String[] args) {
		Tecnico tecnico = new Tecnico("Jorge", "jorge@gmail.com", 5800.);
		//polimorfismo  acontece somente na herança
		Programador programador = new Programador("Maria", "maria@gmail.com", 6200., "Phyton");
		Empregado empregado = new Tecnico("Ana", "ana@gmail.com", 1300.);
		Empregado empregado = tecnico;
		empregado = programador;
		System.out.println(tecnico);
		

		CalcularSalario cs = new CalcularSalario();
		cs.folhaPagamento(empregado);
	}

}
