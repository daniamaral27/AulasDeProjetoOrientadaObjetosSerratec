package br.org.senai.model;

public class PlanoDeSaude {

	protected String empresa;
	protected Double valorPago=80.0;
	protected Double valorISS=5.0;
	
	public PlanoDeSaude(String empresa) {
		super();
		this.empresa = empresa;
		this.valorPago = valorPago;
		this.valorISS = valorISS;
	}
	public String getEmpresa() {
		return empresa;
	}
	
	public Double getValorPago() {
		return valorPago;
	}
	public Double getValorISS() {
		return valorISS;
	}

	public Double calcularPagamento() {
		valorPago = valorPago - valorPago * valorISS/100;
		return valorPago;
				
	}
	
}
	