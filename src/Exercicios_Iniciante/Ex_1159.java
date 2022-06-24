/* O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá
 parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma
 dos 5 pares consecutivos a partir de X, inclusive o X, se for par. Se o
 valor de entrada for 4, por exemplo, a saída deve ser 40, sendo o resultado
 da operação 4+6+8+10+12, enquanto se o valor de entrada for 11, por
 exemplo, a saída deve ser 80, que é a soma de 12+14+16+18+20.

 */

package Exercicios_Iniciante;
import java.util.Scanner;

public class Ex_1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,par = 0, cont = 0;
        x = sc.nextInt();
        while (x != 0){
            while(cont < 5){
                if (x % 2 == 0){
                    par += x;
                    cont++;
                }
                x++;
            }
            System.out.println(par);
            par = 0;
            cont = 0;
            x = sc.nextInt();
        }
    }
}
