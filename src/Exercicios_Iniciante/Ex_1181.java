/* Neste problema você deve ler um número, indicando uma linha da matriz na
 qual uma operação deve ser realizada, um caractere maiúsculo, indicando a
 operação que será realizada, e todos os elementos de uma matriz M[12][12].
 Em seguida, calcule e mostre a soma ou a média dos elementos que estão na
 área verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso
 da entrada do valor 2 para a linha da matriz, demonstrando os elementos que
 deverão ser considerados na operação.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1181 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int L;
        double soma = 0;
        char T;
        double [][] M = new double[12][12];
        L = sc.nextInt();
        T = sc.next().toUpperCase().charAt(0);
        //vai preencher a matriz com os numeros
        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M.length; j++){
                M[i][j] = sc.nextDouble();
            }
        }
        //vai sma os elementos da linha informada pelo usuário
        for (int j = 0; j < M.length; j++){
            soma += M[L][j];
        }
        if (T == 'M') soma /= M.length;
        System.out.println(String.format("%.1f", soma));
    }
}
