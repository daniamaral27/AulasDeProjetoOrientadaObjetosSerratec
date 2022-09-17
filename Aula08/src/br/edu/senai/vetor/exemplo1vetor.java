package br.edu.senai.vetor;

public class exemplo1vetor {

	public static void main(String[] args) {
		String[] vetor = new String[3];
				vetor[0] = "Roni";
				System.out.println(vetor[0]);
		
//String[] meses = new String[] {"Janeiro, "Fevereiro", "março"};
		String [] meses = {"Jan", "Fev", "Mar", "Abr", "Maio", "Jun"};
		
		for (String mes : meses) {
			System.out.println(mes);
		}
	}

}
