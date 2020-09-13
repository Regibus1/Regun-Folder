import java.util.Scanner;

/* c) Un comerciante realiza 5 ventas por día. Necesita de un programa que le
      permita ingresar por teclado los montos de las 5 ventas y luego sumar el
      total de todas ellas para mostrar por pantalla el resultado. ¿Podrías
      ayudarlo a realizar el programa? */

public class ejercicio3c {

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        double venta;
        double suma = 0;
        int i = 1;

        while (i <= 5){
            System.out.println("Nueva Venta: ");
            venta = lector.nextDouble();

            suma = suma + venta;
            i++;
        }
        System.out.println("La suma del total de ventas: $"+ suma);
    }
}
