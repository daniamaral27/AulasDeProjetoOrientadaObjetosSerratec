package br.org.senai.model;

import java.util.Iterator;

public class Time {
	private String nometime;
	private String nomeTreinador;
	private Atleta[] atletas;
	public Time(String nometime, String nomeTreinador, Atleta[] atletas) {
		super();
		this.nometime = nometime;
		this.nomeTreinador = nomeTreinador;
		this.atletas = atletas;
	}
	public String getNometime() {
		return nometime;
	}
	public String getNomeTreinador() {
		return nomeTreinador;
	}
	public Atleta[] getAtletas() {
		return atletas;
	}
	
	public void adicionarAtletas(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			atletas[i] == null) {
				altetas[i] = atleta;
				break;
			}
		}
	}
	public void listarAtletas() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println(atletas[i].getClass());
			
		}
	}
}
