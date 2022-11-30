/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int ladoA;
        int ladoB;
        int ladoC;
        String tipo_triangulo;
        double trianguloRectangulo; 
        double trianguloObtusangulo; 
        double trianguloAcutangulo; 
        double valorAB;
        
        System.out.println("Ingrese el valor del lado a del triangulo");
        ladoA = entrada.nextInt();
        System.out.println("Ingrese el valor del lado b del triangulo");
        ladoB = entrada.nextInt();
        System.out.println("Ingrese el valor del lado c del triangulo");
        ladoC = entrada.nextInt();
        
        ladoC = ladoC^2;
        valorAB = ladoA^2 + ladoB^2;
        
        if (ladoC == valorAB){
            System.out.println("Los valores que ingreso pertencena un "
                    + "Triángulo Rectángulo");
        } else{
            if (ladoC > valorAB){
                System.out.println("Los valores que ingreso pertencena un "
                    + "Triángulo Obtusángulo");
            }        
        } 
            if(ladoC < valorAB){   
                System.out.println("Los valores que ingreso pertencena un "
                    + "Triángulo Acutangulo"); 
                }
    }           
}
    

