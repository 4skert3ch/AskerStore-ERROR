package app;

import app.data.Connection.Conexao;

public class App {
    
    
    public static void Menu() {
        System.out.println("===================** A Computaria **====================");
        String[] options = { "ADICIONAR", "DELETAR", "ATUALIZAR", "PESQUISAR", "CRIAR TABELAS" };
        
        for (int i = 1; i <= 5; i++) {
            for (String item : options) {
                System.out.println("[" + i++ + "]" + item); 
            }
        }
    }
    
    public static void main(String[] args) throws Exception { 
        Conexao conexao = new Conexao();
        Menu();
     }
}
