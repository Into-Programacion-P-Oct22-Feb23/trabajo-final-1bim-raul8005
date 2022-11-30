/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int tipoempleado;
        int numerohora = 0;
        int horasextras;
        double cuotapago;
        double pagoextra = 0;
        double sueldopagar;
        
        System.out.println("Ingrese el nombre del empleado por favor");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado por favor(1,2,3 o 4)");
        tipoempleado = entrada.nextInt();
        System.out.println("Ingrese la cuota que se paga por hora extra");
        cuotapago = entrada.nextDouble();
        System.out.println("Ingrese las horas extras trabajadas");
        horasextras = entrada.nextInt();
        
        sueldopagar = numerohora * cuotapago;
        
        if (tipoempleado == 1){
            pagoextra = horasextras * 1.5;
            sueldopagar = sueldopagar + pagoextra;
        } else {
            if (tipoempleado == 2){
            pagoextra = horasextras * 2;
            sueldopagar = sueldopagar + pagoextra;
            } 
        } if(tipoempleado == 3){
            pagoextra = horasextras * 2.5;
            sueldopagar = sueldopagar + pagoextra;
        } else {
            if (tipoempleado == 4){
            pagoextra = horasextras * 3;
            sueldopagar = sueldopagar + pagoextra;
            }    
        } 
        sueldopagar = sueldopagar + pagoextra;
        System.out.printf("El sueldo a pagar es:" + sueldopagar);
    }
       
        
}
