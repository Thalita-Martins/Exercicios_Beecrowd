/*Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N]. A seguir,
leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição no
vetor, mostrando esta informação.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1180 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N, menor = 0, posi = 0;
        N = sc.nextInt();
        int[] X = new int[N];
        for (int i = 0; i < X.length; i++) {
            X[i] = sc.nextInt();
            if (i == 0){
                menor = X[i];
                posi = i;
            }else if (X[i] < menor){
                menor = X[i];
                posi = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posi);
    }
}