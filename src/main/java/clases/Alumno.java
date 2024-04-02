package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;


    public void aprobar (Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public boolean aprobo (Materia materia) {
        return materiasAprobadas.contains(materia);
    }
}
