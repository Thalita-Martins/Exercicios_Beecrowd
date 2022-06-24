/* Leia um valor inteiro N que é a quantidade de casos de teste que vem a
 seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve
 apresentar a soma de todos os ímpares existentes entre X e Y.
*/
package Exercicios_Iniciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex_1099 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N, X, Y, total = 0;
        N = sc.nextInt();
        for (int i = 1; i <= N; i++){
            X = sc.nextInt();
            Y = sc.nextInt();
            if (Y > X) {
                for (int j = X + 1; j < Y; j++) {
                    if (j % 2 != 0) {
                        total += j;
                    }
                }
            }else if (Y < X){
                    for (int j = Y + 1; j < X; j++) {
                        if (j % 2 != 0) {
                            total += j;
                        }
                    }
                }
            System.out.println(total);
            total = 0;
            }
        }
    }

