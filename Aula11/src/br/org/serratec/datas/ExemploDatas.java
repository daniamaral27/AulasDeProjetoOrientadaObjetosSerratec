package br.org.serratec.datas;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ExemploDatas {

	public static void main(String[] args) {
		Date dataAtual = new Date();
		System.out.println(dataAtual);
		System.out.println("Dia de hoje: " + dataAtual.getDate());

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		String dataFormatada = sdf.format(dataAtual);
		System.out.println(dataFormatada);
		
	}

}
