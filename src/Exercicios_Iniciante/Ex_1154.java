/*Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a
idade média deste grupo de indivíduos.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex_1154 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, idade = 0;
        double media = 0;
        n = sc.nextInt();
        while (n >= 0) {
            for (int i = 1; i < n; i++) {
                idade += n;
                media = (double)idade / i;
                n = sc.nextInt();
            }
        }
        System.out.println(String.format("%.2f",media));
    }
}
