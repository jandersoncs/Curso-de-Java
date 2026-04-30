package main.java.exercicioheranca;

public class Main {
    static void main(String[] args) {
        Assistente assistente = new Assistente("Joao", 3000);
        assistente.addAumento(500.00);
        assistente.ganhoAnual();
    }
}
