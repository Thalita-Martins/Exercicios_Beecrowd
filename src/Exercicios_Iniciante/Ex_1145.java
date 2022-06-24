/*Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y,
passando para a próxima linha a cada X números.
 */
package Exercicios_Iniciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex_1145 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        for (int i = 1; i <= y; i += x) {
            System.out.println(i + " " + (i + 1) + " " + (i + 2));
        }
    }
}
