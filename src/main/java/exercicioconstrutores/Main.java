package main.java.exercicioconstrutores;

public class Main {
    static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro Livro3 = new Livro("A Culpa É das Estralas", "John Green", 2012, 34.99);
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        Livro3.exibirInformacoes();
    }



}
