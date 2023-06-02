package app;

import java.util.Scanner;
import app.Database.Querys;
import app.Database.Connection.Conexao;
import app.Views.Menus;

public class App {
    public static void main(String[] arg) throws Exception {

        Querys comandos = new Querys();

        Conexao.main(arg);

        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        if (opcao == 1) {
            Menus.MenuCliente();
            int crudCliente = 0;
            crudCliente = scan.nextInt();
            if (crudCliente == 1) {
            } else if (crudCliente == 2) {
                comandos.inserirCliente(Conexao.conexao);
            } else if (crudCliente == 3) {
            } else if (crudCliente == 4) {
            } else if (crudCliente == 5) {
                Conexao.Exibir(Conexao.conexao, "clientes");
            } else {
                System.out.println("Essa opção não existe!");
            }
        } else if (opcao == 2) {
            Menus.MenuProduto();
            int crudProduto = scan.nextInt();
            if (crudProduto == 1) {
            } else if (crudProduto == 2) {
                comandos.inserirProduto(Conexao.conexao);
            } else if (crudProduto == 3) {
            } else if (crudProduto == 4) {
            } else if (crudProduto == 5) {
                Conexao.Exibir(Conexao.conexao, "produtos");
            } else {
                System.out.println("Essa opção não existe!");
            }
        }
        scan.close();
    }
}
