    package app;

import java.util.Scanner;
import app.Database.Querys;
import app.Database.Connection.Conexao;
import app.Helpers.HCliente;
import app.Helpers.HProduto;
import app.Views.Menus;

public class App {
    public static void main(String[] arg) throws Exception {

        Querys comandos = new Querys();

        HCliente hcliente = new HCliente();
        HProduto hproduto = new HProduto();

        Menus menu = new Menus();
        Conexao conn = new Conexao();

        conn.main(arg);
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();

        if (opcao == 1) {
            menu.MenuCliente();
            int crudCliente = scan.nextInt();
                if (crudCliente == 1){
                    // back
                }else if (crudCliente == 2){
                    // insert
                }else if (crudCliente == 3){
                    // update
                }else if (crudCliente == 4){
                    // delet
                }else if (crudCliente == 5){
                    conn.Exibir(crudCliente, hcliente.getClass());
                }else{
                    System.out.println("Essa opção não existe!");
                }
        } else if (opcao == 2){
            
        }

    }
}
