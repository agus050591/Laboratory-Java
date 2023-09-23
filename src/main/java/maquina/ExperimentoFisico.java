
package maquina;

import java.util.ArrayList;


public class ExperimentoFisico extends Experimentos{
    
    private String fenomenoEstudiado;

    public ExperimentoFisico() {
    }

    public ExperimentoFisico(String titulo, String descripcion, float presupuesto, ArrayList<EquiposLaboratorio> equipo, Fecha fechaInicio, Fecha fechaFin) {
        super(titulo, descripcion, presupuesto, equipo, fechaInicio, fechaFin);
    }

    public void setFenomenoEstudidado(String fenomenoEstudidado) {
        this.fenomenoEstudiado = fenomenoEstudidado;
    }

    public String getFenomenoEstudidado() {
        return fenomenoEstudiado;
    }
    
    @Override
    public String toString(){
        return super.toString()+" Fenomeno Estudiado: "+fenomenoEstudiado;
    }
}
