/*Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10].
Em cada posição subsequente, coloque o dobro do valor da posição anterior. Por exemplo, se o valor
lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1173 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        num[0] = sc.nextInt();
        System.out.println("N[0] = " + num[0]);
        for (int i = 1; i < num.length; i++){
            num[i] = num[i-1] * 2;
            System.out.println("N[" + i + "] = " + num[i]);
        }
    }
}
