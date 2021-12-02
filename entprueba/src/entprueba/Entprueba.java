package entprueba;
import java.util.Scanner;
public class Entprueba {
    public static void main(String[] args) {
        System.out.println("Buenos dias");
        System.out.println("Ingrese una temperatura");
        Scanner sctemp=new Scanner(System.in);
        int temperatura=sctemp.nextInt();
        if (temperatura>=0){
              System.out.println("Temperatura positiva");
        }else{
              System.out.println("Temperatura negativa");
        }
    }
    
}
