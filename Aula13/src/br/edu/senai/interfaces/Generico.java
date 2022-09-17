package br.edu.senai.interfaces;

import java.util.List;

public interface Generico <T>{

		public List<T> listar();
		
		public void inserir(T t);
		
		public void atualizar(T t);
		
		public void remover (T t);
		
		public T buscar(int codigo);
}
