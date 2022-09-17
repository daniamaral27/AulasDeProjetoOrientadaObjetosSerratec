package br.edu.senai.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactorySingleton {
	private static String urlConexao = "jdbc:postgresql://localhost:5432/aulaJbdc";
	private static String usuario = "postgres";
	private static String senha = "1234";
	private static Connection connection=null;
	
	private Connection newConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(urlConexao, usuario, senha);
		} catch (SQLException e) {
			System.out.println("Não foi possivel abrir a conexao.");
		}
		return con;
	}
public Connection getConnection() {
	if (connection == null) {
		connection = newConnection();
		System.out.println("Conectado com sucesso!");
		
}
return connection;
}

}
