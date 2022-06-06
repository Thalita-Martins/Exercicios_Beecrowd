/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima
de 1 hora e máxima de 24 horas.
 */

package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1046 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int hrIni, hrFim, hrTot;
        hrIni = sc.nextInt();
        hrFim = sc.nextInt();

        if ((hrIni > hrFim)){
            hrTot = 24 - (hrIni - hrFim);
            System.out.println("O JOGO DUROU " + hrTot + " HORA(S)");
        }else if(hrFim > hrIni){
            hrTot = hrFim - hrIni;
            System.out.println("O JOGO DUROU " + hrTot + " HORA(S)");
        }else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
