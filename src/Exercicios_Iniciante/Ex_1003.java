/*Leia dois valores inteiros, no caso para variáveis A e B.
A seguir, calcule a soma entre elas e atribua à variável SOMA.
A seguir escrever o valor desta variável.
 */
package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1003 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a,b,SOMA;

        a = sc.nextInt();
        b = sc.nextInt();

        SOMA = a+b;

        System.out.println("SOMA = " + SOMA);
    }
}
