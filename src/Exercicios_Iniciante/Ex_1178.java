/*Leia um valor X. Coloque este valor na primeira posição de um vetor N[100]. Em cada posição
subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior,
conforme o exemplo abaixo. Imprima o vetor N.
 */
package Exercicios_Iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_1178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double [] N = new double[100];
        DecimalFormat df = new DecimalFormat("0.0000");
        x = sc.nextDouble();
        N[0] = x;
        for (int i = 1; i <= 99; i++){
            N[i] = N[i-1] / 2;
        }
        for (int j = 0; j < N.length; j++){
            System.out.println("N[" + j + "] = " + (df.format(N[j])));
        }
    }
}
