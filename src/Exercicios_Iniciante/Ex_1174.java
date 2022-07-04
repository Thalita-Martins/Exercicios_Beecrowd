/*Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que
armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_1174 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double [] num = new double[100];
        double menor;
        DecimalFormat df = new DecimalFormat("0.0");
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextDouble();
            if (num[i] <= 10){
                menor = num[i];
                System.out.println("A["+ i + "] = " + (df.format(num[i])));
            }
        }
    }
}
