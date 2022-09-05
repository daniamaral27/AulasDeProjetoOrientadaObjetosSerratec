package br.org.serratec.teste;

import br.org.serratec.model.veiculoParceiro;
import br.org.serratec.model.caminhao;

public class testeCaminhao {
	
		public static void main (String[] args) {
		caminhao c= new caminhao("123", "KYO-8239", "Preto", 6000., 5000);
		c.calcularIPVA();
		System.out.println("Valor IPVA do caminhão:" + c.getValorIPVA());
		veiculoParceiro v= new veiculoParceiro("321", "KOI-5233", "verde", 6000., 4);
		v.calcularIPVA();
		System.out.println("Valor IPVA do veiculo de passeio: "+ v.getValorIPVA());
		System.out.println(c.toString());
		System.out.println("---------------||--------------");
		System.out.println(v.toString());
		
		}		
		
	}
	

