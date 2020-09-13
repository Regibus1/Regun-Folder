/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

/**
 *
 * @author elias
 */
public class Libro {
    
    private String ISBN;
    private String tituloLibro;
    private String autorLibro;
    private int numeroPaginas;

    public Libro(){
        ISBN = "Sin ISBN";
        tituloLibro = "Desconocido";
        autorLibro = "Desconocido";
        numeroPaginas = 0;  
    }

    public Libro(String ISBN, String tituloLibro, String autorLibro, int numeroPaginas) {
        this.ISBN = ISBN;
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.numeroPaginas = numeroPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
 
    @Override
    public String toString(){
        String aux = "El ISBN " + ISBN + " es pertenciente al autor " + autorLibro + 
                " con un numero de " + numeroPaginas + " paginas. ";
        return aux;
    }
}

