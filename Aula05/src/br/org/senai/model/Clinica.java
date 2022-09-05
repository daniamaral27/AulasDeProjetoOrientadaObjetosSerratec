package br.org.senai.model;

public class Clinica extends PlanoDeSaude {

		private String razaoSocial;
		private String cnpj;
		
		public Clinica(String empresa) {
			super(empresa, valorPago);
			this.razaoSocial = razaoSocial;
			this.cnpj = cnpj;
		}
		public String getRazaoSocial() {
			return razaoSocial;
		}
		public String getCnpj() {
			return cnpj;
		}
		
		@Override
		public String toString() {
			return "Clinica [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
		}
}
