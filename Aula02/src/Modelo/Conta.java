package Modelo;

public class Conta {
	//atributos
	public int NumeroConta;
	public String Titular;
	public double Saldo;
	
	//metodos
	//metodo sem retorno
	public void deposito(double valor) {
		Saldo =+ valor;
	}

	//metodo com retorno
	public boolean Saque(double valor) {
		if (Saldo < valor){
			return false;
		} else {
			Saldo-=valor;
			return true;
		}
	}
}


