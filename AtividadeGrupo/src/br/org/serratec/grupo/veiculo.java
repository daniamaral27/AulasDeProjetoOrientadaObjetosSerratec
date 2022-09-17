package br.org.serratec.grupo;

public class veiculo {
	import java.time.LocalDate;

	public abstract class veiculo implements oficina {
		protected String modelo;
		protected Double valorCobrado;
		protected LocalDate dataConserto;
		protected proprietario proprietario;

		public veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
			super();
			this.modelo = modelo;
			this.dataConserto = dataConserto;
			this.proprietario = proprietario;
		}

		@Override
		public String toString() {
			return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto
					+ ", proprietario=" + proprietario + "]";
		}

		public Double getValorCobrado() {
			return valorCobrado;
		}

	}
