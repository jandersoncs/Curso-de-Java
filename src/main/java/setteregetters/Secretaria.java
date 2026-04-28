package main.java.setteregetters;
import java.util.Scanner;

class Secretaria {
     static void main(String[] args) {
         Aluno a = new Aluno();
         Scanner sc = new Scanner(System.in);
         a.setNome(sc.nextLine());
         System.out.println(a.getNome());
     }
}
