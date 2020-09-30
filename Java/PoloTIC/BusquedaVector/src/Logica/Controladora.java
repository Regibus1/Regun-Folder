
package Logica;

/**
 *
 * @author elias
 */
public class Controladora {
    String nombres[] = new String[5];
    int ultimaPosicion = 0;
    
    public void cargarNombres(String nomCargar){
        
        if(nombres[ultimaPosicion] == null){
            nombres[ultimaPosicion]= nomCargar;
            ultimaPosicion++;
            
        }
    }
    
    public boolean buscarNombre(String nomBuscar){
        
        boolean estaONo = false;
        
        for(int i = 0; i < nombres.length; i++){
            if(nombres[i].equals(nomBuscar)){
                estaONo = true;
                break;
            }
        }
        
        return estaONo;
        
    }
}
