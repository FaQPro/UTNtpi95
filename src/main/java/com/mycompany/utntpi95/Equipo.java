
package com.mycompany.utntpi95;



/**
 * @author FacuPro
 */
public abstract class Equipo {
    
    protected String nombre;
    protected int titulares;
    protected int suplentes;
    protected String directorTecnico;
    protected int partidosJugados;
    protected int puntos;
    protected boolean estado;

    public Equipo() {
    }

    public Equipo(String nombre, int titulares, int suplentes, String directorTecnico, int partidosJugados, int puntos, boolean estado) {
        this.nombre = nombre;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.directorTecnico = directorTecnico;
        this.partidosJugados = partidosJugados;
        this.puntos = puntos;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTitulares() {
        return titulares;
    }

    public void setTitulares(int titulares) {
        this.titulares = titulares;
    }

    public int getSuplentes() {
        return suplentes;
    }

    public void setSuplentes(int suplentes) {
        this.suplentes = suplentes;
    }

    public String getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public Equipo crearEquipo (){
    return null;
    }
    
     public Equipo modificarEquipo(){
    return null;
    }
    
     public boolean eliminarEquipo(){
     return this.estado = false;
     } 
    
     public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Partidos Jugados: " + partidosJugados + ", Puntos: " + puntos);
    }
     
    public int jugarPartido(Equipo equipo1){
        
          return this.partidosJugados +=1;   
       
    }

     public void resultadoPartido(Equipo equipo1, Equipo equipo2) {
       
        System.out.println("Resultados del partido:");
        
        
        // Línea
        System.out.println("-------------------------------");

       

    }

 
}
