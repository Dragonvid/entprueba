package entprueba;
import java.util.Scanner;
public class Entprueba {
    public static void main(String[] args) {
        float menor=0;
        float mayor=0;
        System.out.println("Buenos dias");
        System.out.println("Ingrese el número de municipios");
        Scanner sctemp=new Scanner(System.in);
        int municipios=sctemp.nextInt();
        for (int cont=0; cont<municipios;++cont){
        System.out.println("Ingrese temperatura");
        float temperatura=sctemp.nextFloat();
        if (temperatura>=0){
              System.out.println("Temperatura positiva");
        }else{
              System.out.println("Temperatura negativa");
        }
        if (temperatura<menor) {
        menor=temperatura;
        }else{
        mayor=temperatura;
        }
        
     }
      System.out.println("Temperatura mayor "+mayor+" Temperatura menor"+menor);
  }
    
}
