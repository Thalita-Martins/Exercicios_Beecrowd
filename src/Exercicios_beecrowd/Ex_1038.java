/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste
item. A seguir, calcule e mostre o valor da conta a pagar.
Tabela: http://prntscr.com/jwbkg8
 */
package Exercicios_beecrowd;
import java.util.Scanner;

public class Ex_1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod,qtd;
        double valor;
        cod = sc.nextInt();
        qtd = sc.nextInt();

        switch (cod){
            case 1 :
                valor = qtd * 4.00;
            break;
            case 2:
                valor = qtd * 4.50;
                break;
            case 3:
                valor = qtd * 5.00;
                break;
            case 4:
                valor = qtd * 2.00;
                break;
            case 5:
                valor = qtd * 1.50;
                break;
            default: valor = 0;
        }
        System.out.println(String.format("Total: R$ %.2f", valor));
    }
}
