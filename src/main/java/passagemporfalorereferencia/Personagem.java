package main.java.passagemporfalorereferencia;

import java.util.Scanner;

public class Personagem {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int nivelDePoder;

    Personagem(String nome, int nivelDePoder){
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }
    public void tentarAumentarOPoder(int aumento){
        nivelDePoder += aumento;
        aumento += 500;
    }
    public void mudarNorme(Personagem personagem){
        System.out.println("Qual o novo nome do personagem?");
        nome = sc.nextLine();
    }
    public void retornaInformacoes(){
        System.out.println("Nome do personagem é: "+nome);
        System.out.println("O nivel de poder dele é: "+nivelDePoder);
    }

}
