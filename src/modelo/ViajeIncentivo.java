package modelo;

import java.util.Date;

/**
 *
 * @author Milthon F Caicedo 
 */
public class ViajeIncentivo extends Viaje {
    /**
     * Atributos 
     */
    private String empresa;
    
    /**
     * Constructor 
     */
    public ViajeIncentivo(){
        
    }
    public ViajeIncentivo(String empresa, String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada){
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }

    /**
     * Getters and setters
     */
    public String getEmpresa() {
        return empresa;
    }
    public void setFamilia(String empresa) {
        this.empresa = empresa;
    }

    /**
     * Métodos y funciones
     * @return 
     */
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }
    
}
