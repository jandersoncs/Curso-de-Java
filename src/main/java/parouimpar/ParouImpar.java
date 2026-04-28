package main.java.parouimpar;

import java.util.Scanner;

public class ParouImpar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========== Bem Vindo ao Verificador de Par ou Impar ============================");
        System.out.println("Digite o numero a ser verificado: ");
        int numero;
        numero = sc.nextInt();
        String resultado =(numero%2==0)? "Par":"Impar";
        System.out.println("O numero ( " + numero + " ) digitado é: "  + resultado);
        System.out.println("==================================================================================");
        sc.close();
    }
}
