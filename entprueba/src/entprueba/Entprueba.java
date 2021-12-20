package entprueba;

import java.util.Scanner;

public class Entprueba {

    public static void main(String[] args) {
        //Te he cambiado el double de mayor y menor por algo mucho mejor
        //Double.MIN_VALUE introduce en la variable el valor mas pequeño posible para los Double.
        //Double.MAX_VALUE introduce en la variable el valor mas grande posible para los Double.
        double[] temperaturas;
        String[] municipios ;
        String municipioMayor = null ;
        String municipioMenor = null ;
        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        Scanner sctemp = new Scanner(System.in);
        System.out.println("Buenos dias");
        System.out.println("Ingrese el número de municipios");
        int numMunicipios = sctemp.nextInt();
        temperaturas = new double[numMunicipios];
        municipios = new String[numMunicipios];
        for (int cont = 0; cont < numMunicipios; ++cont) {
            System.out.println("Ingrese el nombre del municipio");
            String a = sctemp.nextLine();
            municipios[cont] = sctemp.nextLine(); 
            System.out.println("Ingrese temperatura");
            temperaturas[cont] = sctemp.nextDouble(); 
            if (temperaturas[cont] >= 0) {
                System.out.println("Temperatura positiva");
            } else {
                System.out.println("Temperatura negativa");
            }
            if (temperaturas[cont] < menor) {
                menor = temperaturas[cont];
                municipioMenor = municipios[cont];
            }
            if (temperaturas[cont] > mayor) {
                mayor = temperaturas[cont];
                municipioMayor = municipios[cont];
            }

        }
        System.out.println("La temperatura mayor es " + mayor + " "+municipioMayor +" y la temperatura menor es " + menor+" "+municipioMenor);
        System.out.println("Las temperaturas y municipios introducidas son:");
        for (int cont2 = 0; cont2 < numMunicipios; ++cont2) {
        System.out.print(temperaturas[cont2]);
        System.out.print(municipios[cont2]);
        System.out.println("");
        }
    }

}
