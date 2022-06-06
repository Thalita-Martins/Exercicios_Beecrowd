/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos
em seguida.Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão
fora do intervalo, mostrando essas informações.
 */

package Exercicios_Iniciante;

import java.util.Scanner;
import java.io.IOException;
public class Ex_1072 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N, in = 0, out = 0,x;
        N = sc.nextInt();
        for (int i = 0; i < N; i++){
            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
