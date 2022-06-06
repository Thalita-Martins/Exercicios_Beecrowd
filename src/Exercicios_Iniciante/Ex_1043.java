/*Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo,
calcule o perímetro do triângulo e apresente a mensagem:
Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
Area = XX.X
*/

package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1043 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A,B,C,perimetro,area;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if((A + B > C) && (A + C > B) && (C + B > A )){
            perimetro = A + B +C;
            System.out.println(String.format("Perimetro = %.1f",perimetro));
        }else{
            area = ((A + B) * C) / 2;
            System.out.println(String.format("Area = %.1f",area));
        }
    }
}
