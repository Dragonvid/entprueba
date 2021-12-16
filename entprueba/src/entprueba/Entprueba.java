package entprueba;

import java.util.Scanner;

public class Entprueba {

    public static void main(String[] args) {
        //Te he cambiado el double de mayor y menor por algo mucho mejor
        //Double.MIN_VALUE introduce en la variable el valor mas pequeño posible para los Double.
        //Double.MAX_VALUE introduce en la variable el valor mas grande posible para los Double.
        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        System.out.println("Buenos dias");
        System.out.println("Ingrese el número de municipios");
        Scanner sctemp = new Scanner(System.in);
        int municipios = sctemp.nextInt();
        for (int cont = 0; cont < municipios; ++cont) {
            System.out.println("Ingrese temperatura");
            float temperatura = sctemp.nextFloat();
            if (temperatura >= 0) {
                System.out.println("Temperatura positiva");
            } else {
                System.out.println("Temperatura negativa");
            }
            if (temperatura < menor) {
                menor = temperatura;
            }
            if (temperatura > mayor) {
                mayor = temperatura;
            }

        }
        System.out.println("La temperatura mayor es " + mayor + " y la temperatura menor es " + menor);
    }

}
