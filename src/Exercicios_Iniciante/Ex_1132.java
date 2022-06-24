/*Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos
números que não são múltiplos de 13 entre X e Y, incluindo ambos.
 */
package Exercicios_Iniciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex_1132 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int X, Y, soma = 0;
        X = sc.nextInt();
        Y = sc.nextInt();
        if (X > Y){
            for (int i = Y; i <= X; i++){
                if (i % 13 != 0){
                    soma += i;
                }
            }
        }else {
            for (int i = X; i <= Y; i++){
                if (i % 13 != 0){
                    soma += i;
                }
            }
        }
        System.out.println(soma);
    }
}
