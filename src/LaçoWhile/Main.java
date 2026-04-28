package LaçoWhile;
public class Main {
    static void main() {
        int contadoDeDoces = 1;
        int quantidade = 3;
        while (contadoDeDoces <= 3) {
            System.out.println("Você ainda pode comer: "+quantidade);
            quantidade --;
            contadoDeDoces ++;
        }
    }
}
