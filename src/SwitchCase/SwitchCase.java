package SwitchCase;
import java.util.Scanner;

public class SwitchCase {
    static void main() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Como você deseja avaliar esse atendimento? ");
        System.out.println("Lembrando que a escala vai de 1 - 5");
        System.out.println("Onde 1 corresponde para Muito insatisfeito e 5 corresponde para Muito satisfeito");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1-> System.out.println("Muito insatisfeito");
            case 2-> System.out.println("Insatisfeito");
            case 3-> System.out.println("Neuto");
            case 4-> System.out.println("Satisfeito");
            case 5-> System.out.println("Muito satisfeito");
            default -> System.out.println("Opção invalida");
        }
        System.out.println("Obrigado pela avaliação!");
        sc.close();
    }
}
