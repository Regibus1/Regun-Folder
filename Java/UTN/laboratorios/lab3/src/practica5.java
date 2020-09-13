import java.util.Scanner;

public class practica5 {

    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);

        int numeroCargado, cantidadPar = 0, cantidadImpar = 0;
        boolean ceroEncontrado = false, parActual, parAnterior = false, serieNumerica = true;

        System.out.println("Ingresa un numero");
        do {
            numeroCargado = miEscaner.nextInt();
            parActual = numeroCargado % 2 == 0 ;

            if (numeroCargado == 0){
                ceroEncontrado = true;
            }

            if (numeroCargado % 2 == 0){
                cantidadPar++;
            }

            else{
                cantidadImpar++;
            }

            if (parActual==parAnterior){
                serieNumerica = false;
            }
            parAnterior = parActual;
        }while (numeroCargado >= 0);

        System.out.println("La cantidad de numeros pares fue de "+ cantidadPar);
        System.out.println("Y la de impares fue de "+ cantidadImpar);

        if (serieNumerica){
            System.out.println("Hubo serie par e impar");
        }
        else{
            System.out.println("No hubo serie par e impar");
        }

        if (ceroEncontrado){
            System.out.println("Y el cero fue encontrado");
        }
    }
}
