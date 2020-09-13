
package com.ejemplo;

import com.ejemplo.dominio.Libro;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class Ejecutable {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        Libro libroUno = new Libro();
        
        libroUno.setISBN("4256-254123-90");
        libroUno.setTituloLibro("Dark Tower");
        libroUno.setAutorLibro("Stephen King");
        libroUno.setNumeroPaginas(492);
        
        Libro libroDos = new Libro();
        
        System.out.println(libroUno);
        System.out.println(libroDos.toString());
        
    }
}
