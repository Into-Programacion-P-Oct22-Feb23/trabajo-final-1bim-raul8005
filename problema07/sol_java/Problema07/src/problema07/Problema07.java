/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
       
        int numero;
        int suma = 0;
        int limite = 1;
        
        if (limite <= 5) {
            System.out.println("Ingrese numero pares");
            numero = entrada.nextInt();

            if (numero%2 == 0) {
                suma = suma + numero;
            } else {
                if (numero%2 == 1) {
                    System.out.println("error en el numero ingresado");
                }
            }
            limite = limite + 1;
        }
        
        System.out.println("La suma de los numeros pares es:" + suma);
      
    }   
}