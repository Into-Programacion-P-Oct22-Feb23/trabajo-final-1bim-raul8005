/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int cantidad_traje;
        double descuento = 0;
        int descuento1 = 20;
        int descuento2 = 25;
        int descuento3 = 40;
        int descuento4 = 50;
        double precio_traje = 35.50;
        double subtotal =0;
        double total = 0;
        
        System.out.println("Ingrese la cantidad de trajes comprados");
        cantidad_traje = entrada.nextInt();
        
        subtotal = cantidad_traje * precio_traje;
        
        if (cantidad_traje == 1){
            descuento = subtotal * 20 / 100;
            total = subtotal - descuento1;
        } else{
            if(cantidad_traje == 2){
                descuento = subtotal * 25 / 100;
                total = subtotal - descuento;
            }
        } if (cantidad_traje == 3){
            descuento = subtotal * 40 / 100;
            total = subtotal - descuento;
        } else{
            if(cantidad_traje == 4){
                descuento = subtotal * 50 / 100;
                total = subtotal - descuento;
            }
        } 
        System.out.printf("El subtotal a pagar es:" + subtotal + "\n" + "El total"
        + "a pagar es:" + total + "\n" + "El descuento es:" + descuento);
    }
}
    

