package main.java.arrys;

import java.sql.Array;

public class Main {
    static void main(String[] args) {
        int meuArry[];
        meuArry = new int[3];
        meuArry[0] = 5;
        meuArry[1] = 8;
        meuArry[2] = 2;

        meuArry = new int[]{5, 8, 2};
        System.out.println(meuArry[0]);
        System.out.println(meuArry[1]);
        System.out.println(meuArry[2]);

        meuArry[0] = 10;
        System.out.println("Valor alterado: " + meuArry[0]);

        for (int i = 0; i < meuArry.length; i++) {
            System.out.println(meuArry[i]);
        }

    }
}
