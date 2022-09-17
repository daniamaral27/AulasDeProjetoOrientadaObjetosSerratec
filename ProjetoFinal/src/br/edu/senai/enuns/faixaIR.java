package br.edu.senai.enuns;

public enum faixaIR {
	ISENTO(0.), FAIXA1(0.075), FAIXA2(0.15), FAIXA3(0.225), FAIXA4(0.275);

	private Double aliquotaIR;

	private faixaIR(Double aliquotaPorFaixa) {
		this.aliquotaIR = aliquotaPorFaixa;
	}

	public Double getAliquotaPorFaixa() {
		return aliquotaIR;
	}

}
