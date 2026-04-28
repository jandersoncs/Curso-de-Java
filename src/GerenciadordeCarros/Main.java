package GerenciadordeCarros;
import GerenciadordeCarros.Carro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Gol", "VW", 2020);
        Carro carro3 = new Carro("Mareia", "VW");
        carro1.imprimirCarro();
        carro2.imprimirCarro();
        carro3.imprimirCarro();
    }
}
