/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema09;

/**
 *
 * @author Usuario iTC
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 1;
        int numero = -11;
        int numero2 = 24;
        int suma = 0;
        String cadena = "";
        
        while(contador <= 3){
            cadena = String.format(cadena  + numero + "+" + numero2);
            suma = suma + numero; 
            suma = suma + numero2;
            numero = numero - 11;
            numero2 = numero2 +12;
            contador = contador + 1;
            
            
        }
        suma = suma + 12 - 44;
        //System.out.printf(cadena);
       
       System.out.println("S1= 12" + cadena + "-44");
        System.out.println("La suma de la cadena es:" + suma);
 
        
    }
}
