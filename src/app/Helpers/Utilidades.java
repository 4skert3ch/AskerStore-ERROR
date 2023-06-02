package app.Helpers;

import app.Database.Querys;
import app.Database.Connection.Conexao;

import java.util.ArrayList;

public class Utilidades {
    public static void printaSelect(ArrayList<String> select, String tabela) {
        Querys comandos = new Querys();
        int quantidade_colunas_tabela = comandos.obterQuantidadeDeColunas(Conexao.conexao, tabela);
        int tamanho = ((select.size()) / quantidade_colunas_tabela);
        System.out.println(tamanho);
    }
}
