package clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public void agregarMaterias (Materia ... materias){
        Collections.addAll(this.materias, materias);
    }
    public boolean aprobada(){

        if(materias.isEmpty()){
            return false;
        }

        return materias.stream().allMatch(materia -> materia.puedeSerCursadaPor((alumno)));
    }
}
