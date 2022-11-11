
package entity;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String carrera;
    private String ciclo;
    private String turno;
    private String fecha;
    private String modalidad;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, String carrera, String ciclo, String turno, String fecha, String modalidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.ciclo = ciclo;
        this.turno = turno;
        this.fecha = fecha;
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    
}
