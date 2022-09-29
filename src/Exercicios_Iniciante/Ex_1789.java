package Exercicios_Iniciante;

import java.util.Scanner;

public class Ex_1789 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L, V, N = 0;

        L = sc.nextInt();
        for (int i = 1; i <= L; i++) {
            V = sc.nextInt();
            if (V < 10 && N <= 1) {
                N = 1;
            } else if (V >= 20 && N <= 3) {
                N = 3;
            } else if (N < 2) {
                N = 2;
            }
            System.out.println(N);
        }
    }
}