package com.company.logica_de_programacao.leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<>();

        for(int i = 0 ; i < 5 ; i++) {
            System.out.print("Jogador " + i + ": ");
            String nome =  scanner.nextLine();

            linhas.add(nome);

        }
         //path um caminho - paths varios caminhos
        Path arquivos = Paths.get("C:\\Users\\Administrador\\Desktop\\arquivo.txt");
        Files.write(arquivos , linhas);

        scanner.close();
        System.out.println("Fim.....");
    }
}
