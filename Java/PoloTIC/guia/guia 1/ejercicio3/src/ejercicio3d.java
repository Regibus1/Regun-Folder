/*d) Realizar un programa que calcule el IVA de un producto. Para esto, el
     usuario debe poder ingresar por teclado el valor del producto y el programa
     debe informarle por pantalla qué monto equivale al IVA. Recordar que el IVA
     es igual al 21% (0,21). */

import java.util.Scanner;

public class ejercicio3d {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final int IVA = 21;
        double taxes;
        double total;

        System.out.println("Valor del producto a comprar: ");
        double valor = lector.nextDouble();

        taxes = valor * IVA / 100;
        total = valor + taxes;

        System.out.println(valor+ " + "+ taxes +"(IVA) = $"+ total);
    }
}
