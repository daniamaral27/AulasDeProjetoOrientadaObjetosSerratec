
public class ExemploOperadores {

	public static void main(String[] args) {
		// UM ATLETA PODERA PARTICIPAR DE UMA MARATONA CASO 
		//A IDADE SEJA SUPERIRO OU ALTURA MAIOR OU A 1.80
		int idade = 19;
		double altura = 1.65;
		//se a idade for maior que 18 ou altura maior ou igual a 1.80
		if(idade > 18 || altura >= 1.80) {
			System.out.println("Competirá");
		}			else {
			
			System.out.println("Não competirá");
 			
	
		//ternario
			//no ternario, na primeira parte a condição se ?(senao) na segunda parte o senao
		String resposta = idade > 18 || altura >= 1.80 ? "Competirá" :  "Não Compertirá";
		System.out.println(resposta);
	
		//criar duas variáveis com um valor inicial
		//e com ternário comparar qual maior valor.
		 
		//int = x; 
		//int = y;
		
	//	String x > 80 ||   y >= 
	}
	
	
}

}
