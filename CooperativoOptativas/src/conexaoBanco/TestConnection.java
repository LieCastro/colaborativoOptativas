package conexaoBanco;

import java.sql.Connection;
import java.sql.SQLException;

import conexaoBanco.ConnectionFactory;

public class TestConnection {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		try{
		Connection connection = new ConnectionFactory().getConnection(); 
		System.out.println("Conex�o Aberta!");
		connection.close();
		}
		catch(SQLException e){
			System.out.println("Conex�o impedida");
		}
	}
}