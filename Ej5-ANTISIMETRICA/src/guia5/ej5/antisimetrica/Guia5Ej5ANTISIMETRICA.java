/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta
de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5.ej5.antisimetrica;

/**
 *
 * @author Max
 */
public class Guia5Ej5ANTISIMETRICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int[][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int[][] matrizTraspuesta = new int[matriz.length][matriz[0].length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizTraspuesta[i][j] = matriz[j][i];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("----------------------------");
        for (int[] fila: matrizTraspuesta) {
            for (int elemento: fila){
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }
        
        boolean okis = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matrizTraspuesta[j][i] != matriz[i][j]){
                    okis = false;
                    break;
                }
            }
        }
        if(okis)
            System.out.println("yeah");
        else
            System.out.println("nope");
    }*/
        
        int[][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        
        boolean antisimetrica = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j] != -matriz[j][i]){
                    antisimetrica = false;
                    break;
                }
            }
        }
        if(antisimetrica)
            System.out.println("La matriz es antisimetrica");
        else
            System.out.println("La matriz NO es antisimetrica");
        
    }
}
