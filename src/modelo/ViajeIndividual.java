package modelo;

import java.util.Date;

/**
 *
 * @author Milthon F Caicedo 
 */
public class ViajeIndividual extends Viaje {

    /**
     * Constructor 
     */
    public ViajeIndividual(){
        
    }
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada){
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
    /**
     * Métodos y funciones 
     * @return 
     */
    @Override
    public String descripcion() {
       return "Disfruta tu viaje individual!!";
    }
    
}
