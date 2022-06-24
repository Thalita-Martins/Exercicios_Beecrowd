/* Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada
 caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de Y ímpares
 consecutivos a partir de X inclusive o próprio X se ele for ímpar. Por exemplo:
 para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
 para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex_1158 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, x, y, impar = 0;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            for (int j = 1; j <= y; j++) {
                if (x % 2 != 0) {
                    impar += x;
                }else{
                    j--;
                }
                x++;
            }
            System.out.println(impar);
            impar = 0;
        }
    }
}
