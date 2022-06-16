
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// !Scanner sc = new Scanner(System.in);
		// ?ArrayList profesores = new ArrayList();
		// *ArrayList alumnos = new ArrayList();
		// TODO: ArrayList materias = new ArrayList();
		
		Operaciones registro = new Operaciones();

		int res;
		System.out.println("Iniciando el programa ....");

		do {
			System.out.println("Elige una alternativa (1) Agregar profesor, (2) Agregar materia, (3) Agregar alumno (4) Listar alumnos (5) Listar Profesores (6) Listar materias, (7) Editar Materia (8) Editar profesor (9) Editar Alumno (10) Eliminar (11) End");
			res = Integer.parseInt(br.readLine());
			switch (res) {
				case 1:
					registro.AgregarProfesor();
				
					break;
				case 2:
					registro.AgregarMateria();
				
					break;
				case 3:
					registro.AgregarAlumno();
				
					break;
				case 4:
					registro.MostrarAlumnos();
				
					break;
				case 5:
					registro.MostrarProfesores();
				
					break;
				case 6:
					registro.MostrarMaterias();
				
					break;
				case 7:
					registro.EditarMateria();
				
					break;
				case 8:
					registro.EditarProfesor();
				
					break;
				case 9:
					registro.EditarAlumno();
	
					break;
				case 10:
					registro.Eliminar();
	
					break;
				default:
					break;
			}
		} while (res != 11);


	}
}

