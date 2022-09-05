package br.org.serratec.model;

public class GerenteAdminstrativo extends Empregado {
	private String nivel;

	public GerenteAdminstrativo(String cPF, String nome, Double salario, String nivel) {
		super(cPF, nome, salario);
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return super.toString() + "Nível:" + nivel;
	}
	
		public String getNivel() {
		return nivel;
	}

		@Override
		public void aumentarSalario() {
			salario *= 1.10;
		}


}
