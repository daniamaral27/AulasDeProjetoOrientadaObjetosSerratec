package exerciciosIndividuais;

public class estado {
	private String nomeEstado;
	private String sigla;
	
	public estado(String nomeEstado, String sigla) {
		super();
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return this.nomeEstado + ";" + this.nomeEstado
	}

	
	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}
	
	
}
