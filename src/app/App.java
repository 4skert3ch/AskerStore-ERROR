package app;
import java.util.Scanner;
import app.Database.Connection.Conexao;
import app.Helpers.HMenus;
import app.Views.Menus;

public class App {
    public static void main(String[] arg) throws Exception {
        HMenus helper = new HMenus();
        Conexao conn = new Conexao();
        Menus menu = new Menus();

        conn.main(arg);

        Scanner scan = new Scanner(System.in);
        String escolha = scan.nextLine();

        if(escolha != "1"){      
            menu.MenuClientes();    
        }
        if(escolha != "2"){
            //Menu Produtos
        }

    }
}
