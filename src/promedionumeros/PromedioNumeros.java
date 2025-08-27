
package promedionumeros;

import java.util.Scanner;
public class PromedioNumeros {

 
    public static void main(String[] args) {
       double nota1,nota2,promedio;
       
       Scanner lectura =new Scanner(System.in);
       
       System.out.print("Ingrese Nota 1 : ");
       nota1 = lectura.nextDouble();       
       System.out.print("Ingrese Nota 2 : ");
       nota2= lectura.nextDouble();
       System.out.println("Resultados de la aplicacion");
       promedio=(nota1+nota2)/2;
       System.out.println("Nota 1 : " + nota1);
       System.out.println("Nota 2 : " + nota2);            
       System.out.println("El promedio es : " + promedio);
               
    }
    
}
