/*Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2.
Você precisa comprar um conduite circular (veja a imagem abaixo que ilustra um conduite) de maneira
a passar os dois cabos por dentro dele:
Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos, qual o
 raio do menor círculo que possa englobar ambos os dois?
 */

package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1589 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, r1, r2, total, cont = 0;
        n = sc.nextInt();
        while (n > cont){
            r1 = sc.nextInt();
            r2 = sc.nextInt();
            total = r1 + r2;
            System.out.println(total);
            cont++;
        }
    }
}
