package app;

import java.util.Scanner;

import app.Database.Connection.Conexao;

public class App {
    
    public static void main(String[] arg) throws Exception {
        Conexao conn = new Conexao();
        Menus menu = new Menus();

        conn.main(arg);

        Scanner scan = new Scanner(System.in);
        String escolha = scan.nextLine();

        if(escolha == "1"){
            menu.MenuClientes();
        }
        if(escolha == "2"){
            //Menu Produtos
        }

    }
}
