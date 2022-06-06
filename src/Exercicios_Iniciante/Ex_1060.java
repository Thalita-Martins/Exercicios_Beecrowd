/*Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos
(desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.
 */
package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1060 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double num;
        int i, cont = 0;
        for (i = 1; i <= 6; i++){
            num = sc.nextDouble();
            if (num > 0 ){
                cont++;
            }
        }
        System.out.println(cont + " valores positivos");
    }
}
