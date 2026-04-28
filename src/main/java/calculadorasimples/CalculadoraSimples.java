package main.java.calculadorasimples;
import java.util.Scanner;

public class CalculadoraSimples {
    static void main() {
      Scanner sc = new Scanner(System.in);
      float primeiroNumero;
      float segundoNumero;
      float resultado;
      int escolha;
        System.out.println("============ Bem Vindo a Calculador Simples ======================");
        System.out.println("Digite o primeiro numero: ");
        primeiroNumero = sc.nextFloat();
        System.out.println("Digite o segundo numero: ");
        segundoNumero =  sc.nextFloat();
        System.out.println("Digite a operação desejada!");
        System.out.println("1 = soma;");
        System.out.println("2 = subtração;");
        System.out.println("3 = divisão;");
        System.out.println("4 = multiplicação;");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1->{
                resultado = primeiroNumero + segundoNumero;
                System.out.println("Resultado: " + resultado);
            }

            case 2->{
                resultado = primeiroNumero - segundoNumero;
                System.out.println("Resultado: " + resultado);
            }

            case 3->{
                resultado = primeiroNumero * segundoNumero;
                System.out.println("Resultado: " + resultado);
            }

            case 4->{
                resultado = primeiroNumero / segundoNumero;
                System.out.println("Resultado: " + resultado);
            }
            default->
                System.out.println("Opção escolhida invalida");

        }
    }
}
