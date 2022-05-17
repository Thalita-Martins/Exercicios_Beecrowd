
/*Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.*/

package Exercicios_beecrowd;

import java.util.Scanner;

public class Ex_1011 {

    public static void main(String[] args) {

        double pi = 3.14159;
        double volume;
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        volume = (4 / 3.0) * pi * Math.pow(R, 3);

        System.out.println(String.format("VOLUME = %.3f", volume));
    }
}
