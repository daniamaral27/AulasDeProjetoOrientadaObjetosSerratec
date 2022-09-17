package exerciciosIndividuais;

public class ContaBanco {
	// atributos
	public Double numConta;
	protected String tipo;
	private String dono;
	private Double saldo;
	private Boolean status;

	public  void estadoAtual() {
		System.out.println("******************************");
		System.out.println("Conta: " + this.getNumConta() );
		System.out.println("Tipo: " + this.getTipo() );
		System.out.println("Dono: " + this.getDono() );
		System.out.println("Saldo: " + this.getSaldo() );
		System.out.println("Status: " + this.getStatus() );
	}
	public ContaBanco(Double numConta, String tipo, String dono, Double saldo, Boolean status) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = 0.0;
		this.status = false;

	}

//get coloca atributo e retorna com o atributo
	public Double getNumConta() {
		return numConta;
	}
//set coloca atributo seguido parametro do mesmo tipo do atributo

	public void setNumConta(Double numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
			if (tipo == "CC") {
		this.setSaldo(50.); 
}			else if (tipo == "CP") {
			this.setSaldo(150.); 
				}
			System.out.println("Conta Aberta com Sucesso");
	}
			
	public void fecharConta() {
		if(getSaldo() > 0);
		System.out.println("Você possui saldo em conta! Não poderá fecha-la");
		if (saldo < 0) {
		System.out.println("Você está com débito em sua conta");
		} else {
			setStatus(false);
		}
	}
	public void sacar(Double v){
		if(this.getStatus()) { 
			if(this.getSaldo() > v) {
}			this.setSaldo(this.getSaldo() - v);	  
			System.out.println("Saque realizado com sucesso" + this.getDono());
		} else	{
			System.out.println("Saque insuficiente");
		}
			System.out.println("Impossivel de uma conta fechada");
	}
				
		public void pagarMensal() {
			Double v;
		if (this.getTipo() == "CC") {
			v = 12.;
			} else if 
			(this.getTipo() == "CP") {
			v =20.;
			}
		  if(this.getStatus()) {
		if (this.getSaldo() > v);
			System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
		} else {			
		  System.out.println("Impossivel Pagar");}
			}
				
		public void depositar(Double v) {
		if (this.getStatus()) {
		setSaldo(getSaldo() + v); 
		System.out.println("Impossível depositar");
		}
		
		}
		}
		
		
