//Construir una clase ArrayReales que declare un atributo de tipo double[] y que
//implemente una interfaz llamada Estadisticas. El contenido de esta interfaz es el siguiente:
//public interface Estadisticas {
//double minimo();
//double maximo();
//double sumatorio();
//}


import java.util.Random;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayReales cadena =new ArrayReales();
        System.out.print("¿Cuántos números quieres comparar?");
        System.out.println();
        int var = sc.nextInt();
        double[] num=new double[var];
        System.out.print("Se van a generar números aleatorios. ¿Cuál será el valor máximo posible?");
        System.out.println();
        int m = sc.nextInt();

        System.out.print("Listado de números: ");
        Random r1=new Random(num.length);
        for (int i=0;i<num.length;i++) {
            double n1= r1.nextDouble(m);
            num[i]=n1;
            System.out.print(Math.round (num[i]) + ", ");
            }
        System.out.println();
        System.out.print("Mínimo: ");
        double min = cadena.minimo(num);
        System.out.print(Math.round(min));
        System.out.println();
        System.out.print("Máximo: ");
        double max = cadena.maximo(num);
        System.out.print(Math.round(max));
        System.out.println();
        System.out.print("Sumatorio: ");
        double sum = cadena.sumatorio(num);
        System.out.print(Math.round(sum));
    }
}
class ArrayReales  implements Estadisticas {
    //double[] num;

    @Override
    public double minimo (double[] n) {
        double min=n[0];
        for (int i=0;i<n.length;i++) {
            if (n[i]<= min)
                min = n[i];
        }
        return min;
    }

    @Override
    public double maximo(double[] n) {
        double max=n[0];
        for (int i=0;i<n.length;i++) {
            if (max < n[i])
                max = n[i];

        }
        return max;
    }

    @Override
    public double sumatorio(double[] n) {
        double sum=0;
        for (int i=0;i<n.length;i++) {
                sum = sum+n[i];
        }
        return sum;
    }
}