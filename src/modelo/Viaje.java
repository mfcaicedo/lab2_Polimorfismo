package modelo;

import java.util.Date;

/**
 *
 * @author Milthon F Caicedo 
 */
public abstract class Viaje {
    /**
     * Atributos 
     */
    protected String origen; 
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;
    
    /**
     * Constructor 
     */
    public Viaje(){

    }
    public Viaje(String origen , String destino, int costo, Date fechaSalida, Date fechaLlegada){
        this.origen = origen; 
        this.destino = destino; 
        this.costo = costo; 
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada; 
    }
    /**
     * Getters and setters 
     */
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    /**
     * Métodos y funciones 
     */
    public abstract String descripcion ();


}//Fin de la clase 
