import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private int id;
    private String nombre;
    private int creditosMaximos;
    private int creditosInscritos;
    private int creditosMatriculados;
    private List<Asignatura> asignaturasInscritas;
    private List<Asignatura> asignaturasMatriculadas;
    
    // Constructor
    public Estudiante(int id, String nombre, int creditosMaximos) {
        this.id = id;
        this.nombre = nombre;
        this.creditosMaximos = creditosMaximos;
        this.creditosInscritos = 0;
        this.creditosMatriculados = 0;
        this.asignaturasInscritas = new ArrayList<>();
        this.asignaturasMatriculadas = new ArrayList<>();
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

    public int getCreditosMaximos() {
        return creditosMaximos;
    }

    public void setCreditosMaximos(int creditosMaximos) {
        this.creditosMaximos = creditosMaximos;
    }

    public int getCreditosInscritos() {
        return creditosInscritos;
    }

    public int getCreditosMatriculados() {
        return creditosMatriculados;
    }

    public List<Asignatura> getAsignaturasInscritas() {
        return asignaturasInscritas;
    }

    public List<Asignatura> getAsignaturasMatriculadas() {
        return asignaturasMatriculadas;
    }

    // Métodos para inscribir y matricular asignaturas
    public boolean inscribirAsignatura(Asignatura asignatura) {
        if (creditosInscritos + asignatura.getCreditos() <= creditosMaximos) {
            asignaturasInscritas.add(asignatura);
            creditosInscritos += asignatura.getCreditos();
            return true;
        }
        return false;
    }

    public boolean matricularAsignatura(Asignatura asignatura) {
        if (asignaturasInscritas.contains(asignatura)) {
            asignaturasMatriculadas.add(asignatura);
            creditosMatriculados += asignatura.getCreditos();
            return true;
        }
        return false;
    }
}
