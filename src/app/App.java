package app;
import java.util.Scanner;
import app.Database.Connection.Conexao;
import app.Helpers.HCliente;
import app.Views.Menus;

public class App {
    public static void main(String[] arg) throws Exception {
        
        HCliente hcliente = new HCliente();
        Menus menu = new Menus();
        Conexao conn = new Conexao();

        conn.main(arg);

        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();

        if(opcao == 1){
            menu.MenuCliente();
            int crudCliente = scan.nextInt();
                if (crudCliente == 1){
                }else if (crudCliente == 2){
                }else if (crudCliente == 3){
                }else if (crudCliente == 4){
                }else if (crudCliente == 5){
                    conn.Exibir(crudCliente, hcliente.getClass());
                }else{
                    System.out.println("Essa opção não existe!");
                }
        }

    }
}
