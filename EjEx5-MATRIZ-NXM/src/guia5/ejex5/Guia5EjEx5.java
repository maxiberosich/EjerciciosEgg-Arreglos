/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
 */
package guia5.ejex5;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia5EjEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad de filas: ");
        int N = leer.nextInt();
        System.out.print("Cantidad de columnas: ");
        int M = leer.nextInt();
        int[][] matriz = new int[N][M];
        
        int sumaTotal = 0;
        
        for (int[] filas: matriz){
            for (int elementos: filas){
                elementos = (int) (Math.random()*20);
                sumaTotal += elementos;
                System.out.print(elementos + " ");
            }
            System.out.println("");
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("La suma de todos los elementos de la matriz es: " + sumaTotal + "");
        System.out.println("--------------------------------------------------");
    }
    
}
