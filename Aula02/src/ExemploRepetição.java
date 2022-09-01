
public class ExemploRepetição {

	public static void main(String[] args) {
		// ESTRUTURA DE REPETIÇÃO

		int i = 1;
		//while enquanto, faça, faça enquanto
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	System.out.println("...................");
	int j = 1;
	do {
		System.out.println(j);
		j++;
	}	while (j <= 10); 
		
	System.out.println("...................");	
	int k = 1;
	for (k = 1; k <= 10; k++) {
	if (k >= 5 && k <= 6) {
		continue;
//ou break para parar
	}
	
	System.out.println(k);	
		}

	}
	
}
