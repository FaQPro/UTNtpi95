
package com.mycompany.utntpi95;

import java.util.Random;

/**
 * @author FacuPro
 */
public class Torneo extends Equipo {


        public int obtenerResultadoAleatorio() {
        Random random = new Random();
        return random.nextInt(11);
    }

    @Override
    public void resultadoPartido(Equipo equipo1, Equipo equipo2) {
        int resultadoEquipo1 = obtenerResultadoAleatorio();
        int resultadoEquipo2 = obtenerResultadoAleatorio();

        System.out.println("Resultados del partido:");
        System.out.println("Equipo " + equipo1.getNombre() + ": " + resultadoEquipo1);
        System.out.println("Equipo " + equipo2.getNombre() + ": " + resultadoEquipo2);
    
         // Determinar al ganador
        if (resultadoEquipo1 > resultadoEquipo2) {
            equipo1.puntos+=3;  // Ganador Equipo1
            System.out.println("El equipo " + equipo1.getNombre()+ " es el ganador.");
        } else if (resultadoEquipo2 > resultadoEquipo1 || resultadoEquipo1<resultadoEquipo2) {
            equipo2.puntos+=3;  // Ganador Equipo2
            System.out.println("El equipo " + equipo2.getNombre()+ " es el ganador.");
        } else{
            equipo1.puntos+=1;  // Empate de equipo1 
            equipo2.puntos+=1;  // Empate de equipo2
            System.out.println("Partido Empatado");
        }
        
    }
    
        
}
