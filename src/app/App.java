    package app;

import java.util.Scanner;

import app.Database.Connection.Conexao;
import app.Views.Menus;

public class App {
    
    public static void main(String[] arg) throws Exception {
        Conexao conn = new Conexao();
        conn.main(arg);
        
        Scanner scan = new Scanner(System.in);
        String escolha = scan.nextLine();

        if(escolha == "1"){
            //Menu Clientes
        }
        if(escolha == "2"){
            //Menu Produtos
        }

    }
}
