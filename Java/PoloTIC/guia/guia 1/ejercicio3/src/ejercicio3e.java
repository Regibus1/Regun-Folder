import java.util.Scanner;

/*e) Realizar un programa que permita a un profesor calcular el promedio de un
     alumno. Para esto, el algoritmo debe permitir ingresar las 4 notas del
     mismo(por ejemplo, 8, 7, 9.50 y 10), luego calcular el promedio de las
     mismas y mostrar el resultado por pantalla. Se recuerda que el promedio es
     la suma de todas las notas dividido la cantidad, en el ejemplo sería:
     (8+7+9.50+10)/4.*/

public class ejercicio3e {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double promedioEstudiante, sumaNotas = 0, nota;
        int i = 0;

        while (i < 4){
            i++;
            System.out.println("Coloque la calificación N" +i);
            nota = lector.nextDouble();

            sumaNotas = nota + sumaNotas;
        }

        promedioEstudiante = sumaNotas / i;

        System.out.println("El promedio del estudiante es: " +promedioEstudiante);
    }
}
