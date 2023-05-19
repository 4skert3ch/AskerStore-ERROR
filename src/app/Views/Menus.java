package app.Views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menus {
    public static void MenuPrincipal() {

        System.out.println( "\r ===================** CrudAsk **==================== \r\n");

        System.out.println( "\r ( SQUAD : A Computaria | COMPANHIA : ÁskerTech ) \r");
        System.out.println( "\r Utilize as numerções para usar as funcionalidades \r\n");

        String[] options = { "Clientes", "Produto"};
        
        for (int i = 1; i <= 2; i++) {
            for (String item : options) {
                System.out.println("[" + i++ + "]" + item); 
            }
        }
    }

    public static void MenuClientes() {
        System.out.println( "\r =================** Menu Clientes **================== \r\n");

        System.out.println( "\r ( SQUAD : A Computaria | COMPANHIA : ÁskerTech ) \r");
        System.out.println( "\r Utilize as numerções para usar as funcionalidades \r\n");

        String[] options = { "Criar", "Pesquisar", "Atualizar", "Deletar"};
        
        for (int i = 1; i <= 4; i++) {
            for (String item : options) {
                System.out.println("[" + i++ + "]" + item); 
            }
        }
    }

    public static void MenuProdutos() {
        System.out.println( "\r =================** Menu Produtos **================== \r\n");

        System.out.println( "\r ( SQUAD : A Computaria | COMPANHIA : ÁskerTech ) \r");
        System.out.println( "\r Utilize as numerções para usar as funcionalidades \r\n");

        String[] options = { "Criar", "Pesquisar", "Atualizar", "Deletar"};
        
        for (int i = 1; i <= 4; i++) {
            for (String item : options) {
                System.out.println("[" + i++ + "]" + item); 
            }
        }
    }
}
