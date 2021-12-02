package entprueba;
import java.util.Scanner;
public class Entprueba {
    public static void main(String[] args) {
        System.out.println("Buenos dias");
        System.out.println("Ingrese el número de municipios");
        Scanner sctemp=new Scanner(System.in);
        int municipios=sctemp.nextInt();
        for (int cont=0; cont<municipios;++cont){
        System.out.println("Ingrese temperatura");
        int temperatura=sctemp.nextInt();
        if (temperatura>=0){
              System.out.println("Temperatura positiva");
        }else{
              System.out.println("Temperatura negativa");
        }
     }
  }
    
}
