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
            Menus.MenuCliente();
            int crudCliente = 0;
            crudCliente = scan.nextInt();
            if (crudCliente == 1) {
                // back
            } else if (crudCliente == 2) {
                // insert
            } else if (crudCliente == 3) {
                // update
            } else if (crudCliente == 4) {
                comandos.deletCliente();
            } else if (crudCliente == 5) {
                Conexao.Exibir(Conexao.conexao, "clientes");
                conn.Exibir(crudCliente, hcliente.getClass());
            } else {
                System.out.println("Essa opção não existe!");
            }
        } else if (opcao == 2) {
            menu.MenuProduto();
            int crudProduto = scan.nextInt();
            if (crudProduto == 1) {
                // back
            } else if (crudProduto == 2) {
                comandos.inserirProduto();
            } else if (crudProduto == 3) {
                // update
            } else if (crudProduto == 4) {
                // delet
            } else if (crudProduto == 5) {
                Conexao.Exibir(Conexao.conexao, "produtos");
            } else {
                System.out.println("Essa opção não existe!");
            }
        }
        scan.close();
    }
}
