
package com.mycompany.utntpi95;


/**

 * @author FacuPro
 */
public class UTNtpi95 {

    public static void main(String[] args) {
        
       //Crear equipos usando clases hijas que heredan de clase abstracta 
        Equipo1 River = new Equipo1();
        Equipo2 Racing = new Equipo2();
        // usa cada equipo sus metodos abstractos de diferente manera 
        //River.mostrarInformacion();
        //Racing.mostrarInformacion();
        //Creo Torneo 
        Torneo Fecha1 = new Torneo();
        //Jugan Partido y Define Ganador 
        Fecha1.resultadoPartido(River, Racing);
        
        
        
     
        
    }
}

