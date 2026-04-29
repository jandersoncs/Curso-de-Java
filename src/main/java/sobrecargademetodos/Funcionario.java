package main.java.sobrecargademetodos;

public class Funcionario {
    private String nome;
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome + " Salario: " + salario);
    }

    public void aumentarSalario(double porcentagem){
        salario += salario * porcentagem / 100;
    }

    public void aumentarSalario(int aumento ){
        salario += aumento;
    }
}
