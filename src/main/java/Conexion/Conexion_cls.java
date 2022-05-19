package Conexion;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class Conexion_cls {
	private static BasicDataSource dataSource =null;
	
	private static DataSource getDataSource() {
		if (dataSource==null) {
			dataSource = new BasicDataSource();
			dataSource.setDriverClassName("com.mysql.jc.jdbc.Driver");
			dataSource.setUsername("root");
			dataSource.setPassword("1914");
			dataSource.setUrl("jdbc:mysql://localhost:3306/practica1");
			dataSource.setInitialSize(20);
			dataSource.setMaxIdle(15);
			dataSource.setMaxTotal(20);
			
			
			
		}
		
		
		return dataSource;
	}
	public static Connection  regresaConexion() throws SQLException {
		return getDataSource().getConnection();
		
		
	}

}
