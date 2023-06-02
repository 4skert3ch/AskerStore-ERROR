package app.Views;

import java.util.Scanner;
import app.Helpers.HMenus;

public class Menus {
    public static void MenuPrincipal() {

        System.out.println("\r ===================** CrudAsk **==================== \r\n");

        String[] options = { "Clientes", "Produto" };

        int i = 0;
        for (String item : options) {
            System.out.println("[" + (i + 1) + "]" + item);
            i++;
        }
    }

    public static void MenuCliente() throws Exception {
        // Scanner scan = new Scanner(System.in);

        HMenus.LimparConsole();
        System.out.println("\r ===================** Menu Clientes **==================== \r\n");

        System.out.println("\r ( SQUAD : A Computaria | COMPANHIA : ÁskerTech ) \r");
        System.out.println("\r Utilize as numerações a seguir para usar as funcionalidades: \r\n");

        String[] options = { " <- Voltar", "Cadastrar", "Atualizar", "Excluir", "Exibir" };

        int i = 0;
        for (String item : options) {
            System.out.println("[" + (i + 1) + "] " + item);
            i++;
        }
        // scan.close();
    }

    public static void MenuProduto() throws Exception {
        Scanner scan = new Scanner(System.in);

        HMenus.LimparConsole();
        System.out.println("\r ===================** Menu Produto **==================== \r\n");

        System.out.println("\r ( SQUAD : A Computaria | COMPANHIA : ÁskerTech ) \r");
        System.out.println("\r Utilize as numerações a seguir para usar as funcionalidades: \r\n");

        String[] options = { " <- Voltar", "Cadastrar", "Atualizar", "Excluir", "Exibir" };

        int i = 0;
        for (String item : options) {
            System.out.println("[" + (i + 1) + "] " + item);
            i++;
        }
        scan.close();
    }

}
