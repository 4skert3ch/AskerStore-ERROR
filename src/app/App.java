package app;

import java.util.Scanner;

import app.Database.Connection.Conexao;
import app.Views.Menus;

public class App {
    
    public static void main(String[] arg) throws Exception {
        Conexao conn = new Conexao();
        Menus menu = new Menus();
        conn.main(arg);

        Scanner scan = new Scanner(System.in);
        int escolha = scan.nextInt();

        if(escolha == 1){
            menu.MenuCliente();
            int crudCliente = scan.nextInt();

                if (crudCliente == 1){

                } else if (crudCliente == 2){

                } else if (crudCliente == 3){

                } else if (crudCliente == 4){
                    conn.mostrarCliente();
                } else {
                    System.out.println("Essa opção não existe!");
                }
            
        }
 

    }
}
