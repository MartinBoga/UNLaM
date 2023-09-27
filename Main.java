package proyecto1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Materia> materias = new ArrayList<>();
        List<Alumno> alumnos = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar Materia");
            System.out.println("2. Ver Lista de Materias");
            System.out.println("3. Agregar Alumno");
            System.out.println("4. Salir");
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

                    // Verificar si ya existe una materia con el mismo ID
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

                    // Verificar si ya existe un alumno con el mismo DNI
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
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("La opcion no es valida. Intenta nuevamente.");
            }
        }
    }
}
