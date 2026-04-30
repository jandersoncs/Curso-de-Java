package main.java.exerciciocadrastrodeveiculos;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculos> listaDeVeiculos = new ArrayList<>();
        int opcao =0;
        while (opcao != 4){
            System.out.println("Lista de opções:");
            System.out.println("1 - Cadastrar um novo veiculo");
            System.out.println("2 - Listar todos os veiculos");
            System.out.println("3 - Excluir um veiculo");
            System.out.println("4 - Sair");
            System.out.println("Digite o numero da opcao desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1 : System.out.println("Digite a marca do veiculo: ");
                         String marca = sc.nextLine();
                         sc.nextLine();
                         System.out.println("Digite o modelo do veiculo: ");
                         String modelo = sc.nextLine();
                         System.out.println("Digite o ano do veiculo: ");
                         int ano = sc.nextInt();
                         sc.nextLine();
                         System.out.println("Digite a cor do veiculo: ");
                         String cor = sc.nextLine();
                         System.out.println("Digite o preco do veiculo: ");
                         double preco = sc.nextDouble();
                         sc.nextLine();
                         System.out.println("Digite o tipo de veiculo (carro, moto, etc): ");
                         String tipoDeVeiculo = sc.nextLine();
                         Veiculos veiculo = new Veiculos(marca, modelo, ano, cor, preco, tipoDeVeiculo);
                         listaDeVeiculos.add(veiculo);
                         System.out.println("Veiculo cadastrado com sucesso!");
                         break;

                case 2 : System.out.println("Lista de veiculos cadastrados: ");
                         for (Veiculos v : listaDeVeiculos){
                             System.out.println("ID: " + listaDeVeiculos.indexOf(v)
                                     +" | Marca: " + v.getMarca()
                                     +" | Modelo: " + v.getModelo()
                                     +" | Ano: " + v.getAno()
                                     +" | Cor: " + v.getCor()
                                     +" | Preco: " + v.getPreco()
                                     +" | Tipo: " + v.getTipoDeVeiculo());
                         }
                         break;

                case 3 : System.out.println("Digite o ID do veiculo que deseja excluir: ");
                         int numeroVeiculo = sc.nextInt();
                         listaDeVeiculos.remove(numeroVeiculo);
                         System.out.println("Veiculo excluido com sucesso!");
                         break;

                case 4 : System.out.println("Saindo...");
                        break;
            }
        }
        sc.close();
    }
}
