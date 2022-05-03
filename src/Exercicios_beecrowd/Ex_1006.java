package Exercicios_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1006 {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double a, b, c, media;

        a = leitor.nextDouble();
        b = leitor.nextDouble();
        c = leitor.nextDouble();
        media = ((5 * c) + (2 * a) + (3 * b)) / 10;
        System.out.println(String.format("MEDIA = %.1f", media));

    }
}
