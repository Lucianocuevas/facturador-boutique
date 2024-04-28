
package com.facturador.LodeLidia.factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;


public class ConnectionFactory {
    
    private DataSource dataSource;
    
    public ConnectionFactory(){
        
        var pooledDataSource = new ComboPooledDataSource();
        
		pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/tienda?useTimeZone=tru&serverTimeZone=UTC");
		pooledDataSource.setUser("lucianocuevas");
		pooledDataSource.setPassword("Matias1950");
		pooledDataSource.setMaxPoolSize(5);
		
		this.dataSource = pooledDataSource;
	}
	public Connection recuperaConexion()  {
		
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
    }
    
}
