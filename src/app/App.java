package app;

import java.util.Scanner;

import app.Database.Connection.Conexao;

public class App {
    
    public static void main(String[] arg) throws Exception {
        Conexao conn = new Conexao();
        conn.main(arg);

        Scanner scan = new Scanner(System.in);
        int escolha = scan.nextInt();

        if(escolha == 1){
            System.out.println("teste");
            conn.mostrarCliente();
        }
 

    }
}
