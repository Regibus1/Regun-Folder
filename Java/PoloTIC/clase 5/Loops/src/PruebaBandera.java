import java.util.Scanner;

public class PruebaBandera {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            System.out.println("Digite un numero por teclado: ");
            int tecla = lector.nextInt();

            if (tecla == 1){
                flag = false;
            }

        }
    }
}
