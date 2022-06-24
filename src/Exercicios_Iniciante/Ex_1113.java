/* Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
 Escreva para cada X e Y uma mensagem que indique se estes valores foram
 digitados em ordem crescente ou decrescente.
*/
package Exercicios_Iniciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex_1113 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int X, Y;
        X = sc.nextInt();
        Y = sc.nextInt();
        while (X != Y){
            if (X > Y){
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }
    }
}
