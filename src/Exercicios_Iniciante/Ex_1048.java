/* A empresa ABC resolveu conceder um aumento de salários a seus funcionários
 de acordo com a tabela abaixo: http://prntscr.com/jwh30j*/

package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1048 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double sal,total = 0, perc;

        sal = sc.nextDouble();
        if(sal >= 0 && sal <= 400.00){
            total = (sal * 0.15) + sal;
        }else if(sal > 400.00 && sal <= 800.00){
            total = (sal * 0.12) + sal;
        }else if(sal > 800.00 && sal <= 1200.00){
            total = (sal * 0.10) + sal;
        }else  if(sal > 1200.00 && sal <= 2000.00){
            total = (sal * 0.07) + sal;
        }else{
            total = (sal * 0.04) + sal;
        }
        perc = ((total - sal) / sal * 100);
        System.out.println(String.format("Novo salario: %.2f",total));
        System.out.println(String.format("Reajuste ganho: %.2f",total - sal));
        System.out.println(String.format("Em percentual: %.0f" , perc ) + " %");

    }
}
