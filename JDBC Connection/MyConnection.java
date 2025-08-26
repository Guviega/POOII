package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class MyConnection {

    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://107.161.183.247/humbertomo_aula", "humbertomo_aula", "Aula01Aula01!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
