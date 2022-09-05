package exerciciosIndividuais;

public class testeCaneta {
//instanciar é gerar objeto a partir da classe
	public static void main(String[] args) {
		Caneta c1 = new Caneta("bic Cristal ", 0.05f);
		Caneta c2 = new Caneta("Nic", 0.07f);
								
	System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta: " + c1.getPonta());	
	System.out.println("Tenho uma caneta " + c2.getModelo() + " de ponta: " + c2.getPonta());
	
		
	
	
	}

}
