import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operaciones {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Persona> profesores = new ArrayList<Persona>();
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        ArrayList<Materia> materias = new ArrayList<Materia>();
  

    public Operaciones(){

    }

    public void AgregarProfesor() throws IOException{
        
        System.out.println("Ingrese nombre completo");
        String nom = br.readLine();
        System.out.println("Ingrese Domicilio");
        String dm =  br.readLine();
        System.out.println("Ingrese Email");
        String nr =  br.readLine();
        System.out.println("Ingrese el Nro de registro del Profesor");
        int np = Integer.parseInt(br.readLine());
        System.out.println("Ingrese Teléfono");
        int t = Integer.parseInt(br.readLine());
        
        Persona p = new Persona(nom,dm,nr,np,t);
        profesores.add(p);            
        }

    public void MostrarProfesores(){
        if(profesores.size()<=0){
            System.out.println("Aún no hay profesores registrados");
        }else{ 

            for (Persona profesor: profesores) {
                System.out.println("--");
                System.out.println("Profesor: "+ profesor.getNombre() + ", gmail:" + profesor.getEmail()+", domicilio: " + profesor.getDomicilio()+", Nro Registro: "+ profesor.getNroRegistro()+", teléfono: " + profesor.getTelefono());
                System.out.println("--");
            }
        }
    }
    public void AgregarMateria() throws IOException{
        System.out.println("Ingrese nombre de la materia");
        String n = br.readLine();
        System.out.println("Ingrese Grado de la materia");
        int gm = Integer.parseInt(br.readLine());
        
        Materia m = new Materia(n,gm);
        materias.add(m);            
        }

    public void MostrarMaterias(){
        if(materias.size()<=0){
            System.out.println("Aún no hay materias registradas");
        }else{
            for (Materia materia: materias) {
                System.out.println("--");
                System.out.println("Materia: "+ materia.getMateria() +", grado: "+ materia.getGrado());
                System.out.println("--");
            }
        }
    }

    public void AgregarAlumno() throws  IOException{
        int count = 0;
        System.out.println("Ingrese Grado:");
        int g = Integer.parseInt(br.readLine());
        System.out.println("Ingrese Clificación:");
        int c = Integer.parseInt(br.readLine());
        System.out.println("Ingrese nombre completo");
        String n =br.readLine();
        System.out.println("Ingrese Domicilio");
        String dm = br.readLine();
        System.out.println("Ingrese Email");
        String e = br.readLine();
        System.out.println("Ingrese el Nro de registro del Alumno");
        int na = Integer.parseInt(br.readLine());
        System.out.println("Ingrese Teléfono");
        int t = Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese nro de Registro de profesor");
        int nrp = Integer.parseInt(br.readLine());
        Persona auxProfesor =null ;
        Materia auxMateria = null;
        for(Persona profesor: profesores){
            if(profesor.getNroRegistro() == nrp){
                auxProfesor = profesor;
            }else{
                count++;
            }
        }

        System.out.println("Ingrese el nombre de la materia");
        String mat= br.readLine();
        for(Materia materia: materias){
            if(materia.getMateria().equals(mat)){
                auxMateria = materia;
            }else{
                count++;
            }
        }
        
        if(auxProfesor == null || auxMateria == null || count>0){
                System.out.println("Materia o profesor no existe, asegurate de que esten registrados primero \n");
        }else{
            Alumno a = new Alumno(g,c,n,dm,e,na,t,auxMateria, auxProfesor);
            alumnos.add(a);  
        }
        } 
        
        

    public void MostrarAlumnos(){
        if(alumnos.size()<=0){
            System.out.println("Aún no hay alumnos registrados");
        }else{

            for (Alumno alumno: alumnos) {
                System.out.println("--");
                System.out.println("Alumno: "+ alumno.getNombre() + ", gmail:" + alumno.getEmail()+", domicilio: " + alumno.getDomicilio()+", Nro Registro: "+ alumno.getNroRegistro()+", teléfono: " + alumno.getTelefono()+", profesor: "+ alumno.getProfesor().getNombre()+" , materia: " + alumno.getMateria().getMateria() + ", calificación: " + alumno.getCalificacion());
                System.out.println("--");
            }
        }


    }



    public void EditarMateria() throws IOException{
        Materia auxMateria = null;
        System.out.println("Ingrese el nombre de la materia");
        String mat= br.readLine();
        for(Materia materia: materias){
            if(materia.getMateria().equals(mat)){
                auxMateria = materia;
                // System.out.println(auxMateria.getGrado());
                System.out.println("Ingrese el nuevo grado de la materia");
                int ng = Integer.parseInt(br.readLine());
                auxMateria.setGrado(ng);
               
                System.out.println("Ingrese nuevo nombre de la materia");
                String nn = br.readLine();
               
                    auxMateria.setMateria(nn);
                
            }else{
                System.out.println("No hay materia aún");

            }
        }
        
    }

    public void EditarProfesor() throws IOException{
        Persona auxPersona = null;
        System.out.println("Ingrese el número de registro del profesor");
        int mat= Integer.parseInt(br.readLine());
        for(Persona profesor: profesores){
            if(profesor.getNroRegistro() == mat){
                auxPersona = profesor;
                // System.out.println(auxMateria.getGrad}o());
                
                System.out.println("Ingrese nombre completo");
                    auxPersona.setNombre(br.readLine());
                
                System.out.println("Ingrese Domicilio");
                    auxPersona.setDomicilio(br.readLine());
                
                System.out.println("Ingrese Email");
                    auxPersona.setEmail(br.readLine());
                
                System.out.println("Ingrese el Nro de registro del Profesor");
                auxPersona.setNroRegistro(Integer.parseInt(br.readLine()));

                
                System.out.println("Ingrese Teléfono");
                auxPersona.setTelefono(Integer.parseInt(br.readLine()));

    
            }else{
                System.out.println("No hay materia aún");

            }
        }
        
    }
    public void EditarAlumno() throws IOException{
        Alumno auxAlumno = null;
        int mat;

            System.out.println("Ingrese el número de registro del Alumno");
            mat= Integer.parseInt(br.readLine());
           
        for(Alumno alumno: alumnos){
            if(alumno.getNroRegistro() == mat){
                auxAlumno = alumno;

                System.out.println("Ingrese nombre completo");
                auxAlumno.setNombre(br.readLine());
                
                System.out.println("Ingrese Domicilio");
                auxAlumno.setDomicilio(br.readLine());
                
                System.out.println("Ingrese Email");
                auxAlumno.setEmail(br.readLine());
                
                System.out.println("Ingrese el Nro de registro del Alumno");
                auxAlumno.setNroRegistro(Integer.parseInt(br.readLine()));

               
                System.out.println("Ingrese Teléfono");
                auxAlumno.setTelefono(Integer.parseInt(br.readLine()));

                System.out.println("Ingrese la nueva calificación");
                auxAlumno.setCalificacion(Integer.parseInt(br.readLine()));
               
                String res;
                int count1=0;
                int count2=0;
                do{
                    System.out.println("Deseas modificar el profesor (si) o (no)");
                    res = br.readLine();

                    if(res.equals("si") || res.equals("no")){
                            count1++;
                    }

                }while(count1 <= 0 );

                if(count1 >0 ){
                    EditarProfesor();
                }


                do{
                    System.out.println("Deseas modificar la materia (si) o (no)");
                    res = br.readLine();

                    if(res.equals("si") || res.equals("no")){
                            count2++;
                    }

                }while(count2 <= 0 );

                
                if(count2 >0 ){
                    EditarMateria();
                }

            }else{
                System.out.println("Alumno no encontrado");
            }
        }
        }
        public void Eliminar() throws IOException{
            int res;
            
            do{
                System.out.println("Qué deseas Eliminar (1) Alumno (2) profesor (3) Materia (4) End");
                res = Integer.parseInt(br.readLine());
                switch (res) {
                    case 1:
                        System.out.println("Ingrese el número de registro del Alumno");
                        int nroa= Integer.parseInt(br.readLine());
                    
                        for(int i=0; i<alumnos.size(); i++) {
                            if (alumnos.get(i).getNroRegistro() == nroa) {
                       
                                  alumnos.remove(i);
                                
                              }
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el número de registro del Profesor");
                        int nrop= Integer.parseInt(br.readLine());
                    
                        for(int i=0; i<profesores.size(); i++) {
                            if (profesores.get(i).getNroRegistro() == nrop) {
                                profesores.remove(i);
                            
                            }
                        }
                        break;
                    case 3:
                    System.out.println("Ingrese el Nombre de la materia");
                    String nrom= br.readLine();
                
                    for(int i=0; i<materias.size(); i++) {
                        if (materias.get(i).getMateria().equals(nrom)) {
                            materias.remove(i);
                        }
                    }
                        break;
                    
                    default:
                    System.out.println("Ingresa un valor valido");
                        break;
                }
            }while(res != 4 );
        }
        
    }

