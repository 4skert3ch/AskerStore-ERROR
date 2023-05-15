package app.Views;

public class Menus {
    public static void MenuPrincipal() {
        System.out.println( "\r ===================** CrudAsk **==================== \r\n");

        System.out.println( "\r ( SQUAD : A Computaria | COMPANHIA : ÁskerTech ) \r");
        System.out.println( "\r Utilize as numerações a seguir para usar as funcionalidades \r\n");

        String[] options = { "Clientes", "Produto"};
        
        for (int i = 1; i <= 2; i++) {
            for (String item : options) {
                System.out.println("[" + i++ + "]" + item); 
            }
        }
    }

    public static void MenuClientes() {
        System.out.println( "\r ===================** Menu Clientes**==================== \r\n");

        System.out.println( "\r ( SQUAD : A Computaria | COMPANHIA : ÁskerTech ) \r");
        System.out.println( "\r Utilize as numerações a seguir para usar as funcionalidades: \r\n");

        String[] options = { "Cadastrar", "Atualizar", "Excluir", "Exibir"};
        
        for (int i = 1; i <= 4; i++) {
            for (String item : options) {
                System.out.println("[" + i++ + "]" + item); 
            }
        }
    }

    
}
