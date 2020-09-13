import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite un numero entero: ");
        int num = lector.nextInt();

        if(num % 2 == 0){
            System.out.println("Tu numero es par");
        }
        else {
            System.out.println("Tu numero es impar");
        }
    }
}

