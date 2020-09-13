import java.util.Calendar;
import java.util.Scanner;

public class practica3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int birthYear, actualYear, ageClient;

        System.out.println("Ingrese por el teclado el año de su nacimiento  y la maquina le calculara su edad: ");
        birthYear = lector.nextInt();

        actualYear = Calendar.getInstance().get(Calendar.YEAR);
        ageClient = actualYear - birthYear;

        System.out.println("Tu edad al final del año será: "+ ageClient+ " años");
    }
}
