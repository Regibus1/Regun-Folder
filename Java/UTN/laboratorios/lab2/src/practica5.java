import java.util.Scanner;

public class practica5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double radioEsfera, volumenEsfera;

        System.out.println("Ingrese el radio de la esfera");
        radioEsfera = lector.nextDouble();

        volumenEsfera = (4 / 3) * Math.PI * Math.pow(radioEsfera, 3);

        System.out.println("Volumen de la esfera es: "+ volumenEsfera);
    }
}
