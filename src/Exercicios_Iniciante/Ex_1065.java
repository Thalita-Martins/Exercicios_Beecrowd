/*Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares
e mostre esta informação.
 */

package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1065 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int num, cont = 0;
        for (int i = 0; i < 5; i++){
            num = sc.nextInt();
            if (num % 2 == 0){
                cont ++;
            }
        }
        System.out.println(cont + " valores pares");
    }
}
