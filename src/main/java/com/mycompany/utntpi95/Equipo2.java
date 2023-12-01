
package com.mycompany.utntpi95;

/**
 * @author FacuPro
 */
public class Equipo2 extends Equipo{


    public Equipo2() {
        super("Racing", 11, 7, "Gago", 1, 0, true);
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Partidos Jugados: " + partidosJugados + ", Puntos: " + puntos);
    }
    
    
    
}
