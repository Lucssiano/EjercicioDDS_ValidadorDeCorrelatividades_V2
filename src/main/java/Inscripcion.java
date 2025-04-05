import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>(); // Inicializo la lista
    }

    public Boolean aprobada(){
        return this.materias
                .stream()
                .allMatch(materia -> alumno.aproboCorrelativas(materia));
    }
    public void agregarMaterias(Materia ... materias){
        Collections.addAll(this.materias, materias);
    }
}
