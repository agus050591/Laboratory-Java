
package maquina;

import java.util.ArrayList;


public class ExperimentosBiologicos extends Experimentos{
    
    private String organismo;

    public ExperimentosBiologicos() {
    }

    public ExperimentosBiologicos(String titulo, String descripcion, float presupuesto, ArrayList<EquiposLaboratorio> equipo, Fecha fechaInicio, Fecha fechaFin) {
        super(titulo, descripcion, presupuesto, equipo, fechaInicio, fechaFin);
    }

    public void setOrganismo(String organismo) {
        this.organismo = organismo;
    }

    public String getOrganismo() {
        return organismo;
    }
    
    @Override
    public String toString(){
        return super.toString()+" Organismo: "+organismo;
    }
}
