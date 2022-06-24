/*Faça um programa que leia as notas referentes às duas avaliações de um aluno.
Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas
válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve
ser validada separadamente.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1117 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n1, n2, media;
        n1 = sc.nextDouble();
        while (n1 < 0 || n1 > 10){
            System.out.println("nota invalida");
            n1 = sc.nextDouble();
        }
        n2 = sc.nextDouble();
        while (n2 < 0 || n2 > 10){
            System.out.println("nota invalida");
            n2 = sc.nextDouble();
        }
        media = (n1 + n2) / 2;
        System.out.println(String.format("media = %.2f", media));
    }
}
