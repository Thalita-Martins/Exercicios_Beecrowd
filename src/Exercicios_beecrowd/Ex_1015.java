/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano,
p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula,
segundo a fórmula:
Distancia = sqrt((x2-x1)² + (y2 - y1)²
 */


package Exercicios_beecrowd;
import java.util.Scanner;
public class Ex_1015 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        double x1,x2,y1,y2,distancia;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        System.out.println(String.format("%.4f",distancia));
    }

}
