import clases.Alumno;
import clases.Inscripcion;
import clases.Materia;

import clases.NombreMateria;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {


    @Test
    public void inscripcionAprobada() {
        // Las materias a las que se va a inscribir no tienen correlativas, por lo tanto se aprueba la inscripcion
        Materia discreta = new Materia(NombreMateria.DISCRETA, new ArrayList<>());
        Materia diseno = new Materia(NombreMateria.DISENO, new ArrayList<>());

        Materia ops = new Materia(NombreMateria.OPERATIVOS, new ArrayList<>());

        Alumno alumno = new Alumno("Juan" );

        alumno.aprobar(ops);
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(discreta, diseno);
        Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionRechazada() {

        // Discreta tiene como correlativa Diseno y el alumno no la tiene aprobada, solo aprobo Operativos, entonces sale rechazada
        Materia diseno = new Materia(NombreMateria.DISENO, new ArrayList<>());

        List <Materia> corrDisc = new ArrayList<>();
        corrDisc.add(diseno);

        Materia discreta = new Materia(NombreMateria.DISCRETA, corrDisc);

        Materia ops = new Materia(NombreMateria.OPERATIVOS, new ArrayList<>());

        Alumno alumno = new Alumno("Juan" );

        alumno.aprobar(ops);


        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(discreta);

        Assert.assertFalse(inscripcion.aprobada());
    }
}
