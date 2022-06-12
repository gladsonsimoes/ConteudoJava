package com.company.logica_de_programacao.estrutura_de_decisao;


/*
Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova.
 Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.

A prova, no total, vale 200 pontos - 100 para cada matéria.

 A nota mínima total para passar é igual ou maior que 150.

Entretanto, o candidato não pode tirar menos do que 60 pontos
em qualquer uma das duas matérias, ou seja,

se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150)
ele não conseguirá a vaga.
No final mostre para o candidato se ele conseguiu ou não.
 */


import java.util.Scanner;

public class Exercicio01 {
    static final int NOTA_MINIMA = 150;
    static final int NOTA_MEDIA = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite a sua nota de português: ");
        int notaInformadaDePortugues = scanner.nextInt();
        System.out.print("Digite a nota de Matemática: ");
        int notaInformadaDeMatematica = scanner.nextInt();
        int somanotas = notaInformadaDeMatematica + notaInformadaDePortugues;
        boolean mediaDasDuasNotas = notaInformadaDeMatematica >= NOTA_MEDIA & notaInformadaDePortugues >= NOTA_MEDIA;
        boolean notaFinal = somanotas >= NOTA_MINIMA;
        System.out.println("\nNota Total : " + somanotas + " pontos");
        System.out.println("\nMatematica: " + notaInformadaDeMatematica + " pontos");
        System.out.println("\nPortugues: " + notaInformadaDePortugues + " pontos");
        if (notaFinal & mediaDasDuasNotas) {
            System.out.print("\nEntão o aluno conseguirá a vaga");
        } else {
            System.out.println("\nEntão o aluno não conseguirá a vaga");
        }
    }
}
