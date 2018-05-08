package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Obter conexao com o banco
	public static Connection connPais() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost/dados?user=root&password=lucasvale");
	}
	public static Connection conn() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost/vendas?user=root&password=lucasvale");
	}

}
