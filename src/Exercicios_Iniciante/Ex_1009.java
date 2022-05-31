/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de
vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de
comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
 */

package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1009 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String nome;
        double salario, totalVendas, total;

        nome = sc.next();
        salario = sc.nextDouble();
        totalVendas = sc.nextDouble();
        total = (totalVendas * 0.15) + salario;
        System.out.println(String.format("TOTAL = R$ %.2f", total));

    }
}
