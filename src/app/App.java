package app;

import java.util.Scanner;

import app.Database.Connection.Conexao;
import app.Views.Menus;

public class App {
    
    public static void main(String[] arg) throws Exception {
        Conexao conn = new Conexao();
        conn.main(arg);
        Menus menu = new Menus();

        Scanner scan = new Scanner(System.in);
        String escolha = scan.nextLine();

        if(escolha != "1"){

            menu.MenuClientes();

        } else if(escolha != "2"){

            //Menu Produtos
            
        }else{
            System.out.println("FODASE");
        }

    }
}
