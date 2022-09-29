/*Leia um caractere maiúsculo, que indica uma operação que deve ser realizada
e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média
considerando somente aqueles elementos que estão acima da diagonal principal
da matriz, conforme ilustrado abaixo (área verde). https://prnt.sc/k0vebz
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1183 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double [][] M = new double[12][12];
        double soma = 0;
        char O;
        O = sc.next().toUpperCase().charAt(0);
        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M.length; j++){
                M[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M.length; j++){
                if (j > i){
                    soma += M[i][j];
                }
            }
        }
        if (O == 'M'){
            soma /= ((M.length * M.length) - 12) / 2;
        }
        System.out.println(String.format("%.1f", soma));
    }
}
