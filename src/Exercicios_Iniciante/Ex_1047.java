/*Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo.
A seguir calcule a duração do jogo.
Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
*/
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1047 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int hrini, minIni, hrFim, minFim, hrTot, mintot;

        hrini = sc.nextInt();
        minIni = sc.nextInt();
        hrFim = sc.nextInt();
        minFim = sc.nextInt();

       hrTot = hrFim - hrini;
       mintot = minFim - minIni;

       if (hrTot < 0){
           hrTot = 24 + (hrFim - hrini);
       }
       if (mintot < 0){
           mintot = 60 + (minFim - minIni);
           hrTot--;
       }
       if (hrini == hrFim && minIni == minFim)
           System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
       else
           System.out.println("O JOGO DURO " + hrTot + " HORA(S) E " + mintot + " MINUTO(S)");
    }
}
