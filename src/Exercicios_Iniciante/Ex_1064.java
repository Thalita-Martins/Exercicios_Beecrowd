/*Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha,
deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
 */

package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1064 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        double num, media = 0;
        int cont = 0;
        for (int i = 1; i <= 6; i++){
            num = sc.nextDouble();
            if (num > 0){
                media += num;
                cont++;
            }
        }
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media / cont));
    }
}
