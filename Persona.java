public class Persona{
    private String nombre, domicilio, email;
    private int nroRegistro, telefono; 

    public Persona(String nombre, String domicilio, String email, int nroRegistro, int telefono){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.nroRegistro = nroRegistro;
        this.telefono = telefono;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    public String getDomicilio()
    {
        return domicilio;
    }
    public void setEmail( String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setTelefono( int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setNroRegistro( int nroRegistro){
        this.nroRegistro = nroRegistro;
    }
    public int getNroRegistro(){
        return nroRegistro;
    }
}