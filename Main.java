package proyecto1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        List<Materia> materias = new ArrayList<>();
        List<Alumno> alumnos = new ArrayList<>(); 
        List<Profesor> profesores = new ArrayList<>();
        List<CicloLectivo> ciclosLectivos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Agregar Materia");
            System.out.println("2. Ver Lista de Materias");
            System.out.println("3. Agregar Alumno");
            System.out.println("4. Agregar Docente");
            System.out.println("5. Agregar Ciclo Lectivo");
            System.out.println("6. Agregar Comision");
            System.out.println("7. Asignar Docentes a Commision");
            System.out.println("8. Agregar Correlatividad");
            System.out.println("9. Eliminar Correlatividad");
            System.out.println("10. Inscribir Alumno a Comision");
            System.out.println("11. Asignar Profesor a Comision");
            System.out.println("12. Asignar Aula a Comision");
            System.out.println("13. Registrar Nota");
            System.out.println("14. Obtener Materias Aprobadas de Alumno");
            System.out.println("15. Obtener Notas");
            System.out.println("16. Obtener Materias Que Faltan Cursar");
            System.out.println("17. Calcular Promedio");
            System.out.println("18. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el ID de la materia: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // buffer
                    System.out.print("Ingresa el nombre de la materia: ");
                    String nombre = scanner.nextLine();

                    Materia nuevaMateria = new Materia(id, nombre);

                    boolean existeMateria = materias.stream().anyMatch(m -> m.getId() == nuevaMateria.getId());

                    if (!existeMateria) {
                        materias.add(nuevaMateria);
                        System.out.println("Materia agregada exitosamente.");
                    } else {
                        System.out.println("Ya existe una materia con el mismo ID. No se pudo agregar.");
                    }
                    break;
                
                case 2:
                    System.out.println("Lista de Materias:");
                    for (Materia materia : materias) {
                        System.out.println("ID: " + materia.getId() + ", Nombre: " + materia.getNombre());
                    }
                    break;
                
                case 3:
                    System.out.print("Ingrese el DNI del alumno: ");
                    int dni = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombreAlumno = scanner.nextLine(); 
                    System.out.print("Ingrese el apellido del alumno: ");
                    String apellido = scanner.nextLine();

                    boolean existeAlumno = alumnos.stream().anyMatch(a -> a.getDni() == dni);

                    if (!existeAlumno) {
                        Alumno nuevoAlumno = new Alumno(dni, nombreAlumno, apellido);
                        alumnos.add(nuevoAlumno);
                        System.out.println("Alumno agregado con éxito.");
                    } else {
                        System.out.println("Ya existe un alumno con el mismo DNI. No se pudo agregar.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el DNI del docente: ");
                    int dniProfesor = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del docente: ");
                    String nombreProfesor = scanner.nextLine();
                    System.out.print("Ingrese el apellido del docente: ");
                    String apellidoProfesor = scanner.nextLine();

                    boolean existeProfesor = profesores.stream().anyMatch(p -> p.getDni() == dniProfesor);

                    if (!existeProfesor) {
                        Profesor nuevoProfesor = new Profesor(dniProfesor, nombreProfesor, apellidoProfesor);
                        profesores.add(nuevoProfesor);
                        System.out.println("Docente agregado con éxito.");
                    } else {
                        System.out.println("Ya existe un docente con el mismo DNI. No se pudo agregar.");
                    }
                    break;
                    
                case 5:
                    System.out.print("Ingrese la fecha de inicio del ciclo lectivo (dd/mm/yyyy): ");
                    String fechaInicioStr = scanner.nextLine();
                    Date fechaInicio = parseFecha(fechaInicioStr);

                    System.out.print("Ingrese la fecha de finalización del ciclo lectivo (dd/mm/yyyy): ");
                    String fechaFinalizacionStr = scanner.nextLine();
                    Date fechaFinalizacion = parseFecha(fechaFinalizacionStr);

                    System.out.print("Ingrese la fecha de inicio de inscripciones (dd/mm/yyyy): ");
                    String fechaInscripcionInicioStr = scanner.nextLine();
                    Date fechaInscripcionInicio = parseFecha(fechaInscripcionInicioStr);

                    System.out.print("Ingrese la fecha de finalización de inscripciones (dd/mm/yyyy): ");
                    String fechaInscripcionFinStr = scanner.nextLine();
                    Date fechaInscripcionFin = parseFecha(fechaInscripcionFinStr);

                    CicloLectivo nuevoCiclo = new CicloLectivo(fechaInicio, fechaFinalizacion, fechaInscripcionInicio, fechaInscripcionFin);
                    ciclosLectivos.add(nuevoCiclo);
                    System.out.println("Ciclo lectivo agregado con éxito.");
                    break;

                case 18:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("La opcion no es valida. Intenta nuevamente.");
            }
        }
    }
    
    
	public static Date parseFecha(String fechaStr) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	try {
	return sdf.parse(fechaStr);
	} catch (ParseException e) {
	System.out.println("Formato de fecha incorrecto. Utilice el formato dd/mm/yyyy.");
	return null;
	}
	}
}
