package main.java.exerciciosmodificadoresdeacesso;

public class Pessoa {
    public String nome;
    private int idade;
    protected String endereco;
    String telefone;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void detalhes(){
        System.out.println("Olá meu nome é: " +nome + "."
                + "\nIdade: " + idade + "."
                + "\nMoro no endereço: "+ endereco +"."
                +"\nMeu numero é: " + telefone +".");
    }



}
