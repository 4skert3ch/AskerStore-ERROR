package app;

import app.data.Connection.Conexao;

public class App {
    
    
    public static void Menu() {
        System.out.println( "\r ===================** A Computaria **====================");
        String[] options = { "ADICIONAR", "DELETAR", "ATUALIZAR", "PESQUISAR" };
        
        for (int i = 1; i <= 5; i++) {
            for (String item : options) {
                System.out.println("[" + i++ + "]" + item); 
            }
        }
    }
    
    public static void main(String[] arg) throws Exception {
        Conexao conn = new Conexao();
        conn.main(arg);
    }
}
