package br.org.serratec.grupo;

public class atleta {
private String nome;
private int idade;
private String posicao;
public atleta(String nome, int idade, String posicao) {
	super();
	this.nome = nome;
	this.idade = idade;
	this.posicao = posicao;
}
@Override
public String toString() {
	return "atleta [nome=" + nome + ", idade=" + idade + ", posicao=" + posicao + "]";
}
public String getNome() {
	return nome;
}
public int getIdade() {
	return idade;
}
public String getPosicao() {
	return posicao;
}




}
