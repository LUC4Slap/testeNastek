package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/produtos", "root", "12345678");
        } catch (Exception e) {
            throw new RuntimeException("Erro 1: " + e);
        }
    }
}
