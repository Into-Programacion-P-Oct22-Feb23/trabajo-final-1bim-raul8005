/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        System.out.println("Ingrese 3 numeros");
        a b c = entrada.nextInt();
        
        if (a < b) {
            System.out.println("El numero",a,"es el mayor de lso tres");
        }
    }
    
}
