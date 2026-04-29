package main.java.exerciciosmodificadoresdeacesso;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o nome da pessoa: ");
        p1.nome = sc.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        p1.setIdade(sc.nextInt());
        System.out.println("Digite o endereco da pessoa: ");
        p1.endereco = sc.nextLine();
        p1.endereco = sc.nextLine();
        System.out.println("Digite o telefone da pessoa: ");
        p1.telefone = sc.nextLine();
        p1.detalhes();
    }
}
