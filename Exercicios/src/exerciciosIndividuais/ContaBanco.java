package exerciciosIndividuais;

public class ContaBanco {
	private Double numConta;
	private String tipo;
	private String dono;
	private Boolean status;
	
	public ContaBanco(Double numConta, String tipo, String dono, Boolean status) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.status = status;
	}

	public Double getNumConta() {
		return numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDono() {
		return dono;
	}

	public Boolean getStatus() {
		return status;
	}
	
	
	
	
}
