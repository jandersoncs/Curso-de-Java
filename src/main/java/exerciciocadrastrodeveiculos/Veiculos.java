package main.java.exerciciocadrastrodeveiculos;

public class Veiculos {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private String tipoDeVeiculo;

    Veiculos(String marca, String modelo, int ano, String cor, double preco, String tipoDeVeiculo){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    public String getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public double getPreco() {
        return preco;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
}
