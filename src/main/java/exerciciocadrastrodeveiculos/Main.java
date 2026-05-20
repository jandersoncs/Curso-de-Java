package main.java.exerciciocadrastrodeveiculos;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculos> bancoDeDadosLocal = GerenciadorArquivo.lerCarros();
        Scanner sc = new Scanner(System.in);
        int opcao =0;
        int idVeiculo;
        boolean encontrado = false;
        while (opcao != 5){
            System.out.println("Lista de opções:");
            System.out.println("1 - Cadastrar um novo veiculo");
            System.out.println("2 - Listar todos os veiculos");
            System.out.println("3 - Excluir um veiculo");
            System.out.println("4 - Editar um veiculo");
            System.out.println("5 - Sair");
            System.out.println("Digite o numero da opcao desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1 : System.out.println("Digite a marca do veiculo: ");
                         String marca = sc.nextLine();
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
                         int id = GerenciadorArquivo.gerarProximoId();
                         Veiculos veiculo = new Veiculos(id, marca, modelo, ano, cor, preco, tipoDeVeiculo);
                         GerenciadorArquivo.salvarCarros(veiculo);
                         System.out.println("Veiculo cadastrado com sucesso!");
                         break;

                case 2 : System.out.println("Lista de veiculos cadastrados: ");

                         for (Veiculos v : bancoDeDadosLocal){
                             System.out.println("ID: " + v.getId()
                                     +" | Marca: " + v.getMarca()
                                     +" | Modelo: " + v.getModelo()
                                     +" | Ano: " + v.getAno()
                                     +" | Cor: " + v.getCor()
                                     +" | Preco: " + v.getPreco()
                                     +" | Tipo: " + v.getTipoDeVeiculo());
                         }
                         break;

                case 3 : System.out.println("Digite o ID do veiculo que deseja excluir: ");
                         int idExcluir = sc.nextInt();
                         sc.nextLine();
                    Veiculos veiculoParaRemover = null;
                    for (Veiculos v : bancoDeDadosLocal) {
                        if (v.getId() == idExcluir) {
                            veiculoParaRemover = v;
                            break;
                        }
                    }
                    if (veiculoParaRemover != null) {
                        bancoDeDadosLocal.remove(veiculoParaRemover);
                        GerenciadorArquivo.aualizarArquivoCompleto(bancoDeDadosLocal);
                        System.out.println("Veiculo excluido com sucesso!");
                    } else {
                        System.out.println("Erro: Veículo com o ID informado não foi encontrado!");
                    }
                    break;

                case 4 :
                    System.out.println("Digite o ID do veiculo que você deseja editar: ");
                    idVeiculo = sc.nextInt();
                    sc.nextLine();
                    encontrado = false;
                    for (Veiculos v : bancoDeDadosLocal) {
                        if (v.getId() == idVeiculo) {
                            encontrado = true;
                            System.out.println("Item selecioonado para editar: " + v.getId());
                            System.out.println("ID: " + v.getId()
                                    + " | Marca: " + v.getMarca()
                                    + " | Modelo: " + v.getModelo()
                                    + " | Ano: " + v.getAno()
                                    + " | Cor: " + v.getCor()
                                    + " | Preco: " + v.getPreco()
                                    + " | Tipo: " + v.getTipoDeVeiculo());
                            System.out.println("Digite o NOVA marca (ou pressione Enter para manter): ");
                            String novaMarca = sc.nextLine();
                            System.out.println("Digite o NOVO modelo (ou pressione Enter para manter): ");
                            String novoModelo = sc.nextLine();
                            System.out.println("Digite o NOVO ano (ou pressione Enter para manter): ");
                            String novoAnoTexto = sc.nextLine();
                            System.out.println("Digite o NOVA cor (ou pressione Enter para manter): ");
                            String novaCor = sc.nextLine();
                            System.out.println("Digite o NOVO preço (ou pressione Enter para manter): ");
                            String novoPrecoTexto = sc.nextLine();
                            System.out.println("Digite o NOVO tipo de veículo (ou pressione Enter para manter): ");
                            String novoTipoDeVeiculo = sc.nextLine();
                            if (!novaMarca.trim().isEmpty()) v.setMarca(novaMarca);

                            if (!novoModelo.trim().isEmpty()) v.setModelo(novoModelo);

                            if (!novoAnoTexto.trim().isEmpty()) {
                                try {
                                    int novoAno = Integer.parseInt(novoAnoTexto.trim());
                                    v.setAno(novoAno);
                                } catch (NumberFormatException e) {
                                    System.out.println("Aviso: Ano inválido digitado. O valor antigo foi mantido.");
                                }
                            }
                            if (!novaCor.trim().isEmpty()) v.setCor(novaCor);

                            if (!novoPrecoTexto.trim().isEmpty()) {
                                try {
                                    double novoPreco = Double.parseDouble(novoAnoTexto.trim());
                                    v.setPreco(novoPreco);

                                } catch (NumberFormatException e) {
                                    System.out.println("Aviso: valor inválido digitado. O valor antigo foi mantido.");
                                }
                                if (!novoTipoDeVeiculo.trim().isEmpty()) v.setTipoDeVeiculo(novoTipoDeVeiculo);
                                break;
                            }
                            if (encontrado){
                                GerenciadorArquivo.aualizarArquivoCompleto(bancoDeDadosLocal);
                                System.out.println("Processo de edição finalizado.");
                            }else {
                                System.out.println("Erro: Veículo não encontrado.");
                            }
                        }
                    }
                    break;
                case 5 : System.out.println("Saindo...");
                        break;
            }
        }
        sc.close();
    }
}
