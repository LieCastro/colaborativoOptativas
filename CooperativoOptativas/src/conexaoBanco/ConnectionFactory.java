package conexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() throws ClassNotFoundException{
		
		String banco = "Colaborativo";
		String drive = "org.postgresql.Driver";
		String user = "postgres";
		String senha = "postgres";
		String url = "jdbc:postgresql://localhost:5432/";
		
		try{
			Class.forName(drive);
			Connection connection = null;
			
			connection = (Connection) DriverManager.getConnection(url+banco,user,senha);
			return connection;
		}
		catch(SQLException e){
			throw new RuntimeException (e);
		}
	}
}

