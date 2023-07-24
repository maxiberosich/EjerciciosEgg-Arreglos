/*
Crear una función rellene un vector con números aleatorios, pasándole un 
arreglo por parámetro. Después haremos otra función o procedimiento que
imprima el vector.
 */
package guia5.ejex3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia5EjEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int [] vector = new int[leer.nextInt()];
        
        rellenar(vector);
        mostrar(vector);
        System.out.println("");
    }
    
    public static void rellenar(int[] vec){
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random()*20+1);
        }
    }
    
    public static void mostrar(int[] vec){
        for (int elemento: vec){
            System.out.print("[" + elemento + "] ");
        }
    }
}
