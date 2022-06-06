/*
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível
segundo o esquema abaixo, da esquerda para a direita. Em seguida conclua qual dos
animais seguintes foi escolhido, através das três palavras fornecidas.
http://prntscr.com/jwis51
*/

package Exercicios_Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex_1049 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String tipo1, tipo2, tipo3;
        tipo1 = sc.next();
        tipo2 = sc.next();
        tipo3 = sc.next();

        if (tipo1.equalsIgnoreCase("vertebrado")) {
            if (tipo2.equalsIgnoreCase("mamifero")) {
                if (tipo3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            } else if (tipo2.equalsIgnoreCase("ave")) {
                if (tipo3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            }
        }else if (tipo1.equalsIgnoreCase("invertebrado")){
            if(tipo2.equalsIgnoreCase("inseto")){
                if(tipo3.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else if(tipo2.equalsIgnoreCase("anelideo")){
                if(tipo3.equalsIgnoreCase("onivoro")){
                    System.out.println("minhoca");
                }else{
                    System.out.println("sanguessuga");
                }
            }
        }
    }
}