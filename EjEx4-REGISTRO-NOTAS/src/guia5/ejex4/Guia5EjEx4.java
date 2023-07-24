/*
Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al 
final del programa los profesores necesitan obtener por pantalla la cantidad de 
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio
mayor o igual al 7 de sus notas del curso.

 */
package guia5.ejex4;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia5EjEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float[][] notas = new float[10][4];
        float primerPractico, segundoPractico, primerIntegrador, segundoIntegrador, promedio;
        
        for (int i = 0; i < 10; i++) {
            /*primerPractico = 0;
            segundoPractico = 0; 
            primerIntegrador = 0;
            segundoIntegrador = 0;*/
            System.out.println("-------------------------------------------");
            System.out.println("Ingrese las notas del " + (i+1) + "º alumno");
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Ingrese la nota del primer trabajo practico:");
                        primerPractico = (int) (Math.random()*11);
                        System.out.println(primerPractico);
                        notas[i][j] = primerPractico * 10 / 100;
                        break;
                    case 1:
                        System.out.println("Ingrese la nota del segundo trabajo practico:");
                        segundoPractico = (int) (Math.random()*11);
                        System.out.println(segundoPractico);
                        notas[i][j] = segundoPractico * 15 / 100;
                        break;
                    case 2:
                        System.out.println("Ingrese la nota del primer Integrador:");
                        primerIntegrador = (int) (Math.random()*11);
                        System.out.println(primerIntegrador);
                        notas[i][j] = primerIntegrador * 25 / 100;
                        break;
                    case 3:
                        System.out.println("Ingrese la nota del segundo Integrador:");
                        segundoIntegrador = (int) (Math.random()*11);
                        System.out.println(segundoIntegrador);
                        notas[i][j] = segundoIntegrador * 50 / 100;
                        break;
                }
            }
        }
        
        System.out.println("------------------------------");
        for (float[] fila: notas){
            for (float elemento: fila){
                System.out.print(elemento + " |   ");
            }
            System.out.println("");
        }
        System.out.println("------------------------------");
        
        for (int i = 0; i < 10; i++) {
            promedio = 0;
            for (int j = 0; j < 4; j++) {
                promedio += notas[i][j];
            }
            if (promedio >= 7){
                System.out.println("El alumno nº " + (i+1) + " esta aprobado con: " + promedio);
            }else{
                System.out.println("El alumno nº " + (i+1) + " esta DESaprobado con: " + promedio);
            }
        }
    }
    
}
