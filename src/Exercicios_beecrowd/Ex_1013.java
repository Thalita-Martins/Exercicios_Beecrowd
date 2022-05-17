/*Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido
da mensagem “eh o maior”. Utilize a fórmula:
MAIORAB = (a+b+abs(a-b)) / 2
 */

package Exercicios_beecrowd;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Ex_1013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b,c,maior,soma;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maior = (a + b + abs(a-b)) / 2;
        maior = (maior + c + abs(maior - c)) / 2;
        System.out.print(maior + " eh o maior");
    }
}
