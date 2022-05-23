/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A,
e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A
for par escrever a mensagem "Valores aceitos",
senão escrever "Valores nao aceitos".
 */

package Exercicios_beecrowd;

import java.util.Scanner;

public class Ex_1035 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        String res;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        res = (B > C) && (D >A) && (C+D > A + B) && (C > 0 && D >0) && ( A % 2 == 0)? "Valores aceitos" : "Valores nao aceitos";
        System.out.println(res);
    }
}
