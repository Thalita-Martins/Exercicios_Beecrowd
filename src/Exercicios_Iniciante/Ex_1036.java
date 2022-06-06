/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossível calcular”,
caso haja uma divisão por 0 ou raiz de número negativo.
 */
package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1036 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A, B, C, delta, R1, R2;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if (A == 0 | ((Math.pow(B, 2)) - 4 * A * C) < 0) {
            System.out.println("Impossivel calcular");
        } else {
            delta = ((Math.pow(B, 2)) - 4 * A * C);
            if (delta > 0) {
                R1 = (-(B) + (Math.sqrt(delta))) / (2 * A);
                R2 = (-(B) - (Math.sqrt(delta))) / (2 * A);
                System.out.println(String.format("R1 = %.5f", R1));
                System.out.println(String.format("R2 = %.5f", R2));
            }
        }
    }
}
