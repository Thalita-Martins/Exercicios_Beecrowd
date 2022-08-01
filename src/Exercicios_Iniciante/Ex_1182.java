/* Neste problema você deve ler um número que indica uma coluna de uma matriz
 na qual uma operação deve ser realizada, um caractere maiúsculo, indicando
 a operação que será realizada, e todos os elementos de uma matriz M[12][12].
 Em seguida, calcule e mostre a soma ou a média dos elementos que estão na
 área verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso
 da entrada do valor 5 para a coluna da matriz, demonstrando os elementos que
 deverão ser considerados na operação.
 */
package Exercicios_Iniciante;
import java.util.Scanner;

public class Ex_1182 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C;
        double soma = 0;
        char T;
        double [][] M = new double[12][12];
        C = sc.nextInt();
        T = sc.next().toUpperCase().charAt(0);
        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M.length; j++){
                M[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < M.length; i++){
            soma += M[i][C];
        }
        if (T == 'M') soma /= M.length;
        System.out.println(String.format("%.1f", soma));
    }
}
