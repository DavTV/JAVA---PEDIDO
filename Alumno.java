public class Alumno extends Persona {
    private int grado, calificacion;
    private Materia materia;
    private Persona profesor;
    public Alumno(int grado, int calificacion, String nombre,String domicilio,String email, int nroRegistro, int telefono, Materia materia, Persona profesor) {
        super(nombre, domicilio, email, nroRegistro, telefono);
        this.grado = grado;
        this.calificacion = calificacion;
        this.profesor= profesor;
        this.materia= materia;
    }
    public void setGrado(int grado) {
        this.grado = grado;
    }
    public int getGrado() {
        return grado;
    }
    public void setCalificacion(int grado) {
        this.grado = grado;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setProfesor(Persona profesor) {
        this.profesor = profesor;
    }
    public Persona getProfesor() {
        return profesor;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public Materia getMateria() {
        return materia;
    }

}