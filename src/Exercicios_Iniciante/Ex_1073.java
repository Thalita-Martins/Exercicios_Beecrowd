/*Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N,
inclusive N, se for o caso.
 */

package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1073 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N, x = 0;
        N = sc.nextInt();
        for (int i = 1; i <= N; i++){
            if (i % 2 == 0){
                x = i * i;
                System.out.println(i + "^2 = " + x);
            }
        }
    }
}
