/*Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h
e o carro Y sai com velocidade constante de 90 Km/h.
 Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue
 se afastar um quilometro a cada 2 minutos.
 Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância
 do outro carro.
 */

package Exercicios_Iniciante;

import java.util.Scanner;

public class Ex_1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int km,tempo;

        km = sc.nextInt();

        tempo = km * 2;

        System.out.println(tempo + " minutos");
    }
}
