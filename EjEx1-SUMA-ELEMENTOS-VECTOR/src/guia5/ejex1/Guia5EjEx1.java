/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.
 */
package guia5.ejex1;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia5EjEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        
        System.out.print("Ingrese el tamaño que tendra el vector: ");
        int[] vector = new int[leer.nextInt()];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el " + (i+1) + "º numero del vector: ");
            vector[i] = leer.nextInt();
        }
        
        for (int elemento: vector){
            System.out.print("[" + elemento + "]");
            suma += elemento;
        }
        
        System.out.println("");
        System.out.println("La suma de todos los numeros del vector es: " + suma);
    }
    
}
