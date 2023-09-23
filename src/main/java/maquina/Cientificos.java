
package maquina;


public class Cientificos {
    
    private String nombre;
    private int edad;
    private String especialidad;
    private Fecha contratacion;
    private int cantExperimentos;

    public Cientificos() {
    }
    
    public Cientificos(String nombre, int edad, String especialidad, Fecha contratacion, int cantExperimentos) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
        this.contratacion = contratacion;
        this.cantExperimentos = cantExperimentos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setContratacion(Fecha contratacion) {
        this.contratacion = contratacion;
    }

    public void setCantExperimentos(int cantExperimentos) {
        this.cantExperimentos = cantExperimentos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Fecha getContratacion() {
        return contratacion;
    }

    public int getCantExperimentos() {
        return cantExperimentos;
    }
    
    @Override
    public String toString(){
        return "\nNombre: "+nombre+"Edad: "+edad+"Especialidad: "+especialidad+"Contratacion: "+contratacion+"Cantidad Experimento: "+cantExperimentos;
    }
}
