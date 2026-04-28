package VerificaçãodeAprovação;
import java.util.Scanner;

public class VerificacaodeAprovacao {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int nota1;
        int nota2;
        int presenca;
        int diasDeAula;
        System.out.println("============== Bem vindo ao verificador de média ============================================");
        System.out.println("Digite o primeiro nota: ");
        nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextInt();
        System.out.println("Quantos dias de aulas tiveram? ");
        diasDeAula = sc.nextInt();
        System.out.println("Quantos dias de presenca? ");
        presenca = sc.nextInt();
        String media = (((nota1 + nota2)/2)>=7 && (diasDeAula * 0.75)<=presenca) ? "Parabén! Você foi Aprovado" : "Infelizmente você foi Reprovado";
        System.out.println(media);
        sc.close();
        System.out.println("=============================================================================================");
    }
}
