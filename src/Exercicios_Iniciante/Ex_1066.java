/*Leia 5 valores Inteiros. A seguir mostre quantos valores digitados
foram pares, quantos valores digitados foram ímpares, quantos valores
 digitados foram positivos e quantos valores digitados foram negativos.
 */

package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1066 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        double num;
        int pos = 0, par = 0, imp = 0, neg = 0;
        for (int i = 0; i < 5; i++){
            num = sc.nextDouble();
            if (num % 2 == 0){
                par++;
            }else{
                imp++;
            }
            if (num > 0){
                pos++;
            }else if (num < 0 ){
                neg++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(imp + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}
