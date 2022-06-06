/*Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
 de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
 Imposto de Renda, segundo a tabela abaixo: http://prntscr.com/jwr7in

  Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre
 R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta
 de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00
 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso
 com duas casas decimais.
 */
package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1051 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        if (valor >= 0 && valor <= 2000) {
            System.out.println("Isento");
        } else if (valor > 2000 && valor <= 3000) {
            valor = (valor - 2000) * 0.08;
            System.out.println(String.format("R$ %.2f", valor));
        } else if (valor > 3000 && valor <= 4500) {
            valor = ((valor - 3000) * 0.18) + 80;
            System.out.println(String.format("R$ %.2f", valor));
        } else {
            valor = ((valor - 4500) * 0.28) + 350;
            System.out.println(String.format("R$ %.2f", valor));
        }
    }

}
