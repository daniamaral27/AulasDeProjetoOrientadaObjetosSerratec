package br.org.serratec.grupo;

import java.time.LocalDate;

	public class moto extends Veiculo implements oficina {
		private int cilindradas;

		public moto(String modelo, LocalDate dataConserto, proprietario proprietario) {
			super(modelo, dataConserto, proprietario);

		}

		@Override
		public Double lavarVeiculo() {
			return null;
		}

		@Override
		public Double trocarOleo() {
			return null;
		}

		@Override
		public Double revisao() {
			return null;
		}

	}
}
