package app.Views;
import java.util.Scanner;
import app.data.Connection.Conexao;

public class Menus {
    public static void main(String[] arg) throws Exception {
        Conexao conn = new Conexao();
        MenuInicial();
    }
    
    public static void MenuInicial() {
        Scanner scan = new Scanner(System.in);
        System.out.println( "\r ===================** CrudAsk **==================== \n" );

        System.out.println( "Squad - A Computaria | Company - ÁskerTech");
        System.out.println( "Dígite os número para navegar pelo sistema  \n");

        String[] options = { "Cliente", "Produto" };
        for (int i = 1; i <= 2; i++) {
            for (String item : options) {
                System.out.println("[" + i++ + "]" + item); 
            }
        }

        String esc = scan.nextLine();
        if (esc == "1"){
            //Menu do Cliente
        }
        if (esc == "2"){
            //Menu do Produto
        }
    }


}
