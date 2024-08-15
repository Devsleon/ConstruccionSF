import java.util.Date;

public class Matricula {
    private int id;
    private Date fecha;
    private Estudiante estudiante;
    private Asignatura asignatura;
    
    // Constructor
    public Matricula(int id, Date fecha, Estudiante estudiante, Asignatura asignatura) {
        this.id = id;
        this.fecha = fecha;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }
    
    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
