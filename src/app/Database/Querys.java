package app.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

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
            stmt.executeUpdate(sql);    
        return stmt;
    }

    public static boolean inserirProduto() {
        String url = "jdbc:mysql://localhost:3306/askerdata";
        String usuario = "root";
        String senha = "";
        String sql_insert_produtos = "insert into produtos (id_cliente, nome, preco) values (?, ?, ?);";

        int id_cliente;
        String nome;
        double preco;

        try {
            Scanner scan = new Scanner(System.in);
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement stmt = conn.prepareStatement(sql_insert_produtos);

            System.out.println("Insira o id do cliente:");
            id_cliente = Integer.parseInt(scan.nextLine());
            stmt.setInt(1, id_cliente);

            System.out.println("Insira o nome do produto (até 50 caracteres):");
            nome = scan.nextLine();
            stmt.setString(2, nome);

            System.out.println("Insira o preço do produto (até 11 caracteres):");
            // preco = Double.parseDouble(scan.nextLine());
            preco = scan.nextDouble();
            stmt.setDouble(3, preco);

            stmt.executeUpdate();
            scan.close();
            conn.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public ArrayList<String> Consultas(Connection conn) throws SQLException {
        ArrayList<String> cliente = new ArrayList<String>();
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "select id, nome, email, cpf, telefone, endereco, datadeNascimento from clientes");
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
