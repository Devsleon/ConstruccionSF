import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private int id;
    private String nombre;
    private int creditos;
    private Aula aula;
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesMatriculados;
    
    // Constructor
    public Asignatura(int id, String nombre, int creditos, Aula aula) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.aula = aula;
        this.estudiantesInscritos = new ArrayList<>();
        this.estudiantesMatriculados = new ArrayList<>();
    }
    
    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public List<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public List<Estudiante> getEstudiantesMatriculados() {
        return estudiantesMatriculados;
    }
    
    // Métodos para inscribir y matricular estudiantes
    public boolean inscribirEstudiante(Estudiante estudiante) {
        if (!estudiantesInscritos.contains(estudiante)) {
            estudiantesInscritos.add(estudiante);
            return true;
        }
        return false;
    }

    public boolean matricularEstudiante(Estudiante estudiante) {
        if (estudiantesInscritos.contains(estudiante) && !estudiantesMatriculados.contains(estudiante)) {
            estudiantesMatriculados.add(estudiante);
            return true;
        }
        return false;
    }
}
