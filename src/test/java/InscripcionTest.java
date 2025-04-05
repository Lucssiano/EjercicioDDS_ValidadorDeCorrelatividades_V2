import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class InscripcionTest {
    @Test
    @DisplayName("Test de una inscripción Desaprobada")
    public void inscripcionVariasMateriasDesaprobada(){
        Materia am1 = new Materia("Analisis Matematico 1");
        Materia aga = new Materia("Algebra");
        Materia f1 = new Materia("Fisica 1");

        Materia am2 = new Materia("Analisis Matematico 2");
        Materia f2 = new Materia("Fisica 2");

        Alumno alumno = new Alumno("Luciano", "Riente", 2084806 );

        alumno.agregarMateriasAprobadas(am1,aga);
        am2.agregarMateriasCorrelativas(am1,aga);
        f2.agregarMateriasCorrelativas(am1,f1,aga);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(am2,f2);

        Assertions.assertFalse(inscripcion.aprobada());
    }
    @Test
    @DisplayName("Test de una inscripción Aprobada")
    public void inscripcionVariasMateriasAprobada(){
        Materia am1 = new Materia("Analisis Matematico 1");
        Materia aga = new Materia("Algebra");
        Materia f1 = new Materia("Fisica 1");

        Materia am2 = new Materia("Analisis Matematico 2");
        Materia f2 = new Materia("Fisica 2");

        Alumno alumno = new Alumno("Luciano", "Riente", 2084806 );

        alumno.agregarMateriasAprobadas(am1,aga, f1);
        am2.agregarMateriasCorrelativas(am1,aga);
        f2.agregarMateriasCorrelativas(am1,f1,aga);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(am2,f2);

        Assertions.assertTrue(inscripcion.aprobada());
    }
}

// probar más tests