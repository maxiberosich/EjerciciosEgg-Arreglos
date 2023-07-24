/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño 
de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila 
que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
de Java substring(), Length() y Math.random().
 */
package guia5.ejex6.sopa.de.letras;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia5EjEx6SOPADELETRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopaDeLetras = new String[20][20];
        String palabra;
        int contador = 0, fila, columna, posicion = 0;

        /*CON ESTAS LINEAS DE CODIGO SE LLENA TODA LA MATRIZ CON NUMEROS DEL 0-9
        for (String[] filas : sopaDeLetras) {
            for (String elementos : filas) {
                elementos = String.valueOf((int) (Math.random() * 10));
                System.out.print(elementos + " ");
            }
            System.out.println("");
        }
        */

        System.out.println("Ingrese 5 palabras de 3-5 caracteres");
        do {
            System.out.print((contador+1) + "º: ");
            palabra = leer.next().toUpperCase();
            while (palabra.length() > 5 || palabra.length() < 3) {
                System.out.println("Ingrese otra palabra que corresponda a las caracteristicas pedidas");
                System.out.print((contador+1) + "º: ");
                palabra = leer.next().toUpperCase();
            }
            //ELECCION DE FILA Y COLUMNA AL AZAR
            fila = (int) (Math.random() * 15);
            columna = (int) (Math.random() * 15);
            //INGRESO DE PALABRA EN LA FILA Y COLUMNA SELECCIONADA AL AZAR
            for (int j = 0; j < 20; j++) {
                if(j < columna || j > ( columna + (palabra.length() - 1) ) ){
                    //SI NO ES DONDE SE DEBE UBICAR LA PALABRA INTRODUCIDA, SE RELLENA CON NUMEROS
                    sopaDeLetras[fila][j] = String.valueOf((int) (Math.random() * 10));
                }else{
                    //SE VA INGRESANDO LA PALABRA LETRA POR LETRA, CON AYUDA DE LA VARIABLE POSICION
                    sopaDeLetras[fila][j] = palabra.substring(posicion,posicion+1);
                    posicion++;
                }                
            } 
            //REINICIO DE LA VARIABLE POSICION PARA QUE LUEGO SE INGRESE LA SIGUIENTE PALABRA CORRECTAMENTE
            posicion = 0;           
            contador++;
        } while (contador < 5);
        
        //LLENAMOS LAS DEMAS FILAS Y COLUMNAS QUE NO TENGAN PALABRAS CON NUMEROS DEL 0-9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                //AL ESTAR VACIAS LAS FILAS, TIENEN EL VALOR NULL
                if (sopaDeLetras[i][j] == null)
                    sopaDeLetras[i][j] = String.valueOf((int) (Math.random() * 10));
            }
        }

        //MOSTRAMOS LA MATRIZ RESULTANTE, CON LAS PALABRAS QUE INTRODUJIMOS
        System.out.println("---------------------------------------");
        for (String[] filas : sopaDeLetras) {
            for (String elementos : filas) {
                System.out.print(elementos + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------------------");
    }

}
