package br.edu.senai.teste;

import br.edu.senai.conexao.ConnectionFactorySingleton;

import java.sql.SQLException;
import java.sql.Connection;


public class TesteConexaoSingleton {

	public void main(String[] args) {
		Connection con = ConnectionFactorySingleton.getConnection();
		
				
		

	}

}
