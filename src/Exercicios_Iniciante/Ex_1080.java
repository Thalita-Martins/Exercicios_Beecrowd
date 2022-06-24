/*Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.*/

package Exercicios_Iniciante;

import java.util.Scanner;
import java.io.IOException;
public class Ex_1080 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, maior = 0, posi = 0;
        for (int i = 1; i <= 100; i++){
            n = sc.nextInt();
            if (n > maior){
                maior = n;
                posi = i;
            }else if (i == 1){
                maior = n;
                posi = i;
            }
        }
        System.out.println(maior);
        System.out.println(posi);
    }
}
