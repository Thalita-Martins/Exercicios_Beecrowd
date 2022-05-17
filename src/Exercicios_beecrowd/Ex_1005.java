/*Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5
(A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 */

package Exercicios_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1005 {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double media = ((3.5 * a) + (7.5 * b)) / 11;
        System.out.println(String.format("MEDIA = %.5f", media));
    }
}

