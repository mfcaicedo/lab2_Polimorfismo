package modelo;

import java.util.Date;

/**
 *
 * @author Milthon F Caicedo 
 */
public class ViajeFamiliar extends Viaje {
    
    /**
     * Atributos 
     * @return 
     */
    private int familia; 
    /**
     * Constructor 
     * @return 
     */
    public ViajeFamiliar(){
        
    }
    public ViajeFamiliar(int familia, String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada){
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }
    /**
     * Getters and setters
     * @return 
     */
    public int getFamilia() {
        return familia;
    }
    public void setFamilia(int familia) {
        this.familia = familia;
    }
    /**
     * Métodos
     * @return 
     */
    @Override
    public String descripcion() {
       return "Viaje para disfrutar con toda tu familia";
    }
    
}
