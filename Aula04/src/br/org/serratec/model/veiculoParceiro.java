package br.org.serratec.model;

public class veiculoParceiro extends veiculo {
	private Integer quantidadePortas;

	public veiculoParceiro(String chassi, String placa, String cor, Double valor, Integer quantidadePortas) {
		super(chassi, placa, cor, valor);
		this.quantidadePortas = quantidadePortas;
	}

	public Integer getQuantidadePortas() {
		return quantidadePortas;
	}
	
	public void calcularIPVA() {
		valorIPVA = valor * 0.04;
	}
}
