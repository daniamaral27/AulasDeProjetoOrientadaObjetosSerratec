package br.edu.senai.enuns;

public enum FaixaInss {
	ALIQUOTA1(0.075), ALIQUOTA2(0.09), ALIQUOTA3(0.12), ALIQUOTA4(0.14);

	private Double aliquotasInss;

	private FaixaInss(Double aliquotasInss) {
		this.aliquotasInss = aliquotasInss;
	}

	public Double getAliquotasInss() {
		return aliquotasInss;
	}

}
