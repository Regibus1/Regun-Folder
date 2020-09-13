    /*g) Realizar un programa que permita intercambiar el valor de dos variables.
         Por ejemplo, si la variable1 vale 5 y la variable2 vale 12, hacer que la
         variable1 valga 12 y la variable2 valga 5. Tener en cuenta que al asignar
         un valor a una variable se sobrescribe el valor anterior.*/

    public class ejercicio3g {

    public static void main(String[] args) {
        char a = 'a';
        char b ='b';
        char aux = ' ';

        aux = a;
        a = b;
        b = aux;

        System.out.println("Este es b igual "+ b);
        System.out.println("y este a igual " + a);
    }
}
