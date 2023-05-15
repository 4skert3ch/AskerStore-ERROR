package app;

import java.util.Scanner;

import app.Database.Connection.Conexao;

public class App {
    
    public static void main(String[] arg) throws Exception {
        Conexao conn = new Conexao();
        conn.main(arg);

        Scanner scan = new Scanner(System.in);
        String escolha = scan.nextLine();

        if(escolha == "1"){
            conn.mostrarCliente();
        }
        if(escolha == "2"){
            //Menu Produtos
        }

    }
}
