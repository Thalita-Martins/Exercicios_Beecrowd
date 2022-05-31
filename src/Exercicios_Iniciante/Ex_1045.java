/*Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o
lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três
lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
*/
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1045 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        double A, B, C, aux;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if(B > A && B > C){
            aux = A;
            A = B;
            B = aux;
        }else if (C > A){
            aux = A;
            A = C;
            C = aux;
        }
        if (A >= (B+C)){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if(Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2))
                System.out.println("TRIANGULO RETANGULO");
            if(Math.pow(A,2) > Math.pow(B,2) + Math.pow(C,2))
                System.out.println("TRIANGULO OBTUSANGULO");
            if(Math.pow(A,2) < Math.pow(B,2) + Math.pow(C,2))
                System.out.println("TRIANGULO ACUTANGULO");
            if (A == B && A == C && B == C)
                System.out.println("TRIANGULO EQUILATERO");
            if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A))
                System.out.println("TRIANGULO ISOSCELES");
        }
    }
}


