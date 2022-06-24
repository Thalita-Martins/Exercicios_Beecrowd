/*Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
1 x N = N      2 x N = 2N        ...       10 x N = 10N
 */

package Exercicios_Iniciante;

import java.util.Scanner;
import java.io.IOException;
public class Ex_1078 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println("1 x " + n + " = " + n*1);
        System.out.println("2 x " + n + " = " + n*2);
        System.out.println("3 x " + n + " = " + n*3);
        System.out.println("4 x " + n + " = " + n*4);
        System.out.println("5 x " + n + " = " + n*5);
        System.out.println("6 x " + n + " = " + n*6);
        System.out.println("7 x " + n + " = " + n*7);
        System.out.println("8 x " + n + " = " + n*8);
        System.out.println("9 x " + n + " = " + n*9);
        System.out.println("10 x " + n + " = " + n*10);
    }
}
