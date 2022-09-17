package exerciciosIndividuais;

public class clienteBanco {

	public static void main(String[] args) {
		ContaBanco pessoa1 = new ContaBanco(1111., "CC", "Armando", 300., true);
		pessoa1.setNumConta(1111.);
		pessoa1.setDono("Armando");
		pessoa1.abrirConta("CC");
		
		ContaBanco pessoa2 = new ContaBanco(2222., "CP", "Creuza", 450., false);
		pessoa2.setNumConta(2222.);
		pessoa2.setDono("Creuza");
		pessoa2.abrirConta("CP");
		
		
		pessoa1.estadoAtual();
		pessoa2.estadoAtual();
	}

}
