/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual
o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir
mostre o valor lido e a relação de notas necessárias.
As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
 */


package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1021 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int valorint, valordec;
        float valor;

        valor = sc.nextFloat();

        valorint = (int) valor;
        valordec = (int) Math.round((valor - (int)valor)*100);

        System.out.println("NOTAS: ");
        System.out.printf("%d nota(s) de R$ 100,00\n", valorint / 100);
        valorint = valorint % 100;
        System.out.printf("%d nota(s) de R$ 50,00\n", valorint / 50);
        valorint = valorint % 50;
        System.out.printf("%d nota(s) de R$ 20,00\n", valorint / 20);
        valorint = valorint % 20;
        System.out.printf("%d nota(s) de R$ 10,00\n", valorint / 10);
        valorint = valorint % 10;

        System.out.printf("%d nota(s) de R$ 5,00\n", valorint / 5);
        valorint = valorint % 5;
        System.out.printf("%d nota(s) de R$ 2,00\n", valorint / 2);
        valorint = valorint % 2;

        if (valorint == 1){
            valordec = valordec + 100;
        }
        System.out.println("MOEDAS: ");
        System.out.printf("%d moeda(s) de R$ 1,00\n", valordec / 100);
        valordec = valordec % 100;
        System.out.printf("%d moeda(s) de R$ 0,50\n", valordec / 50);
        valordec = valordec % 50;
        System.out.printf("%d moeda(s) de R$ 0,25\n", valordec / 25);
        valordec = valordec % 25;
        System.out.printf("%d moeda(s) de R$ 0,10\n", valordec / 10);
        valordec = valordec % 10;
        System.out.printf("%d moeda(s) de R$ 0,05\n", valordec / 5);
        valordec = valordec % 5;
        System.out.printf("%d moeda(s) de R$ 0,01\n", valordec / 1);
        valordec = valordec % 1;

        sc.close();
    }
}
