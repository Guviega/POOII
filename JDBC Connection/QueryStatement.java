package org.example;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QueryStatement {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        try {PreparedStatement stm = MyConnection.getConnection().prepareStatement("SELECT * FROM Cliente");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getLong("id"));
                c.setNome(rs.getString("nome"));
                c.setIdade(rs.getInt("idade"));

                clientes.add(c);
                System.out.println(c);
            }

            MyConnection.getConnection().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}