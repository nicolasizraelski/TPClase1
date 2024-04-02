package clases;

import java.util.List;

public class Materia {
    private NombreMateria nombre;
    private List<Materia> materiasCorrelativas;

    public Materia(NombreMateria nombre, List<Materia> materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public boolean puedeSerCursadaPor (Alumno alumno){
        return materiasCorrelativas.stream().allMatch(alumno::aprobo);
    }
}
