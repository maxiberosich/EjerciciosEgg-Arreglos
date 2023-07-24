/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5.ej3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia5Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int[] vector = new int[leer.nextInt()];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100000);
            if (vector[i] < 10 && vector[i] >= 0){
                cont1++;
            }else if (vector[i] < 100 && vector[i] >= 10){
                cont2++;
            }else if (vector[i] < 1000 && vector[i] >= 100){
                cont3++;
            }else if (vector[i] < 10000 && vector[i] >= 1000){
                cont4++;
            }else if (vector[i] < 100000 && vector[i] >= 10000){
                cont5++;
            }
        }
        
        System.out.println("La cantidad de numeros de 1 cifra son: " + cont1);
        System.out.println("La cantidad de numeros de 2 cifra son: " + cont2);
        System.out.println("La cantidad de numeros de 3 cifra son: " + cont3);
        System.out.println("La cantidad de numeros de 4 cifra son: " + cont4);
        System.out.println("La cantidad de numeros de 5 cifra son: " + cont5);
    }
    
}
