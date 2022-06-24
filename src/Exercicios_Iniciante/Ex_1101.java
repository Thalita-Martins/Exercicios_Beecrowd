/* Leia um conjunto não determinado de pares de valores M e N (parar quando
 algum dos valores for menor ou igual a zero). Para cada par lido, mostre
 a sequência do menor até o maior e a soma dos inteiros consecutivos entre
 eles (incluindo o N e M)
*/
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1101 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int M, N;
        M = sc.nextInt();
        N = sc.nextInt();
        while (M > 0 && N > 0) {
            int soma = 0;
            if (M > N) {
                for (int i = N; i <= M; i++) {
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.println("Sum=" + soma);
            } else {
                for (int i = M; i <= N; i++) {
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.println("Sum=" + soma);
            }
            M = sc.nextInt();
            N = sc.nextInt();
        }
    }
}
