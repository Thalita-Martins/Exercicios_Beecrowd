/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
 um valor por linha, inclusive o X, se for o caso.
 */

package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1067 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        for (int i = 1; i <= x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
