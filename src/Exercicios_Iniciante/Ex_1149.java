/*Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma de A
 para cada i com os valores (0 <= i <= N-1). Enquanto N for negativo ou ZERO,
 um novo N(apenas N) deve ser lido.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1149 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A, N, soma = 0;
        A = sc.nextInt();
        N = sc.nextInt();

        while (N <= 0){
            N = sc.nextInt();
        }
        for (int i = 1; i <= N; i++){
            soma += A;
            A++;
        }
        System.out.println(soma);
    }
}
