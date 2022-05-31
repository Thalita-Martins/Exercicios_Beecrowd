/*A fórmula para calcular a área de uma circunferência é: area = π . raio2.
Considerando para este problema que π = 3.14159:
Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
 */
package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1002 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double raio, area;

        raio = sc.nextDouble();

        area = 3.14159 * (raio * raio);
        System.out.println(String.format("A=%.4f", area));
    }
}
