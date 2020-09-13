/* Practica 01:
    Desarrolle un programa Java que permita cargar por teclado un
    número entero que representa la cantidad de segundos que pasaron
    desde un evento dado. El programa debe convertir esa cantidad de
    segundos a la cantidad de horas, minutos y segundos que
    transcurrieron. Por ejemplo, si la cantidad de segundos ingresada es
    4452 deberá mostrar un mensaje que informe que el tiempo
    transcurrido fue de 1 hora, 14 minutos y 12 segundos. */

import java.util.Scanner;

public class practica1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int segundos, minutos, hora;

        System.out.println("Ingrese un cantidad de segundos y le calcularé cuanto equivale a horas, minutos y segundos: ");
        segundos = teclado.nextInt();

        hora = segundos / 3600;

        minutos = (segundos - 3600) / 60;

        segundos = segundos % 60;

        System.out.println(hora+ " hora "+ minutos+ " minutos y "+ segundos+ " segundos.");
    }
}
