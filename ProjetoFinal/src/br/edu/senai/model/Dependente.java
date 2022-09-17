package br.edu.senai.model;

import java.time.LocalDate;
import java.util.Calendar;
import br.edu.senai.enuns.TipoDependentes;

public class Dependente extends Pessoa {
	private TipoDependentes parentesco;
	public static Integer contDependente = 0;

		
	public Dependente(String nome, String cpf, LocalDate dataNascimento, Double salarioBruto,
			TipoDependentes parentesco) {
		super(nome, cpf, dataNascimento, salarioBruto);
		this.parentesco = parentesco;
	}

	
	@Override
	public String toString() {
		return super.toString() + " Parentesco: " + parentesco;
	}

	public TipoDependentes getParentesco() {
		return parentesco;
	}

	public static Integer getContDependente() {
		return contDependente;
	}

	public static Boolean verificaDependente(LocalDate nasc1) {
		LocalDate aniversario = nasc1;
		Calendar hoje = Calendar.getInstance();

		Integer idade = hoje.get(Calendar.YEAR) - aniversario.getYear();

		if (hoje.before(aniversario)) {
			idade--;
		}
		if (idade < 18) {
			contDependente++;
			return true;
		}else {
			return false;
		}
	}
}
