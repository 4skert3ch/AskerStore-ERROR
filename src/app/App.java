package app;
import app.data.Connection.Conexao;

public class App {
    public static void main(String[] arg) throws Exception {
        Conexao conn = new Conexao();
        conn.main(arg);
    }
}
