package main.java.lacocomcontinueebreak;
public class Main {
    static void main() {
        int codigoDeSaida = 9;
        int codigoDeCarterinha = 1;
        for (;codigoDeCarterinha <= codigoDeSaida;codigoDeCarterinha++) {
            if (codigoDeCarterinha == codigoDeSaida) {
                break;
            }if (codigoDeCarterinha == 3 || codigoDeCarterinha == 7 || codigoDeCarterinha == 10) {
                 continue;
            }
            System.out.println("Esse código não é aceito pelo hospital Santa Clara: "+codigoDeCarterinha);
        }
    }
}
