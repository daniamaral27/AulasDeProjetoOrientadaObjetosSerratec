package br.org.serratec.grupo;

	public enum tipoServico {
		OLEO("Troca de óleo:", 100.), LAVAGEM("Lavagem externa: ", 50.), REVISAO("Revisão Geral", 200.);

		private String tipoServico;
		private Double valorPorServico;

		private tipoServico(String tipoServico, Double valorPorServico) {
			this.tipoServico = tipoServico;
			this.valorPorServico = valorPorServico;
		}

		public String getTipoServico() {
			return tipoServico;
		}

		public Double getValorPorServico() {
			return valorPorServico;
		}

	}
