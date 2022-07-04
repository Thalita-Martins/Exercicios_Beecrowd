/*Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de
valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.
 */

package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1177 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T, i = 0;
        int [] N = new int[1000];
        T = sc.nextInt();
        while(i < 999){
            for (int j = 0; j < T; j++){
                if (i > 999) break;
                N[i] = j;
                System.out.println("N[" + i + "] = " + N[i]);
                i++;
            }
        }
    }
}
