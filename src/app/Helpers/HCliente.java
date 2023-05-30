package app.Helpers;

import app.Database.Querys;
import java.util.ArrayList;

public class HCliente {
    public static void printaSelect(ArrayList<String> select) {
        Querys comandos = new Querys();
        int quantidade_colunas_clientes = comandos.obterQuantidadeDeColunas("clientes");
        int tamanho = ((select.size()) / quantidade_colunas_clientes);
        System.out.println(tamanho);
    }
}
