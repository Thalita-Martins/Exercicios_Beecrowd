/*Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.*/

package Exercicios_Iniciante;

import java.util.Scanner;
import java.io.IOException;
public class Ex_1075 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i < 10000; i++){
            if (i % n == 2){
                System.out.println(i);
            }
        }
    }
}
