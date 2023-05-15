package app.Views;

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
}
