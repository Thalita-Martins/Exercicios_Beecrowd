/*Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.*/

package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1071 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int num1, num2, total = 0;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (num1 < num2){
            for (int i = num1 + 1; i < num2; i++){
                if (i % 2 != 0){
                    total+= i;
                }
            }
        }else{
            for (int i = num2 +1; i < num1; i++){
                if (i % 2 !=0){
                    total+= i;
                }
            }
        }
        System.out.println(total);
    }
}
