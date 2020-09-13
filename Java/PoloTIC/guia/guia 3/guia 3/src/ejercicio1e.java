import java.util.Scanner;

public class ejercicio1e {

    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        int DNI, tipoServicio;
        double montoPago;
        boolean servicioCorrecto = false;
        String decimalFormat = "";

        for (int i = 0; i < 5; i++) {

            System.out.println("Indique su DNI");
            DNI = miEscaner.nextInt();

            do{
            System.out.println("Indique el tipo de servicio que tiene contratado(30, 50 y 100)");
            tipoServicio = miEscaner.nextInt();


                switch (tipoServicio) {
                    case 30:
                        montoPago = 750 / 1.10;
                        servicioCorrecto = true;
                        decimalFormat = String.format("%.2f", montoPago);
                        break;

                    case 50:
                        montoPago = 930 / 1.05;
                        servicioCorrecto = true;
                        decimalFormat = String.format("%.2f", montoPago);
                        break;

                    case 100:
                        montoPago = 1200;
                        servicioCorrecto = true;
                        decimalFormat = String.format("%.2f", montoPago);
                        break;

                    default:
                        System.out.println("Tipo de plan incorrecto");

                }
            }while(!servicioCorrecto);

            System.out.println("Cliente "+ (i+1)+ " DNI "+ DNI);
            System.out.println("Plan de "+ tipoServicio+ " MB");
            System.out.println("El monto de su factura es $" + decimalFormat);
            System.out.println("");

        }
    }
}
