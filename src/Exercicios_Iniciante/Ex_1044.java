/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos"
ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1044 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A,B,total;
        A = sc.nextInt();
        B = sc.nextInt();

        if((A % B == 0) || (B % A == 0)){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
