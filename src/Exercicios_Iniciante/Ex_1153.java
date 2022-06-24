/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex_1153 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n, num = 1;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            num *= i;
        }
        System.out.println(num);

    }
}
