package app.Database;

import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Querys {
    /**
     * @param conn
     * @return
     * @throws SQLException
     */
    public static Statement CriarTabelas(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();

        String sql = "create table clientes("+
            "id int primary key auto_increment,"+
            "nome varchar(25) not null,"+
            "email varchar(35),"+
            "cpf varchar(11),"+
            "telefone varchar(20),"+
            "endereco varchar(20),"+
            "DataDeNascimento date);";
            try {
                stmt.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println(e);
            }
        

        return stmt;
    }

    public ArrayList<String> Consultas(Connection conn) throws SQLException {
        ArrayList<String> cliente = new ArrayList<String>();
        try {
            PreparedStatement pstm = conn.prepareStatement("select id, nome, email, cpf, telefone, endereco, datadeNascimento from clientes");
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while (rs.next()) {
                cliente.add(rs.getString("id"));
                cliente.add(rs.getString("nome"));
                cliente.add(rs.getString("email"));
                cliente.add(rs.getString("cpf"));
                cliente.add(rs.getString("telefone"));
                cliente.add(rs.getString("endereco"));
                cliente.add(rs.getString("datadeNascimento"));
            }
        } catch (Exception e) {
            System.out.println(e + "| erro select cliente");
        }
       
        return cliente;
    }

}
