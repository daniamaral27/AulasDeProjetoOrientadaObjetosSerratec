package br.edu.trabfinal.teste;

import java.time.LocalDate;

import br.edu.trabfinal.enuns.Dependentes;
import br.edu.trabfinal.model.Funcionario;

public class TesteCalculoSalario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("jose", "123214", LocalDate.of(1970, 5, 30), 4300.);
		Funcionario func2 = new Funcionario("maria", "123214", LocalDate.of(1990, 2, 12), 7000.00);

		 Double calculoIR = func1.calcularIr(null);
		 Double calculoInss = func1.calcularInss(null);
		 Double salarioLiquido = func1.getSalarioBruto() - calculoInss - calculoIR;

		//System.out.println(func2.calcularIr(null));
		//System.out.println(func2.calcularInss(null));

		 System.out.println("\nValor do IR: R$" + calculoIR + "\nValor do Inss: R$" +
		 calculoInss
		 + "\n\nSalário Líquido: R$" + salarioLiquido);

	}

}
