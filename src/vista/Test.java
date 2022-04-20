package vista;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import modelo.Viaje;
import modelo.ViajeFamiliar;
import modelo.ViajeIncentivo;
import modelo.ViajeIndividual;
import modelo.ViajeTodoIncluido;

/**
 *
 * @author Milthon F Caicedo 
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
    /**
    * Arreglo polimorfismo de viajes 
    */
    public static List<Viaje> viajes = new ArrayList();
    
    public static void main(String[] args) {
        // TODO code application logic here
        leerViajes(); 
        mostrarViajes();
        
   
    }
    /**
     * Métodos
     */
     public static void leerViajes() {
            try {
            Viaje viaje1 = new ViajeFamiliar(5,"Popayán", "Bogotá", 1250000, new 
            SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new
            SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"));
            viajes.add(viaje1);
            Viaje viaje2 = new ViajeIncentivo("Emtel","Popayán", "Medellin", 2100000, new
            SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
            SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
            viajes.add(viaje2);
            Viaje viaje3 = new ViajeIndividual("Popayán", "San Andres", 4250000,
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
            SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje3);
            Viaje viaje4 = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000,
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
            SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje4);
            } catch (ParseException ex) {
                System.out.println("Hubo un error");
            }
        }
        /**
        * Recorre e imprime datos del arreglo polimófico
        */
        public static void mostrarViajes() {
            // En este caso vemos que todos los viajes ejecutan el método
            //"descripcion()" de forma diferente
            // ya que al ser este método abstracto en la clase padre, les forzamos a
            //las clases hijas a que
            // implementen ese método.
            for (Viaje viaje : viajes) {
                System.out.println("Origen: " + viaje.getOrigen());
                System.out.println("Destino: " + viaje.getDestino());
                System.out.println("Fecha salida: " + viaje.getFechaSalida());
                System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
                System.out.println("Costo: " + viaje.getCosto());
                System.out.println("Descripción: " + viaje.descripcion());
                System.out.println("");
            }
        }
    
}//Fin de la clase 
