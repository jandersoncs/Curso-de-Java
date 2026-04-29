package main.java.atributosstatic;
import static main.java.atributosstatic.Contador.contador;
public class Main {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        System.out.println(contador);
        Contador c2 = new Contador();
        System.out.println(contador);
        Contador c3 = new Contador();
        System.out.println(contador);
    }
}
