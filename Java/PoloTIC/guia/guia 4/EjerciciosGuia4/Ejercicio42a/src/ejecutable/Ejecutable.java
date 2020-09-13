package ejecutable;
/* a) Llevar a cabo un programa que permite cargar completamente con números 5
     una matriz de 4x5 (4 filas, 5 columnas). */

//Realizado por Abdias Jimenez Agosto 2020
public class Ejecutable {

    public static void main(String[] args) {
       int matrizDeCincos[][]= new int [4][5];
    
        for (int f = 0; f < matrizDeCincos.length; f++) {
            for (int c = 0; c < matrizDeCincos[f].length; c++) {
                matrizDeCincos[f][c] = 5;
                System.out.print(matrizDeCincos[f][c] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
