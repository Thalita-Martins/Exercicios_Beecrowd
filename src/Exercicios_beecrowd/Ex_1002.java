package Exercicios_beecrowd;

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
