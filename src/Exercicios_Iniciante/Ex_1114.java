/*Escreva um programa que repita a leitura de uma senha até ela ser válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */
package Exercicios_Iniciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex_1114 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num, senha = 2002;
        num = sc.nextInt();
        while (num != senha){
            System.out.println("Senha Invalida");
            num = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
