/*Ler um número inteiro N e calcular todos os seus divisores.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex_1157 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }
}
