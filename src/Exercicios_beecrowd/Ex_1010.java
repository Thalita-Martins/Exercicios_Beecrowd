package Exercicios_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1010 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int peca1 = sc.nextInt();
        int num1 = sc.nextInt();
        double valor1 = sc.nextDouble();
        int peca2 = sc.nextInt();
        int num2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double total = valor1 * num1 + valor2 * num2;
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));

    }
}
