package modelo;

import java.util.Date;

/**
 *
 * @author Milhon F Caicedo 
 */
public class ViajeTodoIncluido extends Viaje {

     /**
     *Constructor 
     */
    public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada){
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
    /**
     * Métodos
     * @return 
     */
    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
   
    
}
