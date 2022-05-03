package Exercicios_beecrowd;

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
