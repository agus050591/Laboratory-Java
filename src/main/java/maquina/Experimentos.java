
package maquina;
import java.util.ArrayList;


public abstract class Experimentos {
    
    private String titulo;
    private String descripcion;
    private float presupuesto;
    private ArrayList<EquiposLaboratorio> equipo;
    private Fecha fechaInicio;
    private Fecha fechaFin;

    public Experimentos(){
        
    }

    public Experimentos(String titulo, String descripcion, float presupuesto, ArrayList<EquiposLaboratorio> equipo, Fecha fechaInicio, Fecha fechaFin) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
        this.equipo = equipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setEquipo(ArrayList<EquiposLaboratorio> equipo) {
        this.equipo = equipo;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public ArrayList<EquiposLaboratorio> getEquipo() {
        return equipo;
    }
    
    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }
    
    @Override
    public String toString(){
        return "\nTitulo: "+titulo+" Descripcion: "+descripcion+" Presupuesto: "+presupuesto+" Equipo de Laboratorio: "+equipo.toString()+" Fecha inicio: "+fechaInicio+" Fecha fin: "+fechaFin;
    }
}
