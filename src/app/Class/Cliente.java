package app.Class;

import java.sql.Date;

public class Cliente {

    int Id;
    String Nome;
    String Email;
    String Cpf;
    String Telefone;
    String Endereco;
    Date DataDeNascimento;

    public Cliente(int id, String nome, String email, String cpf, String telefone, String endereco,
            Date dataDeNascimento) {
        Id = id;
        Nome = nome;
        Email = email;
        Cpf = cpf;
        Telefone = telefone;
        Endereco = endereco;
        DataDeNascimento = dataDeNascimento;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public Date getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }

}
