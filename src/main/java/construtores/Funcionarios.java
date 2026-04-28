package main.java.construtores;
public class Funcionarios {


    String nome;
    String cargo;
    int idade;

    //Exemplo de construtor Full args
    Funcionarios(String nome, String cargo, int idade){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }
    //Exemplo de constutor no args
    Funcionarios(){};
    void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Idade: " + idade);
    }
}
