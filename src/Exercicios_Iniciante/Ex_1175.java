/*Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último,
o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1175 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[20];
        int valor;
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        for (int i = 0; i <= (num.length / 2); i++){
            valor = num[i];
            num[i] = num [num.length -1 -i];
            num[num.length - 1 - i] = valor;
        }
        for (int i = 0; i < num.length; i++){
            System.out.println("N["+ i +"] = " + num[i]);
        }
    }
}
