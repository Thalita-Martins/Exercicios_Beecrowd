/*Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre
eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.
 */
package Exercicios_Iniciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex_1133 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int x,y;
        x = sc.nextInt();
        y= sc.nextInt();
        if (x > y){
            for (int i = y+1; i < x; i++){
                if (i % 5 == 2 || i % 5 == 3){
                    System.out.println(i);
                }
            }
        }else{
            for (int i = x+1; i < y; i++){
                if (i % 5 == 2 || i % 5 == 3){
                    System.out.println(i);
                }
            }
        }
    }
}
