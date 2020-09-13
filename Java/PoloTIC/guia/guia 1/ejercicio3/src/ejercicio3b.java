import java.util.Scanner;

/* b) Una estudiante está dando sus primeros pasos en la programación y quiere
      realizar un programa que permita calcular cualquier porcentaje de un número.
      Para ello necesita que el usuario ingrese por teclado el número a calcular
      el porcentaje (por ejemplo 2500) y también el porcentaje que se desea
      calcular (por ejemplo si quiere calcular 10% debería ingresar 0,10). A
      partir de estos valores, necesita que el algoritmo calcule el porcentaje
      (multiplicar el primer número por el valor del porcentaje), lo guarde en
      una variable y se muestre por pantalla. ¿Podrías ayudarla a realizar el
      programa? */

public class ejercicio3b {

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        double porcentaje;
        double resultado;
        int num;

        System.out.println("Digite un numero: ");
        num = lector.nextInt();

        System.out.println("Ahora ingrese el porcentaje a calcular: ");
        porcentaje = lector.nextDouble();  // Tener en cuenta que si no se coloca el numero real con..
                                                // puede que salte error
        resultado = (num * porcentaje) / 100;

        System.out.println("El "+ porcentaje+ "% de "+ num+ " es " + resultado);
    }
}
