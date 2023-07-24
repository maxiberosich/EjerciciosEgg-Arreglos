/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le
pida al usuario un número a buscar en el vector. El programa mostrará dónde se 
encuentra el numero y si se encuentra repetido
 */
package guia5.ej2;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia5Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N, num, cont;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        N = leer.nextInt();
        int [] vector = new int[N];
        
        cont = 0;
        
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random()*10)+1;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        
        System.out.println("");
        System.out.print("Ingrese un numero para saber si existe dentro del vector");
        num = leer.nextInt();
        
        for (int i = 0; i < N; i++){
            if (vector[i] == num){
                System.out.println("El numero existe en: " + (i+1));
                cont++;
            }
        }
        
        if (cont > 1) {
            System.out.println("El numero se repite " + cont + " veces");
        }
    }
    
}

/*Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector:");
        int tamanio = leer.nextInt();
                
        int[] vector = new int[tamanio];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10)+1;
        }
        
        System.out.println("VECTOR");
        for (int elemento: vector) {
            System.out.print( " " + elemento);
        }
        System.out.println("");
        
        System.out.print("Ingrese un numero a buscar en el vector: ");
        int num = leer.nextInt();
        
        
        String posiciones = " ";
        int contPos = 0;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                posiciones = posiciones + (i+1) + " ";
                contPos += 1;
            }
        }
        
        
        if (contPos >= 1) {
            System.out.println("El numero se encontró en las posiciones " 
                + posiciones);
        } else {
            System.out.println("El numero no se encontro");
        }
        
        if (contPos > 1) {
            System.out.println("El numero se encontro repetido");
        }*/
