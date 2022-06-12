package com.company.logica_de_programacao.vetores;
/*
Crie um vetor chamado tarefas;
Pedir ao usuário para inserir as tarefas do dia;
O sistema deverá imprimir as tarefas que foram salvas no vetor.
 */
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefas = new String[5];
        int c;
        for (c = 0; c < tarefas.length; c++) {
            System.out.print("Insira " + (c+1) + " tarefa: " );
            tarefas[c] = scanner.nextLine();
        }
        for ( c = 0 ; c< tarefas.length; c++){
            System.out.println("a " + (c+1) + " tarefa " + tarefas[c] );
        }
        }
}

