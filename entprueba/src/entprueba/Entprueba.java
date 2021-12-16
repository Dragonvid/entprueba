package entprueba;

import java.util.Scanner;

public class Entprueba {

    public static void main(String[] args) {
        //Te he cambiado el double de mayor y menor por algo mucho mejor
        //Double.MIN_VALUE introduce en la variable el valor mas pequeño posible para los Double.
        //Double.MAX_VALUE introduce en la variable el valor mas grande posible para los Double.
        double temperatura[];
        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        System.out.println("Buenos dias");
        System.out.println("Ingrese el número de municipios");
        Scanner sctemp = new Scanner(System.in);
        int municipios = sctemp.nextInt();
        temperatura = new double[municipios];
        for (int cont = 0; cont < municipios; ++cont) {
            System.out.println("Ingrese temperatura");
            temperatura[cont] = sctemp.nextDouble(); 
            if (temperatura[cont] >= 0) {
                System.out.println("Temperatura positiva");
            } else {
                System.out.println("Temperatura negativa");
            }
            if (temperatura[cont] < menor) {
                menor = temperatura[cont];
            }
            if (temperatura[cont] > mayor) {
                mayor = temperatura[cont];
            }

        }
        System.out.println("La temperatura mayor es " + mayor + " y la temperatura menor es " + menor);
        System.out.println("Las temperaturas introducidas son:");
        for (int cont2 = 0; cont2 < municipios; ++cont2) {
        System.out.println(temperatura[cont2]);
        }
    }

}
