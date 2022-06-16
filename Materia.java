public class Materia{
    private String materia;
    private int grado;

    public Materia(String materia, int grado){
        this.materia = materia;
        this.grado = grado;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public String getMateria(){
        return materia;
    }
    public void setGrado(int grado){
        this.grado = grado;
    }
    public int getGrado(){
        return grado;
    }
}