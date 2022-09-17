package exerciciosIndividuais;

import java.util.ArrayList;
import java.util.List;

public class contatos {
	private String nome;
	private endereco endereco;
	private List<telefone> telefones = new ArrayList<>();
	
	
	public contatos(String nome, Telefone telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}

	public endereco getEndereco() {
		return endereco;
	}

	public List<telefone> getTelefones() {
		return telefones;
	}
	
	public void mostrarTelefones() {
		System.out.println(telefones);
		
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome() + "\n" + this.endereco;
	}
}
