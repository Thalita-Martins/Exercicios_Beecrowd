/*Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão apresentadas
 na execução do programa, seguindo a lógica do exemplo abaixo. Para valores com mais de 6
 dígitos, todos os dígitos devem ser apresentados.
 */
package Exercicios_Iniciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex_1144 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(i + " " + i * i + " " + i * i * i);
            System.out.println(i + " " + ((i * i)+1) + " " + ((i * i * i)+1));
        }
    }
}
