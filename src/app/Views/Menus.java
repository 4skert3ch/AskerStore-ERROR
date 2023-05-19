package app.Views;

import java.util.Scanner;

import app.App;
import app.Helpers.HMenus;

public class Menus {
    
    
    public static void MenuPrincipal() {
        System.out.println( "\r ===================** CrudAsk **==================== \r\n");

        System.out.println( "\r ( SQUAD : A Computaria | COMPANHIA : ÁskerTech ) \r");
        System.out.println( "\r Utilize as numerações para usar as funcionalidades \r\n");

        String[] options = { "Clientes", "Produto"};
        
        
       
        int i = 0;
            for (String item : options) {
                System.out.println("[" + (i+1) + "] " + item); 
                i++;
            }
       
    }


    public static void MenuCliente(){
        
        String[] options = { "Adicionar", "Atualizar", "Deletar", "Consultar"};

        int i = 0;
        for (String item : options) {
            System.out.println("[" + (i+1) + "] " + item); 
            i++;
        }
    }
    
    public static void MenuClientes() throws Exception {
        HMenus hmenus = new HMenus();
        Scanner scan = new Scanner(System.in);
        App app = new App();

        hmenus.LimparConsole();
        System.out.println( "\r ===================** Menu Clientes **==================== \r\n");

        System.out.println( "\r ( SQUAD : A Computaria | COMPANHIA : ÁskerTech ) \r");
        System.out.println( "\r Utilize as numerações a seguir para usar as funcionalidades: \r\n");

        String[] options = {" <- Voltar", "Cadastrar", "Atualizar", "Excluir", "Exibir"};
        
        for (int i = 1; i <= 4; i++) {
            for (String item : options) {
                System.out.println("[" + i++ + "]" + item); 
            }
        }
        String escolha = scan.next();
        if (escolha != "1"){
            hmenus.LimparConsole();
            app.main(options);
        }
    }

    
}
