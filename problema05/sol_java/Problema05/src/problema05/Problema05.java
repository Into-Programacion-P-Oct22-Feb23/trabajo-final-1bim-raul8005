/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valorx;
        double valory ;
        
        System.out.println("Ingrese un valor");
        valorx = entrada.nextDouble();
        
        System.out.println("Ingrese otro valor");
        valory = entrada.nextDouble();
        
        
        if (valorx > 0 && valory > 0) {
            System.out.println("Es el cuadrante 1");
        }
        if (valorx < 0 && valory > 0) {
            System.out.println("Es el cuadrante 2");
        }
        if (valorx > 0 && valory < 0) {
            System.out.println("Es el cuadrante 3");
        }
        if (valorx < 0 && valory < 0) {
            System.out.println("Es el cuadrante 4");
        }
    }
    
}
