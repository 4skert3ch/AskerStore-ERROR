package app.Class;

public class Produto {
    int Id_produto;
    int Id_cliente;
    String Nome;
    double Preco;

    // construtor
    public Produto(int id_produto, int id_cliente, String nome, double preco) {
        this.Id_produto = id_produto;
        this.Id_cliente = id_cliente;
        this.Nome = nome;
        this.Preco = preco;
    }

    // getters e setters de Id_produto
    public int getIdProduto() {
        return this.Id_produto;
    }

    public void setIdProduto(int id_produto) {
        this.Id_produto = id_produto;
    }

    // getters e setters de Id_cliente
    public int getIdCliente() {
        return this.Id_cliente;
    }

    public void setIdCliente(int id_cliente) {
        this.Id_cliente = id_cliente;
    }

    // getters e setters de Nome
    public String getNome() {
        return this.Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    // getters e setters de Preco
    public double getPreco() {
        return this.Preco;
    }

    public void setPreco(double preco) {
        this.Preco = preco;
    }
}