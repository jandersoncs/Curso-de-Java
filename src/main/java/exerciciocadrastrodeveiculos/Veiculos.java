package main.java.exerciciocadrastrodeveiculos;

public class Veiculos {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private String tipoDeVeiculo;
    private int id;

    Veiculos(int id, String marca, String modelo, int ano, String cor, double preco, String tipoDeVeiculo){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipoDeVeiculo(String tipoDeVeiculo) {
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public int getId() {
        return id;
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
    public String toCSV(){
        return id + ";" + marca + ";" + modelo + ";" + ano + ";" + cor + ";" + preco + ";" + tipoDeVeiculo;
    }


}
