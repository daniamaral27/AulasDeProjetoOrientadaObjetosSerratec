package br.org.serratec.grupo;

	import java.time.LocalDate;
	import java.util.Calendar;
	import java.util.Date;

	public class carro extends veiculo  {
		private String categoria;
		
		public carro(String modelo, LocalDate dataConserto, proprietario proprietario, String categoria) {
			super(modelo, dataConserto, proprietario);
			this.categoria = categoria;
		}

		public String getCategoria() {
			return categoria;
		}

		@Override
		public Double lavarVeiculo() {
			return valorTotal += TipoServico.LAVAGEM.getValorPorServico();
		}

		public static void main(String[] args) {
			Calendar c = Calendar.getInstance();
		}
		
		@Override
		public Double trocarOleo() {
			valorCobrado += TipoServico.OLEO.getValorPorServico();
			if(LocalDate.now().getDayOfWeek().equals(DayOfWeek.now)) {
				return valorCobrado -= 50.;
			}
			return valorCobrado;
		}
		

		@Override
		public Double revisao() {
			return valorTotal += TipoServico.REVISAO.getValorPorServico();
		}

	}
}
