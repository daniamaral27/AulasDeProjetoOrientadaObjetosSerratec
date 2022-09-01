
public class ExemploSwitch {

	public static void main(String[] args) {
		//O switch testa o valor de uma variável, e dependendo do valor contido nessa variável, 
		//permite executar uma entre múltiplas escolhas de
		//ações, com isto podemos substituir os múltiplos ifs utilizados em uma estrutura.
		int mes = 5;
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		
		default:
			System.out.println("Mês Inválido!");
			break;
		}
		

	}

}
