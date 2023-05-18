package app.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

public class Querys {
    /**
     * @param conn
     * @return
     * @throws SQLException
     */
    public static Statement CriarTabelas(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();

        String sql;
        sql = "CREATE TABLE clientes1 (id INT NOT NULL AUTO_INCREMENT, nome VARCHAR(50) NOT NULL, idade INT NOT NULL, PRIMARY KEY (id))";
        stmt.executeUpdate(sql);
        sql = "CREATE TABLE clientes (id INT NOT NULL AUTO_INCREMENT, nome VARCHAR(50) NOT NULL, idade INT NOT NULL, PRIMARY KEY (id))";
        stmt.executeUpdate(sql);

        return stmt;
    }

    public static ArrayList<String> RetornaCamposTabela(Connection conn, String tabela ) throws SQLException {
        Statement stmt = conn.createStatement();

        ResultSet rs = null;

        ArrayList<String> campos = new ArrayList();

        String sql;
        sql = "SELECT * FROM INFORMATION_SCHEMA.COLUMNS" +
              "WHERE TABLE_NAME = " + tabela;
        
        rs = stmt.executeQuery(sql);      

        while (rs.next()) {                
            campos.add(rs.getString("column_names"));
        }

        return campos;
    }

    // public static Statement Consultas(Connection conn ) throws SQLException {
    // Statement stmt = conn.createStatement();

    // String sql;
    // sql = "SELECT * FROM clientes";
    // stmt.executeUpdate(sql);

    // return stmt;
    // }

}
