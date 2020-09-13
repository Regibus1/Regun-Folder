package ejecutable;

import java.util.Scanner;

/*e) En tres vectores diferentes se guardan los datos de temperaturas máximas y
     mínimas de 5 ciudades de Misiones. En el primer vector se guardan los
     nombres de las ciudades, en el segundo las temperaturas mínimas alcanzadas
     y en el tercero las temperaturas máximas alcanzadas en la última semana. 
    
    Se necesita un programa que permita la carga de las ciudades, sus temperaturas
     mínimas y máximas; además, deberá poder informar por pantalla cual fue la
     ciudad con la temperatura más baja y cual con la temperatura más alta (dando
     a conocer al mismo tiempo la cantidad de grados). */

//Realizado por Abdias Jimenez Agosto 2020
public class Ejecutable {

    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        Scanner miEscanerNumeros = new Scanner(System.in);
        
        String ciudadesMisiones[] = new String[5];
        float temperaturaMinima[] = new float[5];
        float temperaturaMaxima[] = new float[5];
        int posicionMenor = 0, posicionMayor = 0;
        float temperaturaMenor = 99, temperaturaMayor = -99;
        
        
        for (int i = 0; i < ciudadesMisiones.length; i++) {
            System.out.println("Ingrese la ciudad");
            ciudadesMisiones[i] = miEscaner.nextLine();

            System.out.println("Indique la temperatura mas baja registra en " + ciudadesMisiones[i]);
            temperaturaMinima[i] = miEscanerNumeros.nextFloat();

            System.out.println("y la mas alta registrada");
            temperaturaMaxima[i] = miEscanerNumeros.nextFloat();
            
            if(temperaturaMinima[i]<temperaturaMenor){
                    temperaturaMenor = temperaturaMinima[i];
                    posicionMenor = i;
                }
            
            if(temperaturaMaxima[i]>temperaturaMayor){
                temperaturaMayor = temperaturaMaxima[i];
                posicionMayor = i;
            }
        }
        System.out.println(" ");
        System.out.println(ciudadesMisiones[posicionMenor]+ " tiene la temperatura mas baja registrada");
        System.out.println("con una temperatura de " + temperaturaMenor + " C°.");
        System.out.println(" ");
        System.out.println("Mientras que " + ciudadesMisiones[posicionMayor] + " tiene la más alta registrada");
        System.out.println("con una temperatura de " + temperaturaMayor + " C°");
    }

}
