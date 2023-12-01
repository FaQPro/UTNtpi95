
package com.mycompany.utntpi95;

/**
 *
 * @author FacuPro
 */
public class Equipo1 extends Equipo{
    
    public Equipo1() {
        
        super("River", 11, 7, "Marcelo Gallardo", 1, 3, true);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Partidos Jugados: " + partidosJugados + ", Puntos: " + puntos);
    }

    @Override
    public int jugarPartido(Equipo equipo1) {
        
        return this.partidosJugados +=1; 
    }
    




    
    
    
}
