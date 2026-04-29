package main.java.exerciciosarray1;

public class Main {
    static void main(String[] args) {
        int soma = 0;
        int[] meuArray = new int[100];


        for (int i = 0; i < meuArray.length; i++) {
            meuArray[i] = i;
            soma += meuArray[i];
        }


        System.out.println(soma);
    }
}
