/*Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo.
Caso não for possível mostre a mensagem “divisão impossível” para os valores em questão.
 */
package Exercicios_Iniciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex_1116 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N, X,Y;
        double res;
        N = sc.nextInt();
        for (int i = 0; i < N; i++){
            X = sc.nextInt();
            Y = sc.nextInt();
            if (Y != 0){
                res = (double) X / Y;
                System.out.println(String.format("%.1f",res));
            }else {
                System.out.println("divisao impossivel");
            }
        }
    }
}
