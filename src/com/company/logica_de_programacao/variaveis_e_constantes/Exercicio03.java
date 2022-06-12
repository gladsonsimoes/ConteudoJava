package com.company.logica_de_programacao.variaveis_e_constantes;

/*
 * O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação
 * lógica para saber se a nota do aluno é maior que 70. O resultado dessa operação lógica deve
 * ser atribuido a uma variável do tipo Boolean.
 *
 * Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir,
 * no console, uma mensagem que vai dizer se o aluno passou ou não passou.
 *
 */
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double notaDoAluno = scanner.nextDouble();
        boolean alunoFoiAprovado = notaDoAluno>= 70;

        if (alunoFoiAprovado) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
        scanner.close();

    }
}