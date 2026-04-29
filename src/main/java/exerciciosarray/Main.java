package main.java.exerciciosarray;

public class Main {
    static void main(String[] args) {
        double media = 0;

        double[]  notas = new double[]{5.8, 6.3, 4.1, 8.2, 3.5};
        for (double i : notas){
            System.out.println(i);
            media += i;
        }
        System.out.println("O valor da média das notas: " + media/notas.length);
    }







}
