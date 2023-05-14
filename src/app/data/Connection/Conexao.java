package app.data.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import app.data.Querys;



public class Conexao {
    public static void main(String[] args) {
        Querys _querys = new Querys();
        Connection conexao = null;
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Cria a conexão
            String url = "jdbc:mysql://localhost:3306/askerdata";
            String usuario = "root";
            String senha = "";

            conexao = DriverManager.getConnection(url, usuario, senha);
            StatementsQuerys(conexao);
            // Faz algo com a conexão aqui...
            Statement stmt = conexao.createStatement();
            Scanner scan = new Scanner(System.in);
            String resp = scan.next();
            if (resp == "5") {
                _querys.CriarTabelas(conexao);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Não foi possível carregar o driver JDBC");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Não foi possível obter uma conexão com o banco de dados");
            e.printStackTrace();
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    System.out.println("Não foi possível fechar a conexão com o banco de dados");
                    e.printStackTrace();
                }
            }
        }
    }

    public static Statement StatementsQuerys(Connection conn) throws SQLException {
        Querys _querys = new Querys();
        Statement stmt = conn.createStatement();
        // _querys.CriarTabelas(conn);
        return stmt;
    }
}
