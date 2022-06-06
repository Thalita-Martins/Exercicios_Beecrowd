/*Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X,
um valor por linha, inclusive o X ser for o caso.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1070 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int x,i = 0;
        x = sc.nextInt();
        while (i < 6){
            if (x % 2 == 1){
                System.out.println(x);
                i++;
            }
            x++;
        }
    }
}
