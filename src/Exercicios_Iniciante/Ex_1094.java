/*Maria acabou de iniciar seu curso de graduação na faculdade de medicina e
precisa de sua ajuda para organizar os experimentos de um laboratório o qual
ela é responsável. Ela quer saber no final do ano, quantas cobaias foram
utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e
coelhos. Para obter estas informações, ela sabe exatamente o número de
experimentos que foram  realizados, o tipo de cobaia utilizada e a quantidade
de cobaias utilizadas em cada experimento.
*/
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1094 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N, num, C = 0, R = 0, S = 0,total = 0;
        double totC, totR, totS;
        String letra;
        N = sc.nextInt();
        for (int i = 1; i <= N; i++){
            num = sc.nextInt();
            letra = sc.next();
            total += num;
            if (letra.equalsIgnoreCase("C")){
                C += num;
            }else if (letra.equalsIgnoreCase("R")){
                R += num;
            }else{
                S += num;
            }
        }
        totC = (C / (double)total) * 100;
        totR = (R / (double)total) * 100;
        totS = (S / (double)total) * 100;
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + C);
        System.out.println("Total de ratos: " + R);
        System.out.println("Total de sapos: " + S);
        System.out.println(String.format("Percentual de coelhos: %.2f",totC) + " %");
        System.out.println(String.format("Percentual de ratos: %.2f",totR) + " %");
        System.out.println(String.format("Percentual de sapos: %.2f",totS) + " %");
    }
}
