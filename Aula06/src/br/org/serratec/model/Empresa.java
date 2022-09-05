package br.org.serratec.model;

public class Empresa implements Tributacao {
	private String razaosocial;
	private Double rendimentos;
	
	
	
	public Empresa(String razaosocial, Double rendimentos) {
		super();
		this.razaosocial = razaosocial;
		this.rendimentos = rendimentos;
	}
	
	@ Override
	public String toString() {
		return "Empresa [razaoSocial=" + razaosocial + ", rendimentos: " + rendimentos + "]";
		
	}
		
	public String getRazaosocial() {
		return razaosocial;
	}
	public Double getRendimentos() {
		return rendimentos * icms;
		
	}
	public Empresa calcularICMS() {
		return null;
	}

	@Override
	public Double calcularImpostoDeRenda() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calcularImpostoDeRenda1() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
