/*Faça um programa que leia um valor e apresente o número de Fibonacci
correspondente a este valor lido. Lembre-se que os 2 primeiros elementos da
série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores, um ele.
Todos os cálculos de Fibonacci os valores neste problema devem caber
num inteiro de 64 bits sem sinal.
 */

package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex_1176 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, pos;
        n = sc.nextInt();
        for (int cont = 0; cont < n; cont++) {
            pos = sc.nextInt();
            long proximo, anterior = 0, atual = 1;
            for (int i = 0; i < pos; i++){
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
            System.out.println("Fib(" + pos +") = " + anterior);
        }
    }
}
