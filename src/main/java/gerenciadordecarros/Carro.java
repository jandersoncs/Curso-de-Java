package main.java.gerenciadordecarros;
class Carro {
    private String modeloDoCarro;
    private String marcaDoCarro;
    private int ano;

    Carro() {
        modeloDoCarro = "Desconhecido";
        marcaDoCarro = "Desconhecida";
        ano = 0;
    }

     Carro(String modeloDoCarro, String marcaDoCarro, int ano) {
         this.modeloDoCarro = modeloDoCarro;
         this.marcaDoCarro = marcaDoCarro;
         this.ano = ano;
     }

     public Carro(String modeloDoCarro, String marcaDoCarro) {
         this.modeloDoCarro = modeloDoCarro;
         this.marcaDoCarro = marcaDoCarro;
         ano = 0;
     }

     public String getModeloDoCarro() {
         return modeloDoCarro;
     }

     public void setModeloDoCarro(String modeloDoCarro) {
         this.modeloDoCarro = modeloDoCarro;
     }

     public String getMarcaDoCarro() {
         return marcaDoCarro;
     }

     public void setMarcaDoCarro(String marcaDoCarro) {
         this.marcaDoCarro = marcaDoCarro;
     }

     public int getAno() {
         return ano;
     }

     public void setAno(int ano) {
         this.ano = ano;
     }

     public void imprimirCarro(){
         System.out.println("Modelo: " + modeloDoCarro + " Marca: " + marcaDoCarro + " Ano: " + ano);
         System.out.println();
     }




 }
