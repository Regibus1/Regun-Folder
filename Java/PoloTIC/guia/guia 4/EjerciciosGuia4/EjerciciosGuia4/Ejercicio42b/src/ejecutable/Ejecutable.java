package ejecutable;

import java.util.Scanner;

/* b) Llevar a cabo un programa que permita cargar mediante teclado una matriz de
3 x 3 (3 filas, 3 columnas) con razas de perros. Una vez cargada la misma,
será necesario realizar un recorrido por la misma y mostrar los datos
cargados por pantalla. */

//Realizado por Abdias Jimenez Agosto 2020
public class Ejecutable {

    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        String dogBreeds[][] = new String[3][3];
        int contadorVueltas = 0;

        System.out.println("Top 9 raza de perros");

        for (int f = 0; f < dogBreeds.length; f++) {
            for (int c = 0; c < dogBreeds[f].length; c++) {
                contadorVueltas++;
                System.out.print(contadorVueltas + ". ");
                dogBreeds[f][c] = miEscaner.nextLine();
            }

        }

        for (int f = 0; f < dogBreeds.length; f++) {
            for (int c = 0; c < dogBreeds[f].length; c++) {
                System.out.print(dogBreeds[f][c] + " | ");
            }
            System.out.println(" ");
        }
    }

}
