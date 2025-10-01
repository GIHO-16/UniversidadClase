package model;
import java.util.ArrayList;
public class EstudiantePregrado extends Estudiante{
    protected boolean beca;
    protected double promedioAcumulado;
    public EstudiantePregrado(String identificacion, String nombre, String programa, int semestre, String id, ArrayList<Materia> listaMaterias, double promedioAcumulado) {
        super(identificacion,listaMaterias, semestre, nombre);

        this.promedioAcumulado = promedioAcumulado;
        this.beca = beca;
    }
    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }
}
