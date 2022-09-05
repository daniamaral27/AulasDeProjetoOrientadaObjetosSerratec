package br.org.serratec.model;


public class caminhao extends veiculo {
	private Integer cargaMaxima;

	public caminhao(String chassi, String placa, String cor, Double valor, Integer cargaMaxima) {
		super(chassi, placa, cor, valor);
		this.cargaMaxima = cargaMaxima;
	}

	public Integer getCargaMaxima() {
		return cargaMaxima;
	}
	
	//sobreescrita - override
	
	@Override
	public void calcularIPVA() {
		valorIPVA = valor * 0.08;
	}

	@Override
	public String toString() {
		return super.toString() + cargaMaxima;
	}
}

