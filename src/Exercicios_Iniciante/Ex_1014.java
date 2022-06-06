/*Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km)
e o total de combustível gasto (em litros).
 */

package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1014 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x;
        double y,media;

        x = sc.nextInt();
        y = sc.nextDouble();

        media = x / y;

        System.out.println(String.format("%.3f km/l", media));
    }
}
