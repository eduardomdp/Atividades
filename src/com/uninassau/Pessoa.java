package com.uninassau;

public class Pessoa {
    
    private String nome;
    private String endereco;
    private String tipo;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.tipo = "";
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, endereço: %s", nome, endereco);
    }
}
