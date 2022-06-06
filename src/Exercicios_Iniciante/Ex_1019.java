/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
e informe-o expresso no formato horas:minutos:segundos.
 */

package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1019 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N,conthr,contmin,contseg;
        N = sc.nextInt();

        conthr = N / 3600;
        N = N % 3600;
        contmin = N / 60;
        N = N % 60;
        contseg = N;

        System.out.println(conthr + ":" + contmin + ":" + contseg);
    }
}
