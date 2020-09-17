package Logica;

/**
 *
 * @author elias
 */
public class Controladora {
    
    //Metodos:
    public double calcularSuma(double numUno, double numDos){
       
        double suma = numUno + numDos;
        return suma;
    }
    
    public double calcularResta(double num1, double num2){
        
        double resta = num1 - num2;
        return resta;
    }
    
    public double calcularProducto(double num1, double num2){
        
        double producto = num1 * num2;
        return producto;
    }
    
    public double calculaCociente(double num1, double num2){
        
        double cociente = num1 / num2;
        return cociente;
    }
}
