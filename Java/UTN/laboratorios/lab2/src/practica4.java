import java.util.Scanner;

public class practica4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int amount, cash1k = 0, cash5 = 0, cash2 = 0, cash1 = 0;
        int mod1k = 0, mod5 = 0, mod2 = 0;

        System.out.println("Ingrese la cantidad de dinero que quiere retirar (multiplos de 100)");
        amount = lector.nextInt();

        cash1k = amount / 1000;
        mod1k = amount % 1000;
        cash5 = mod1k / 500;
        mod5 = mod1k % 500;
        cash2 = mod5 / 200;
        mod2 = mod5 % 200;
        cash1 = mod2 / 100;

        System.out.print("Retiro con exito: "+ cash1k+ " billete/s de mil");
        if (cash5 > 0){
            System.out.print(" + "+ cash5+ " billete de quinientos");
        }
        if (cash2 > 0){
            System.out.print(" + "+ cash2+ " billete/s de doscientos");
        }
        if (cash1 > 0){
            System.out.println(" + "+ cash1+ " billete de cien");
        }

     }
}
