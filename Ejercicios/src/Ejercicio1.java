//Construir una clase ArrayReales que declare un atributo de tipo double[] y que
//implemente una interfaz llamada Estadisticas. El contenido de esta interfaz es el siguiente:
//public interface Estadisticas {
//double minimo();
//double maximo();
//double sumatorio();
//}

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayReales cadena =new ArrayReales();
        System.out.print("¿Cuántos números quieres comparar?");
        int var = sc.nextInt();
        System.out.println();
        double[] num=new double[var];
        System.out.print("Se van a generar números aleatorios. ¿Cuál será el valor máximo posible?");
        System.out.println();
        int m = sc.nextInt();

        System.out.print("Listado de números: ");
        Random r1=new Random(num.length);
        for (double v : num) {
            double n1= r1.nextDouble(m);
            Arrays.fill(num, n1);
            System.out.print(Math.round (v) + ", ");
        }
        System.out.println();
        System.out.print("Mínimo: ");
        double min = cadena.minimo(num);
        System.out.print(min + "/n");
        System.out.print("Máximo: ");
        double max = cadena.maximo(num);
        System.out.print(max + "/n");
        System.out.print("Sumatorio: ");
        double sum = cadena.maximo(num);
        System.out.print(sum);
    }
}
class ArrayReales  implements Estadisticas {
    //double[] num;

    @Override
    public double minimo (double[] n) {
        double min=n[0];
        for (double v : n) {
            if (min < v)
                min = v;
        }
        return min;
    }

    @Override
    public double maximo(double[] n) {
        double max=n[0];
        for (double v : n) {
            if (max > v)
                max = v;
        }
        return max;
    }

    @Override
    public double sumatorio(double[] n) {
        double sum=n[0];
        for (double v : n) {
                sum = sum + v;
        }
        return sum;
    }
}