package br.org.serratec.model;

public class veiculo {
	protected String chassi;
	protected String placa;
	protected String cor;
	protected Double valor;
	protected Double valorIPVA;

	public veiculo(String chassi, String placa, String cor, Double valor) {
		super();
		this.chassi = chassi;
		this.placa = placa;
		this.cor = cor;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return chassi + "\n" + placa + "\n" + cor + "\n";
	}
	
	public String getChassi() {
		return chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public Double getValor() {
		return valor;
	}

	public Double getValorIPVA() {
		return valorIPVA;
	}

	
	public void calcularIPVA() {
		valorIPVA = valor * 0.04;

	}
}
