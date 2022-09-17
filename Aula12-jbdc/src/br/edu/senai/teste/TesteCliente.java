package br.edu.senai.teste;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;

import br.edu.senai.conexao.ConnectionFactory;
import br.edu.senai.model.Cliente;
import br.edu.senai.persistence.ClienteDao;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(null, "Roberta", "23232323", "r@gmail.com");
		Cliente cliente2 = new Cliente(null, "mariana", "236549", "mariana@gmail.com");
		
		Connection connection = new ConnectionFactory().getConnection();
		
		
		try {
			connection.setAutoCommit(false);	
			ClienteDao clienteDao2 = new ClienteDao(cliente2);
			clienteDao2.inserirCliente(cliente1);
			ClienteDao clienteDao1 = new ClienteDao(cliente1);
			clienteDao.inserirCliente(cliente2);
			connection.rollback();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
//		ClienteDao clienteDao = new ClienteDao();
		
	//	clienteDao.inserirCliente(cliente);
	//	clienteDao.atualizarCliente(cliente);

	//	System.out.println(clienteDao.listarClientes());
	//	for (Cliente c : clienteDao.listarClientes()) {
	//		System.out.println(c);
		}
	////CRUD(CREATE REATRIEVE UPDATE DELETE)
		}
		
	