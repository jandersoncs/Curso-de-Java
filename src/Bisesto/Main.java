package Bisesto;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        System.out.println("================= Bem Vindo a Calculadora de ano bissexto ===========");
        System.out.println("Digite um ano: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if (a % 4 == 0){
            System.out.println("Esse ano é Bissexto!");
            } else {
            System.out.println("Esse ano não é Bissexto!");
        }


    }
}