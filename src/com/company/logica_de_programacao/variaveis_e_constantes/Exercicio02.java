package com.company.logica_de_programacao.variaveis_e_constantes;

/*Crie um Programa que lê, do console, o nome e o sobrenome de uma pessoa e depois imprime o nome completo.
 *para isso, você vai precisar de duas variaveis: a primeira  você pode chamar de "nome" e a segunda  de
 *"sobrenome". Por último, você vai juntar o nome e o sobrenome em uma unica impressão.
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: " );
        String nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print( nome + " " + sobrenome );
        scanner.close();
    }
}
