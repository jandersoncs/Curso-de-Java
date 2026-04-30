package main.java.exercicioclassesuper;

public class Carro extends Veiculo{
    @Override
    public void acelerar() {
        super.acelerar();
        System.out.println("Carro acelerando");
    }



}
