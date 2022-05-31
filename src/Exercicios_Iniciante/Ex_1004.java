/*Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua
esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.
 */

package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1004 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a, b, PROD;

        a = sc.nextInt();
        b = sc.nextInt();

        PROD = a * b;

        System.out.println("PROD = " + PROD);

    }
}
