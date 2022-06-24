/*Leia um valor inteiro N. Este valor será a quantidade de valores que
 serão lidos em seguida. Para cada valor lido, mostre uma mensagem em
 inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo
 (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0),
 embora a descrição correta seja (EVEN NULL), pois por definição zero é
 par, seu programa deverá imprimir apenas NULL.
  */

package Exercicios_Iniciante;

import java.util.Scanner;
import java.io.IOException;
public class Ex_1074 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n, num;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            num = sc.nextInt();
            if (num % 2 == 0 && num > 0) {
                System.out.println("EVEN POSITIVE");
            }else if (num % 2 != 0 && num > 0){
                System.out.println("ODD POSITIVE");
            }else if (num % 2 == 0 && num < 0){
                System.out.println("EVEN NEGATIVE");
            }else if (num % 2 != 0 && num < 0){
                System.out.println("ODD NEGATIVE");
            }else{
                System.out.println("NULL");
            }
        }
    }
}
