package Exercicios_Iniciante;

import java.util.Scanner;

public class Ex_1564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        while (sc.hasNext()){
            i = sc.nextInt();
            if (i != 0){
                System.out.println("vai ter duas!");
            }else{
                System.out.println("vai ter copa!");
            }
        }
    }
}
