import java.util.Scanner;

public class practica4 {

    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        String nombreArticulo, claveDescuento;
        double precioOriginal, precioDescuento;

        System.out.println("Indique el nombre del articulo que va a comprar!");
        nombreArticulo = miEscaner.nextLine();

        System.out.println("Indique tambien su precio");
        precioOriginal = miEscaner.nextDouble();
        precioDescuento = precioOriginal;

        System.out.println("Indique la clave secreta");

        do {
            claveDescuento = miEscaner.nextLine();
            if (claveDescuento == "01") {
                precioDescuento = precioOriginal / 1.10;
            }
            else {
                if (claveDescuento == "02") {
                precioDescuento = precioOriginal / 1.20;
                }
                else {
                System.out.println("Error de carga, ingrese nuevamente!");
                }
            }
        }while (precioDescuento != precioOriginal);

        System.out.println("El articulo "+ nombreArticulo + " de precio "+ precioOriginal);
        System.out.println(" que sale en "+ precioDescuento+ " con la clave "+ claveDescuento);
    }

}
