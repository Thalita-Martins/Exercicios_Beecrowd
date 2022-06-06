/*Pedrinho está organizando um evento em sua Universidade. O evento deverá
ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que
Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe
quando inicia e quando termina o evento.
Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá
ajudar Pedrinho a calcular a duração deste evento.
*/

package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1061 {
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        //int diaIni, hrIni, minIni, sgIni, diaFim, hrFim, minFim, sgFim;
        int totalDias = 0, totalHoras = 0, totalMinutos = 0, totalSegundos = 0;
        String[] SdiaInicial = leitor.nextLine().split(" ");
        String[] ShoraInicial = leitor.nextLine().replaceAll(" ", "").split(":");
        String[] SdiaFinal = leitor.nextLine().split(" ");
        String[] ShoraFinal = leitor.nextLine().replaceAll(" ", "").split(":");

    }
}
