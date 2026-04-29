package main.java.exercicioconstrutores;

public class Livro {
    public String titulo;
    private String autor;
    protected int anoDePublicacao;
    double preco;

    Livro(){
        titulo = "Desconhecido";
        autor = "Desconhecido";
        anoDePublicacao = 0;
        preco = 0.00;
    }
    Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        anoDePublicacao = 0;

    }
    Livro(String titulo, String autor, int anoDePublicacao, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.preco = preco;
    }
    public void exibirInformacoes(){
        System.out.println("Titulo: " +titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Ano de Publicação: " + anoDePublicacao);
        System.out.println("Valor: R$" + preco);
        System.out.println("==========================================================");
    }


}
