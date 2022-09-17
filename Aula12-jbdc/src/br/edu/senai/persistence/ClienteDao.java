package br.edu.senai.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.senai.conexao.ConnectionFactory;
import br.edu.senai.model.Cliente;

public class ClienteDao {
	private Connection connection;
	
	public ClienteDao(Connection con) {
		connection = con;
	
//	public ClienteDao(Connection con) {
//		connection connection = new ConnectionFactory().getConnection();
	}
public void inserirCliente(Cliente cliente) {
	try {
		String sql = "insert into cliente (nome, telefone, email) values(?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, cliente.getNome());
		stmt.setString(2, cliente.getTelefone());
		stmt.setString(3, cliente.getEmail());
		stmt.execute();
		stmt.close();
	//	connection.close();
		
	} catch (Exception e) {
		System.out.println("Não foi possível gravar o registro!");
		e.printStackTrace();
	}
		
		
	}
/*	public void atualizarCliente(Cliente cliente) {
		try {
			String sql = "update cliente set nome=?, telefone=?, email=?) where codigo=?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.setInt(4, cliente.getCodigo());
			stmt.execute();
			stmt.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println("Não foi possível alterar o registro!");
			e.printStackTrace();
		}
}


	public void atualizarCliente(Cliente cliente) {
		try {
	String sql = "update cliente set nome=?,telefone=?,email=? where codigo=?";
	PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, cliente.getNome());
		stmt.setString(2, cliente.getTelefone());
		stmt.setString(3, cliente.getEmail());
		stmt.setInt(4, cliente.getCodigo());
		stmt.execute();
		stmt.close();
		connection.close();
	} catch (Exception e) {
		System.out.println("Não foi possível alterar o registro!");
		e.printStackTrace();
	}
}

	public List<Cliente> listarClientes(String parteNome) {
		List<Cliente> clientes = new ArrayList<>();
	try {
		String sql = "select * from cliente where nome like'%" + parteNome + "%";
		PreparedStatement stmt = connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Cliente cliente = new Cliente(rs.getInt("codigo"), rs.getString("nome"), 
					rs.getString("telefone"),
					rs.getString("email"));
			clientes.add(cliente);
		}
		stmt.close();
		rs.close();
		connection.close();
	} catch (Exception e) {
		System.out.println("Erro na listagem");
		e.printStackTrace();
	}

	return clientes;
}
	
}*/




