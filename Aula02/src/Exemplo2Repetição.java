
public class Exemplo2Repetição {

	public static void main(String[] args) {
		String[]vetor = {"Ana","Maria","Carlos","Carla"};
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}	
			
			System.out.println("------------------");

			for (String nome : vetor) {
				System.out.println(nome);
				
			}

		
	}

}