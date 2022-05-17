/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */
package Exercicios_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1008 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double numHr, valorHr, total;
        int numFunc;

        numFunc = sc.nextInt();
        numHr = sc.nextDouble();
        valorHr = sc.nextDouble();
        total = numHr * valorHr;
        System.out.println("NUMBER = " + numFunc);
        System.out.println(String.format("SALARY = U$ %.2f", total));

    }
}
