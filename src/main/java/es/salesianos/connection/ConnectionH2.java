package es.salesianos.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectionH2 implements ConnectionManager {
	
	Logger logger = LogManager.getLogger();

	public Connection open(String jdbcUrl) {
		Connection conn = null;
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection(jdbcUrl, "sa", "");
		} catch (Exception e) {
			logger.error(e);
			throw new RuntimeException(e);
		}
		return conn;
	}

	public Connection executeSql(Connection conn, String sql) {
		PreparedStatement prepareStatement;
		try {
			prepareStatement = conn.prepareStatement(sql);
		prepareStatement.execute(sql);
		} catch (SQLException e) {
			logger.error(e);
		}
		return conn;
	}

	public void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			logger.error(e);
			throw new RuntimeException(e);
		}

	}

}
