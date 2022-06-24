/* Mariazinha quer resolver um problema interessante. Dadas as informações de
 população e a taxa de crescimento de duas cidades quaisquer (A e B), ela
 gostaria de saber quantos anos levará para que a cidade menor (sempre é a
 cidade A) ultrapasse a cidade B em população. Claro que ela quer saber apenas
 para as cidades cuja taxa de crescimento da cidade A é maior do que a taxa de
 crescimento da cidade B, portanto, previamente já separou para você apenas os
 casos de teste que tem a taxa de crescimento maior para a cidade A.Sua tarefa
 é construir um programa que apresente o tempo em anos para cada caso de teste.
 Porém, em alguns casos o tempo pode ser muito grande, e Mariazinha não se
 interessa em saber exatamente o tempo para estes casos. Basta que informe,
 nesta situação, a mensagem "Mais de 1 século.".

 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex_1160 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t, pa, pb, ano = 0;
        double g1, g2;
        t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            pa = sc.nextInt();
            pb = sc.nextInt();
            g1 = sc.nextDouble();
            g2 = sc.nextDouble();

            while (pa <= pb) {
                if (ano > 100) {
                    break;
                } else {
                    pa += (pa * (g1 / 100));
                    pb += (pb * (g2 / 100));
                    ano++;
                }
            }
            if (ano <= 100){
                System.out.println(ano + " anos.");
            }else{
                System.out.println("Mais de 1 seculo.");
            }
            ano = 0;
        }
    }
}
