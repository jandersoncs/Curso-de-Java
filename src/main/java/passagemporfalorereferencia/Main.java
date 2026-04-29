package main.java.passagemporfalorereferencia;

public class Main {
    static void main(String[] args) {
        Personagem naruto = new Personagem("Naruto", 100);
        naruto.retornaInformacoes();
        naruto.tentarAumentarOPoder(50);
        naruto.mudarNorme(naruto);
        naruto.retornaInformacoes();

    }
}
