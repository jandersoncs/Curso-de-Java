package LaçoDoWhile;
public class Main {
    static void main() {
        int numero = 10;
        int soma = 10;
        do {
            soma += --numero;
        }while (numero > 0);
        System.out.println(soma);

    }
}
