package main.java.setteregetters;
class Aluno {
    private String nome;


    Aluno(String nome){
        this.nome = nome;
    }
    Aluno(){};

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }



}
