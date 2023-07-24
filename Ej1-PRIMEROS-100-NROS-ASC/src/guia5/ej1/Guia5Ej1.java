/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
y los muestre por pantalla en orden descendente.

 */
package guia5.ej1;


/**
 *
 * @author Max
 */
public class Guia5Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int[100];
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }
        
        
        for (int i = 100; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
    
}
