package main.java.exerciciosarray2;

public class Main {
    static void main(String[] args) {
        int soma = 0;
        int[] meuArray = new int[101];
        for (int i = 0; i < meuArray.length; i++) {
            meuArray[i] = i;
            if (i % 2 == 0) {
                soma += meuArray[i];
            }
        }
        System.out.println(soma);
    }
}
