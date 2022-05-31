/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual
o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir
mostre o valor lido e a relação de notas necessárias.
 */

package Exercicios_Iniciante;

import java.util.Scanner;

public class Ex_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, cont100 = 0,cont50 = 0, cont20 = 0, cont10 = 0, cont5 = 0, cont2 = 0, cont1 = 0, quant;

        N = sc.nextInt();
        quant = N;

        cont100 = N / 100;
        N = N % 100;
        cont50 = N /50;
        N = N % 50;
        cont20 = N / 20;
        N = N % 20;
        cont10 = N / 10;
        N = N % 10;
        cont5 = N / 5;
        N = N % 5;
        cont2 = N / 2;
        N = N % 2;
        cont1 = N / 1;
        N = N % 1;

        System.out.println(quant);
        System.out.println(cont100 +" nota(s) de R$ 100,00");
        System.out.println(cont50 + " nota(s) de R$ 50,00");
        System.out.println(cont20 + " nota(s) de R$ 20,00");
        System.out.println(cont10 + " nota(s) de R$ 10,00");
        System.out.println(cont5  + " nota(s) de R$ 5,00");
        System.out.println(cont2  + " nota(s) de R$ 2,00");
        System.out.println(cont1  + " nota(s) de R$ 1,00");

    }
}
