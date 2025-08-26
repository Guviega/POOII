package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PreparedStatement {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Paulo Gomes");
        c1.setIdade(37);

        try {
            java.sql.PreparedStatement stm = MyConnection.getConnection().prepareStatement("INSERT INTO Cliente values(null, ?, ?)");
            stm.setString(1, c1.getNome());
            stm.setInt(2, c1.getIdade());
            stm.executeUpdate();
            MyConnection.getConnection().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}