/*Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
 */

package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1020 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int valor, ano, mes, dia;

        valor = sc.nextInt();

        ano = valor / 365;
        valor = valor % 365;
        mes = valor / 30;
        valor = valor % 30;
        dia = valor / 1;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}
