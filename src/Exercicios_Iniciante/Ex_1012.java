/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/
package Exercicios_Iniciante;

import java.util.Scanner;
public class Ex_1012 {
    public static void main(String[] args) {

        double A, B, C,areaTri, areaCirc, areaTrap,areaQuad, areaRet, pi = 3.14159;

        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTri = (A*C) / 2;
        areaCirc = pi * Math.pow(C,2);
        areaTrap = ((A + B) * C) / 2;
        areaQuad = B * B;
        areaRet = A * B;

        System.out.println(String.format("TRIANGULO: %.3f", areaTri));
        System.out.println(String.format("CIRCULO: %.3f", areaCirc));
        System.out.println(String.format("TRAPEZIO: %.3f", areaTrap));
        System.out.println(String.format("QUADRADO: %.3f", areaQuad));
        System.out.println(String.format("RETANGULO: %.3f", areaRet));
    }
}
