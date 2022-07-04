/*Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos
 do vetor X por 1. Em seguida mostre o vetor X.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1172 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
            if (num[i] <= 0){
                num[i] = 1;
            }
            System.out.println("X[" + i + "] = " + num[i]);
        }
    }
}
