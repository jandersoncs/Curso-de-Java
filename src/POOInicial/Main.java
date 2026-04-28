package POOInicial;
import POOInicial.Funcionarios;
import java.util.Scanner;

public class Main extends Funcionarios{
    static void main(String[] args) {
        Funcionarios f1 = new Funcionarios();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario: ");
        f1.nome = sc.nextLine();
        System.out.println("Digite o cargo do funcionario: ");
        f1.cargo = sc.nextLine();
        System.out.println("Digite a idade do funcionario: ");
        f1.idade = sc.nextInt();
        f1.imprimir();



    }

}
