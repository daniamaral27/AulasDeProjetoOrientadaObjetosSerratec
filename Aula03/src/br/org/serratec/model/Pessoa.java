package br.org.serratec.model;

public class Pessoa {
	private Integer codigo;
	private String nome;
	private Double peso;
	private Double altura;
	//construtor default (padrão) - vazio
	//um construtor não tem retorno e pode ter agurmento
	//um construtor não é um metodo

	public Pessoa () {
		System.out.println("Novo Objeto criado");
	}
	
	public Pessoa(Integer codigo, String nome, Double peso, Double altura) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public Pessoa(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	//Loombok (biblioteca)
	
	public Double calcularIMC() {
		Double imc = peso/(altura*altura);
		return imc;
	}

	public String resultadoIMC();{ 
				
		if (calcularIMC() < 18.5) {
			return "Abaixo do Peso";
		} else if(calcularIMC() < 24.9) {
			return "Peso ideal";
		}			else {
				return "Acima do Peso";
			}
		}
	
	
}
