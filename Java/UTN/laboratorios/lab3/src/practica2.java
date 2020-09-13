import java.util.Scanner;

public class practica2 {

    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        int leapYear;
        boolean esBisiesto = false;

        System.out.println("Ingrese un año y se comprobara si es bisiesto");
        leapYear = miEscaner.nextInt();

        if (leapYear % 4 == 0 && (leapYear % 100 != 0 || leapYear % 400 == 0)){
            esBisiesto = true;
        }

        if (esBisiesto){
            System.out.println("El año "+leapYear+ " si es bisiesto.");
        }
        else {
            System.out.println("No es bisiesto");
        }
    }
}
