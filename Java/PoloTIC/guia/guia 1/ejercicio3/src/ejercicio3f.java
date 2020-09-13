import java.util.Scanner;

/*f) Realizar un programa que permita calcular el área de un triángulo. Se
     recuerda que la fórmula para calcular el área de un triángulo es: (base *
     altura) / 2. Se debe permitir al usuario ingresar la base y la altura,
     mientras que el programa debe calcular el área y mostrar el resultado por
     pantalla.*/

public class ejercicio3f {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese por teclado la base del triagulo: ");
        double base = lector.nextDouble();

        System.out.println("y la altura: ");
        double altura = lector.nextDouble();

        double area = base * altura / 2;

        System.out.println("El area del triangulo es: " +area);
    }
}
