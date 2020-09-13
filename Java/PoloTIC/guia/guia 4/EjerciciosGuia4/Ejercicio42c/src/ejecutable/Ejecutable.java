package ejecutable;

import java.util.Scanner;
/* c) En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de
secundario. Cada fila corresponde a las notas y al promedio de cada alumno.

• Se necesita un programa que permita a un profesor cargar en las 3
primeras posiciones de cada fila las notas del alumno y que en la última
columna se calculen los promedios.

• Una vez realizados los cálculos, se desea mostrar las 3 notas de cada
alumno y el promedio correspondiente recorriendo la matriz. */


//Realizado por Abdias Jimenez Agosto 2020
public class Ejecutable {

    
    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        float notasAlumnos [][] = new float [4][4];
        float sumaNotas;
        
        for (int f = 0; f < notasAlumnos.length; f++) {
            sumaNotas = 0;
            for (int c = 0; c < notasAlumnos[f].length-1; c++) {
                System.out.println("Ingrese la nota " + (c+1) + " del alumno " + (f+1));
                notasAlumnos [f][c] = miEscaner.nextFloat();
                sumaNotas += notasAlumnos [f][c];
            }
            notasAlumnos[f][notasAlumnos.length-1] = sumaNotas / (notasAlumnos.length-1); 
        }
        
        for (int f = 0; f < notasAlumnos.length; f++) {
            System.out.print("Alumno "+ (f+1) + " --> | " );
            for (int c = 0; c < notasAlumnos[f].length; c++) {
                System.out.print(notasAlumnos[f][c] + " | ");
            }
            System.out.println("");
        }
    }
    
}
