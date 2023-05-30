package app.Helpers;

import app.Database.Querys;
import java.util.ArrayList;

public class HProduto {
    public static void printaSelect(ArrayList<String> select) {
        Querys comandos = new Querys();
        int quantidade_colunas_produtos = comandos.obterQuantidadeDeColunas("produtos");
        int tamanho = ((select.size()) / quantidade_colunas_produtos);
        System.out.println(tamanho);
    }
}
