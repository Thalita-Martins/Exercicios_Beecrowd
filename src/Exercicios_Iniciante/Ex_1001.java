/*Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X.
Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está
sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário,
você receberá "Presentation Error".
 */
package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1001 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a, b, x;

        a = sc.nextInt();
        b = sc.nextInt();

        x = a + b;

        System.out.println("X = " + x);

    }
}
