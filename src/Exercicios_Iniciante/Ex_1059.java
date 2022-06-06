/*Faça um programa que mostre os números pares entre 1 e 100, inclusive.*/

package Exercicios_Iniciante;

import java.io.IOException;

public class Ex_1059 {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
