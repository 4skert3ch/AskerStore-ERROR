package app.Database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
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

        String sqlClientes = "create table clientes(" +
                "id int primary key auto_increment," +
                "nome varchar(25) not null," +
                "email varchar(35)," +
                "cpf varchar(11)," +
                "telefone varchar(20)," +
                "endereco varchar(20)," +
                "DataDeNascimento date);";
        try {
            stmt.executeUpdate(sqlClientes);
        } catch (Exception e) {
            System.out.println(e);
        }

        String sqlProdutos = "create table produtos (" +
                "id_produto int primary key auto_increment," +
                "id_cliente int not null," +
                "nome varchar(50) not null," +
                "preco decimal(10, 2) not null default 0," +
                "foreign key (id_cliente) references clientes(id));";
        try {
            stmt.executeUpdate(sqlProdutos);
        } catch (Exception e) {
            System.out.println(e);
        }

        return stmt;
    }

    public boolean inserirProduto() {
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

    public boolean atualizarProduto(Connection conn) {
        String sql_select_produtos = "select COUNT(*) as Count from produtos where id_produto = ?";
        String sql_update_produtos = "update produtos set id_cliente = ?, nome = ?, preco = ? where id_produto = ?";

        int id_produto;
        int id_cliente;
        String nome;
        double preco;

        try {
            Scanner scan = new Scanner(System.in);
            PreparedStatement stmt = conn.prepareStatement(sql_select_produtos);

            System.out.println("Insira o id do produto:");
            id_produto = Integer.parseInt(scan.nextLine());
            stmt.setInt(1, id_produto);
            ResultSet rs = null;

            rs = stmt.executeQuery();
            while (rs.next()){
                if (rs.getInt("Count") == 0){
                    System.out.println("Produto inválido");
                    return false;
                }    
            }

            stmt = conn.prepareStatement(sql_update_produtos);
            stmt.setInt(4, id_produto);

            System.out.println("Insira o novo id de cliente:");
            id_cliente = Integer.parseInt(scan.nextLine());
            stmt.setInt(1, id_cliente);

            System.out.println("Insira o novo nome do produto (até 50 caracteres):");
            nome = scan.nextLine();
            stmt.setString(2, nome);

            System.out.println("Insira o novo preço do produto (até 11 caracteres):");
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

    public boolean inserirCliente() {
        String url = "jdbc:mysql://localhost:3306/askerdata";
        String usuario = "root";
        String senha = "";
        String sql_insert_clientes = "insert into clientes (nome, email, cpf, telefone, endereco, DataDeNascimento) values (?, ?, ?, ?, ?, ?);";

        String nome;
        String email;
        String cpf;
        String telefone;
        String endereco;
        Date DataDeNascimento;

        try {
            Scanner scan2 = new Scanner(System.in);
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement stmt = conn.prepareStatement(sql_insert_clientes);

            System.out.println("Caso não queira inserir um valor, digite null.");
            System.out.println("Qual o nome do cliente? (obrigatório; máximo: 25 caracteres)");
            nome = scan2.nextLine();
            stmt.setString(1, nome);

            System.out.println("Qual o email do cliente? (máximo: 35 caracteres)");
            email = scan2.nextLine();
            stmt.setString(2, email);

            System.out.println("Qual o cpf do cliente? (máximo: 11 caracteres)");
            cpf = scan2.nextLine();
            stmt.setString(3, cpf);

            System.out.println("Qual o telefone do cliente? (máximo: 20 caracteres)");
            telefone = scan2.nextLine();
            stmt.setString(4, telefone);

            System.out.println("Qual o endereço do cliente? (máximo: 20 caracteres)");
            endereco = scan2.nextLine();
            stmt.setString(5, endereco);

            System.out.println("Qual a data de nascimento do cliente?\nFormato: ano-mês-dia\nUse números!");
            DataDeNascimento = Date.valueOf(scan2.nextLine());
            stmt.setDate(6, DataDeNascimento);

            stmt.executeUpdate();
            scan2.close();
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
