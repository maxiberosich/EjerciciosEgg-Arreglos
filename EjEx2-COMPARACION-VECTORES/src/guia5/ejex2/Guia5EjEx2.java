/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre
los elementos).
 */
package guia5.ejex2;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia5EjEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*System.out.print("Ingrese el tamaño de los vectores: ");
        int tamanio = leer.nextInt();*/
        
        int[] vecA = {2,5,4,6};
        int[] vecB = {2,3,4,6};
        
        for (int i = 0; i < vecA.length; i++) {
            if (vecA[i] != vecB[i]){
                System.out.println("Los vectores no son iguales");
                break;
            }
        }
    }
    
}
