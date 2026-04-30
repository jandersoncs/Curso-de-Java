package main.java.exercicioheranca;

public class Assistente extends Funcionario{

    Assistente(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }
    @Override
    public void ganhoAnual(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getAntigoSalario());
        System.out.println("Aumento: 500" );
        System.out.println("Novo salario: " + (getSalario() + 1000));

    }


}
