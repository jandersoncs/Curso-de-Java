package main.java.switchcasestring;
import java.util.Scanner;

public class SwitchCaseString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String mes;
        System.out.println("================= Bem vindo ao verificar de dias do mes ===================================");
        System.out.println("Digite o mes (por exemplo Janeiro)");
        mes = sc.nextLine();
        String mesEscolhido = switch (mes) {
            case "Janeiro", "Março", "Julho", "Agosto", "Outubro", "Dezembro" -> "Esse mes tem 31 dias!";
            case "Abril", "Junho", "Setembro", "Novembro" -> "Esse mes tem 30 dias!";
            case "Fevereiro" -> "Esse mes tem 28 dias!";
            default -> "Mes desconhecido!";
        };
        System.out.println(mesEscolhido);
        System.out.println("===========================================================================================");
        sc.close();
    }
}
