package Exercicios_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1004 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a, b, PROD;

        a = sc.nextInt();
        b = sc.nextInt();

        PROD = a * b;

        System.out.println("PROD = " + PROD);

    }
}
