/*Este programa deve ler uma variável inteira X inúmeras vezes (deve parar quando o valor no arquivo
de entrada for igual a zero). Para cada valor lido imprima a sequência de 1 até X, com um espaço entre
cada número e seu sucessor.

Obs: cuide para não deixar espaço em branco após o último valor apresentado na linha ou receberá Presentation Error.
 */

package Exercicios_Iniciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex_1146 {
    public static void main(String[] args) throws IOException {
        Scanner sc  = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        while (x != 0){
            for (int i = 1; i <= x; i++) {
                if (i == x) {
                    System.out.println(i);
                } else {
                    System.out.print(i + "\n");
                }
            }
               x = sc.nextInt();
        }
    }
}
