package app.Database.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;

import app.Views.Menus;
import app.Database.Querys;

public class Conexao {
    public static Connection conexao = null;
    public static Querys _querys = null;
    static String url = "jdbc:mysql://localhost:3306/askerdata";
     
    public static void main(String[] args) throws InterruptedException {
        _querys = new Querys();
        
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Cria a conexão
            String url = "jdbc:mysql://localhost:3306/askerdata";
            String usuario = "root";
            String senha = "";

            conexao = DriverManager.getConnection(url, usuario, senha);
            StatementsQuerys(conexao);          

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

    public static Statement StatementsQuerys(Connection conn) throws SQLException, InterruptedException {
         _querys = new Querys();
        Menus menu = new Menus();
        Statement stmt = conn.createStatement();
        try {
            int max = 22;
            _querys.CriarTabelas(conn);
            System.out.println("Criando tabelas do sistema...");
            for (int i = 0; i <= max; i++) {
                Thread.sleep(100);
                System.out.print(String.format("\r%s", progressBar(i, max)));
            }
            menu.MenuPrincipal();
            System.out.println("\nSucesso tabelas criadas");
        } catch (SQLSyntaxErrorException e) {
            System.out.println(" - Tabelas [OK]");
            menu.MenuPrincipal();
        }
        return stmt;
    }

    public static void mostrarCliente() throws SQLException {
        try {
        conexao = DriverManager.getConnection(url);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
     ArrayList<String> cliente = _querys.Consultas(conexao);
     System.out.println("teste");
     System.out.println(cliente.get(0));
    }

    public static String progressBar(int currentValue, int maxValue) {
        int progressBarLength = 33; //
        if (progressBarLength < 9 || progressBarLength % 2 == 0) {
            throw new ArithmeticException("formattedPercent.length() = 9! + even number of chars (one for each side)");
        }
        int currentProgressBarIndex = (int) Math.ceil(((double) progressBarLength / maxValue) * currentValue);
        String formattedPercent = String.format(" %5.1f %% ",
                (100 * currentProgressBarIndex) / (double) progressBarLength);
        int percentStartIndex = ((progressBarLength - formattedPercent.length()) / 2);

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int progressBarIndex = 0; progressBarIndex < progressBarLength; progressBarIndex++) {
            if (progressBarIndex <= percentStartIndex - 1
                    || progressBarIndex >= percentStartIndex + formattedPercent.length()) {
                sb.append(currentProgressBarIndex <= progressBarIndex ? " " : "=");
            } else if (progressBarIndex == percentStartIndex) {
                sb.append(formattedPercent);
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
