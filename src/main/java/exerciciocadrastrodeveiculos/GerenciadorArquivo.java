package main.java.exerciciocadrastrodeveiculos;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class GerenciadorArquivo {
    private static final String caminhoArquivo = "C:\\Users\\jcruz\\Desktop\\Veiculos.txt";
    private static final String arquivoContador = "C:\\Users\\jcruz\\Desktop\\Contador.txt";
    private static int idAtual = 0;

    public static void salvarCarros(Veiculos veiculos){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))){
            writer.write(veiculos.toCSV());
            writer.newLine();
            System.out.println("Veículo salvo com sucesso!");
        }catch (IOException e){
            System.out.println("Erro ao salvar o veículo: " + e.getMessage());
        }
    }
    public static List<Veiculos> lerCarros(){
        List<Veiculos> listaDeCarros = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha;
            while ((linha = reader.readLine()) != null){
                String[] dados = linha.split(";");
                listaDeCarros.add(new Veiculos(Integer.parseInt(dados[0]), dados[1], dados[2], Integer.parseInt(dados[3]), dados[4], Double.parseDouble(dados[5]), dados[6].trim()));
            }
        }catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return listaDeCarros;
    }
    public static void aualizarArquivoCompleto(List<Veiculos> listaDeCarros) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Veiculos veiculo : listaDeCarros) {
                writer.write(veiculo.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao atualizar o arquivo: " + e.getMessage());
        }
    }
    public static int gerarProximoId() {
        File f = new File(arquivoContador);
        if (f.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivoContador))) {
                idAtual = Integer.parseInt(reader.readLine().trim());
            } catch (IOException | NumberFormatException e) {
                idAtual = 0;
            }
        }
        int proximoId = idAtual + 1;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoContador))) {
            writer.write(String.valueOf(proximoId));
        } catch (IOException e) {
            System.out.println("Erro ao atualizar o arquivo: " + e.getMessage());
        }

        return proximoId;
    }

}
