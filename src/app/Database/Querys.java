package app.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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

    // public static Statement Consultas(Connection conn ) throws SQLException {
    // Statement stmt = conn.createStatement();

    // String sql;
    // sql = "SELECT * FROM clientes";
    // stmt.executeUpdate(sql);

    // return stmt;
    // }

}