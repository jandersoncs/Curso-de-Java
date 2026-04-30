package main.java.herancacomsuper;

public class Estudante extends Pessoa {
    private int matricula;
    Estudante(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public void imprimir(){
        System.out.println("Matricula: " + matricula + " | Nome: " + getNome() + " | Idade: " + getIdade());
    }
}
