/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5.ej4.traspuesta;

/**
 *
 * @author Max
 */
public class Guia5Ej4TRASPUESTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[8][6];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random()*10);
            }
        }
        
        System.out.println("MATRIZ ORIGINAL:");
        for (int[] fila: matriz) {
            for(int elemento: fila){
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }
        
        System.out.println("----------------------");
        /*System.out.println("MATRIZ TRASPUESTA:");
        for (int i = 0; i < matriz[0].length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }*/
        
        System.out.println("---------------------------------------------------");
        System.out.println(matriz.length + " Fila");
        System.out.println(matriz[0].length + " Columna");
    }
    
}
