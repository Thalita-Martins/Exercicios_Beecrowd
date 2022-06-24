/* Escreva um programa para ler as notas da primeira e a segunda avaliação
 de um aluno. Calcule e imprima a média semestral. O programa só deverá
 aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).
 Cada nota deve ser validada separadamente.
 No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”,
 solicitando ao usuário que informe um código (1 ou 2) indicando se ele deseja
 ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se
 for informado o código 1 deve ser repetida a execução de todo o programa para
 permitir um novo cálculo, caso contrário o programa deve ser encerrado.
 */
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1118 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n1, n2, media;
        int res;
        do {
            n1 = sc.nextDouble();
            while (n1 > 10 || n1 < 0) {
                System.out.println("nota invalida");
                n1 = sc.nextDouble();
            }
            n2 = sc.nextDouble();
            while (n2 > 10 || n2 < 0) {
                System.out.println("nota invalida");
                n2 = sc.nextDouble();
            }
            media = (n1 + n2) / 2;
            System.out.println(String.format("media = %.2f", media));
            System.out.println("novo calculo (1-sim 2-nao)");
            res = sc.nextInt();
            if (res != 1 && res != 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                res = sc.nextInt();
            }
        }while (res != 2);
    }
}
