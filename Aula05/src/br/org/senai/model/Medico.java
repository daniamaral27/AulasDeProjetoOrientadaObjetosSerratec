package br.org.senai.model;

public class Medico extends PlanoDeSaude {
	private Integer crm;
	private String nome;
		
	
	public Medico(String empresa, Integer crm, String nome) {
		super(empresa);
		this.crm = crm;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Médico crm= " + crm + ", nome= " + nome;
	}
	
	public Integer getCrm() {
		return crm;
	}
	public String getNome() {
		return nome;
	}
	
	@Override
	public Double calcularPagamento() {
		return valorPago = super.calcularPagamento() * 1.10;
		
	}
}
