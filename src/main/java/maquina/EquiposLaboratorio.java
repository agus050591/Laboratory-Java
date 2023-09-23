
package maquina;


public class EquiposLaboratorio {
    
    private String nombre;
    private String descripcion;
    private int area;

    public EquiposLaboratorio() {
    }

    public EquiposLaboratorio(String nombre, String descripcion, int area) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.area = area;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getArea() {
        return area;
    }
    
    @Override
    public String toString(){
        return "\nNombre: "+nombre+" Descripcion: "+descripcion+" Area: "+area;
    }
}
