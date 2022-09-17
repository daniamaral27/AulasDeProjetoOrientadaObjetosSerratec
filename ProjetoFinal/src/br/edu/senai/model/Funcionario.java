package br.edu.senai.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import br.edu.senai.enuns.FaixaInss;
import br.edu.senai.enuns.faixaIR;
import br.edu.senai.inter.Descontos;

public class Funcionario extends Pessoa implements Descontos {
	private Double salarioBruto;
	private Double descontoInss;
	private Double descontoIR;
	private Set<Dependente> dependentes = new HashSet<>();

	// POSSUI OS ATRIBUTOS DO "PAI" E OS ATRIBUTOS PROPRIO DA CLASSE
	public Funcionario(String nome, String cpf, LocalDate dataNascimento, Double salarioBruto, Set<Dependente> dependentes) {
		super(nome, cpf, dataNascimento, salarioBruto);
		this.salarioBruto = salarioBruto;
		
		}

	@Override // TOSTRING
	public String toString() {
		return super.toString() + " Salario bruto: " + salarioBruto;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public Set<Dependente> getDependentes() {
		return dependentes;
	}

	// METODOS DA INTERFACE
	/*
	 * public Integer qtdDependentes() { Integer quantDependentes = 0; Scanner sc =
	 * new Scanner(System.in);
	 * System.out.print("Digite a quantidade de dependentes: "); quantDependentes =
	 * sc.nextInt(); sc.close(); return quantDependentes; }
	 */

	public Double calcularInss() {
		descontoInss = 0.;
		if (salarioBruto <= 1212.00) {
			descontoInss = salarioBruto * FaixaInss.ALIQUOTA1.getAliquotasInss() - 0.0;
		} else if (salarioBruto <= 2427.35) {
			descontoInss = salarioBruto * FaixaInss.ALIQUOTA2.getAliquotasInss() - 18.18;
		} else if (salarioBruto <= 3641.03) {
			descontoInss = salarioBruto * FaixaInss.ALIQUOTA3.getAliquotasInss() - 91.00;
		} else if (salarioBruto <= 7087.22) {
			descontoInss = salarioBruto * FaixaInss.ALIQUOTA4.getAliquotasInss() - 163.82;
		} else {
			descontoInss = 7087.22 * FaixaInss.ALIQUOTA4.getAliquotasInss() - 163.82;
		}
		return descontoInss;
	}

	public Double calcularIr() {
		descontoIR = 0.;
		if (salarioBruto <= 1903.98) {
			descontoIR = 0.0;
		} else if (salarioBruto <= 2826.65) {
			descontoIR = ((salarioBruto - Dependente.getContDependente() * 189.59 - calcularInss())
					* faixaIR.FAIXA1.getAliquotaPorFaixa()) - 142.80;
		} else if (salarioBruto <= 3751.05) {
			descontoIR = ((salarioBruto - Dependente.getContDependente() * 189.59 - calcularInss())
					* faixaIR.FAIXA2.getAliquotaPorFaixa()) - 354.80;
		} else if (salarioBruto <= 4664.68) {
			descontoIR = ((salarioBruto - Dependente.getContDependente() * 189.59 - calcularInss())
					* faixaIR.FAIXA3.getAliquotaPorFaixa()) - 636.13;
		} else {
			descontoIR = ((salarioBruto - Dependente.getContDependente() * 189.59 - calcularInss())
					* faixaIR.FAIXA4.getAliquotaPorFaixa()) - 869.36;
		}
		return descontoIR;
	}

	@Override
	public Double calcularIr(Double descontoIR) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calcularInss(Double descontoInss) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer qtdDependentes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double tipoDependentes() {
		// TODO Auto-generated method stub
		return null;
	}

}