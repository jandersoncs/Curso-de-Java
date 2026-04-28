package main.java.areadoretangulo;
import java.util.Scanner;

public class CalculadoraAreadoRetangulo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double areaRetangulo;
        System.out.println("========== Bem vindo a Calculadora da Area do Retangulo =========================");
        System.out.println("Digite a base do retangulo: ");
        base = sc.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        altura = sc.nextDouble();
        areaRetangulo = (base*altura) / 2;
        System.out.println("Area do retangulo: " + areaRetangulo);
        System.out.println("=================================================================================");
        sc.close();
    }
}
