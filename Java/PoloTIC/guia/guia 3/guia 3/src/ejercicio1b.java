import java.util.Scanner;

public class ejercicio1b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite;

        System.out.println("Indique el límite de la lista numérica");
        limite = teclado.nextInt();

        for (int i = 0; i < limite; i++) {
            System.out.println((i+1)+".");
        }

    }
}
