import java.util.Scanner;

public class MaIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome, preço e quantidade em estoque do produto: ");
        Produto p1 = new Produto(sc.next(), sc.nextDouble(), sc.nextInt());
        System.out.println("Produto criado com sucesso!");
        System.out.println("Digite o nome, preço e quantidade em estoque do produto: ");
        Produto p2 = new Produto(sc.next(), sc.nextDouble(), sc.nextInt());
        System.out.println("Produto criado com sucesso!");
        System.out.println("===========================================================");
        System.out.println("Lista de produtos:");
        System.out.println(p1.atributos());
        System.out.println(p2.atributos());
        sc.close();
    }
}
