package com.company.logica_de_programacao.leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:\\Users\\Administrador\\Desktop\\arquivo.txt");
        List<String> linhas = Files.readAllLines(arquivo);  
        for (int i = 0; i < linhas.size(); i++) { 
             String nome = linhas.get(i);  
            System.out.println("Jogador " + i + ": " + nome); 
            
            
            
   // O método size() da interface List em Java é usado para obter o número de elementos nesta lista. 
        //Ou seja, esse método retorna a contagem de elementos presentes nesse contêiner de lista.
        //Parâmetros: Este método não aceita nenhum parâmetro. Valor de retorno: Este método retorna o número de elementos nesta lista.
        }
    }
}
