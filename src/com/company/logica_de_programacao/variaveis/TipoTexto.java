package com.company.logica_de_programacao.variaveis;

import java.util.Scanner;

    public class TipoTexto {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //String pode ser usado tanto palavra ou uma letra!

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println(" Olá " + nome + "!");

            //Character só pode ser Usado uma Letra (também um simbolo ou um numero)

            System.out.print("Digite uma letra: ");
            Character letra = scanner.nextLine().charAt(0);

            System.out.println("letra digitada: " + letra);


        }
    }
