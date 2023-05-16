package app.Views;

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
}
