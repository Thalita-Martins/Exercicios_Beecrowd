package Exercicios_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1007 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, DIFERENCA;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        DIFERENCA = (a * b - c * d);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
