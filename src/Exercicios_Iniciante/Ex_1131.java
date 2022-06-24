/* A Federação Gaúcha de Futebol contratou você para escrever um programa para
 fazer uma estatística do resultado de vários GRENAIS. Escreva um programa
 para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL.
 Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma
 resposta. Se a resposta for 1, o algoritmo deve ser executado novamente
 solicitando o número de gols marcados pelos times em uma nova partida, caso
 contrário deve ser encerrado imprimindo:
 - Quantos GRENAIS fizeram parte da estatística.
 - O número de vitórias do Inter.
 - O número de vitórias do Grêmio.
 - O número de Empates.
 - Uma mensagem indicando qual o time que venceu o maior número de GRENAIS
  (ou "Nao houve vencedor", caso termine empatado).
*/
package Exercicios_Iniciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex_1131 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x, y, resp, i = 0, totx = 0, toty = 0, emp = 0;
        do {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x > y){
                totx += 1;
            }else if (x < y){
                toty += 1;
            }else {
                emp += 1;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            resp = sc.nextInt();
            i++;
        }while ( resp == 1);
        System.out.println(i + " grenais");
        System.out.println("Inter:" + totx);
        System.out.println("Gremio:" + toty);
        System.out.println("Empates:" + emp);
        if (totx > toty){
            System.out.println("Inter venceu mais");
        }else {
            System.out.println("Gremio venceu mais");
        }
    }
}
