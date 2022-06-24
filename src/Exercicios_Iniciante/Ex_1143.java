/*Escreva um programa que leia um valor inteiro N (1 < N < 1000).
Este N é a quantidade de linhas de saída que serão apresentadas
na execução do programa.
 */
package Exercicios_Iniciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex_1143 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int n;
        n =sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(i +" "+ i * i + " " + (i * i) * i );
        }
    }
}
