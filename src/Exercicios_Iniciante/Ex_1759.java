/* Papai Noel está brincando com seus duendes para entretê-los durante a véspera do Natal.
A brincadeira consiste nos elfos escreverem números em pedaços de papel e colocarem no gorro
do Papai Noel. Após todos terminarem de colocar os números Noel sorteia um papel e aquele número
representa quantos "Ho" o Noel deve falar.
*/
package Exercicios_Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex_1759 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N,i = 1;
        N = sc.nextInt();
        while (i <= N){
            if (i == N){
                System.out.println("Ho!");
            }else{
                System.out.print("Ho ");
            }
            i++;
        }
    }
}
