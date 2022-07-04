/*
Neste problema você deverá ler 15 valores colocá-los e 2 vetores conforme estes valores forem pares ou ímpares.
Só que o tamanho de cada um dos vetores é 5 posições. Então, cada vez que uma dos dois vetores encher, você deverá
impirmir o vetor e utilizá-lo novamente para os próximos números que forem lidos. Terminada a leitura,
deve-se imprimir o conteúdo que restou em cada um dos dois vetores, imprimindo primeiro os valores do vetor impar. Cada
vetor pode ser preenchido tantas vezes quantas for necessário
 */

package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1179 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int x, contpar = 0, contimpar = 0;
        for (int cont = 0; cont < 15; cont++) {
            x = sc.nextInt();
            if (x % 2 == 0) {
                par[contpar] = x;
                contpar++;
            } else {
                impar[contimpar] = x;
                contimpar++;
            }
            if (contpar == 5) {
                contpar = 0;
                for (int i = 0; i < par.length; i++) {
                    System.out.println("par[" + i + "] = " + par[i]);
                }
            } else if (contimpar == 5) {
                contimpar = 0;
                for (int i = 0; i < impar.length; i++) {
                    System.out.println("impar[" + i + "] = " + impar[i]);
                }
            }
        }
        for (int j = 0; j < contimpar; j++) {
            System.out.println("impar[" + j + "] = " + impar[j]);
        }
        for (int j = 0; j < contpar; j++) {
            System.out.println("par[" + j + "] = " + par[j]);
        }
    }
}
