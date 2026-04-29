package main.java.sobrecargademetodos;
import main.java.sobrecargademetodos.Funcionario;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        System.out.println("Bem vimo ao sistema de calculo de salario");
        System.out.println("Digite o nome do funcionario: ");
        f1.setNome(sc.nextLine());
        System.out.println("Digite o salario do funcionario: ");
        f1.setSalario(sc.nextDouble());
        System.out.println("Digite a porcentagem do aumento: ");
        f1.aumentarSalario(sc.nextDouble());
        System.out.println("Digite o nome e o salario do funcionario: ");
        Funcionario f2 = new Funcionario(sc.next(),sc.nextDouble());
        System.out.println("Digite o valor do aumento: ");
        f2.aumentarSalario(sc.nextInt());
        f1.imprimir();
        f2.imprimir();
        sc.close();
    }
}
