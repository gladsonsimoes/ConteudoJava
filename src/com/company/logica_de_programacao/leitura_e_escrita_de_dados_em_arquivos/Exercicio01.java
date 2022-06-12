package com.company.logica_de_programacao.leitura_e_escrita_de_dados_em_arquivos;

/*
Crie uma lista de tarefas e salve a lista em um arquivo
 */


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<>();

        System.out.println("Lista de Tarefas");

        for(int i = 1 ; i < 6 ; i++) {
            System.err.print(i + ". ");
            String nome =  scanner.nextLine();

            linhas.add(nome);

        }
         //path um caminho - paths varios caminhos
        Path arquivos = Paths.get("C:\\Users\\Administrador\\Desktop\\ListaDeTarefas.txt");
        Files.write(arquivos , linhas);

        scanner.close();
        System.out.println("Fim.....");

    }
}
