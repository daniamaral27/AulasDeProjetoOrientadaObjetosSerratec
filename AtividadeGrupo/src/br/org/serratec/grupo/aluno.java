package br.org.serratec.grupo;

public class aluno {
private String nome;
private Double nota1;
private Double nota2;
private Double calcularMedia;

public aluno(String nome, Double nota1, Double nota2) {
	super();
	this.nome = nome;
	this.nota1 = nota1;
	this.nota2 = nota2;
}
public String getNome() {
	return nome;
}
public Double getNota1() {
	return nota1;
}
public Double getNota2() {
	return nota2;
}
public Double calcularMedia() {
	if (nota1 < 0 || nota1 > 10) {
		System.out.println("Sua média foi: " + calcularMedia);
	} else {
		System.out.println("verifique novamente");
	}
	
	return calcularMedia;
}
	
}
