package main.java.metodoseencapsulamento;

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;


    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String atributos(){
        return "Produto: " + nome + ", Preço: " + preco + ", Quantidade em Estoque: " + quantidadeEmEstoque;
    };




}
