/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso
de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada
para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem
peso 3 e o terceiro valor tem peso 5.
 */

package Exercicios_Iniciante;

import java.util.Scanner;
import java.io.IOException;
public class Ex_1079 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        double num1, num2, num3, media;
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            num3 =sc.nextDouble();
            media = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10;
            System.out.println(String.format("%.1f",media));
        }
    }
}
