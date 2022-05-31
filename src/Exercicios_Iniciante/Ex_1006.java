/*Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 */

package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1006 {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double a, b, c, media;

        a = leitor.nextDouble();
        b = leitor.nextDouble();
        c = leitor.nextDouble();
        media = ((5 * c) + (2 * a) + (3 * b)) / 10;
        System.out.println(String.format("MEDIA = %.1f", media));

    }
}
