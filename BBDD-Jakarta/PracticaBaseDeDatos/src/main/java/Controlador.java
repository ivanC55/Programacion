/**
 *
 * @Author: Iván Cerros Brioso
 *
 * */

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) throws SQLException {
        DAO daoCSV = new DAOImpCSV();
        DAO daoBBDD = new DAOImpMariaDB();

        try (Scanner sc = new Scanner(System.in)) {
            String opcion;
            List<Alumno> alumnos = daoCSV.getAll(); // primero de todo cargamos los datos del CSV
            do {
                System.out.println("\nMenú:");
                System.out.println("1. Mostrar alumnos en CSV");
                System.out.println("2. Insertar alumnos en la base de datos");
                System.out.println("3. Mostrar alumnos en la base de datos");
                System.out.println("4. Eliminar alumno de la base de datos");
                System.out.println("0. Salir");
                System.out.print("Elige una opción: ");
                opcion = sc.nextLine();

                switch (opcion) {
                    case "1":   // lista CSV
                        System.out.println("\nEstos son los datos de todos los alumnos del CSV:");
                        for (int i = 0; i < alumnos.size(); i++) {
                            System.out.println("Alumno : " + (i + 1) + ": " + alumnos.get(i));
                        }
                        break;

                    case "2":  // inserta posiciones del CSV en base de datos
                        System.out.println("\nElige el numero/os del alumno/os a insertar a la base de datos");
                        String[] posiciones = sc.nextLine().split(",");
                        List<Alumno> seleccionados = new ArrayList<>();

                        for (String posicion : posiciones) {
                            try {
                                int pos = Integer.parseInt(posicion.trim()) - 1;
                                if (pos >= 0 && pos < alumnos.size()) {
                                    seleccionados.add(alumnos.get(pos));
                                } else {
                                    System.out.println("Has introducido un alumno que no existe");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Has introducido una posición erronea: " + posicion);
                            }
                        }
                        daoBBDD.addList(seleccionados);
                        break;

                    case "3":   // lista alumnos en base de datos
                        List<Alumno> alumnosBBDD = daoBBDD.getAll();
                        System.out.println("\nAlumnos en la base de datos:");
                        for (int i = 0; i < alumnosBBDD.size(); i++) {
                            Alumno a = alumnosBBDD.get(i);
                            System.out.println((i + 1) + ": " + a.getNombre() + " (" + a.getEmail() + ")");
                        }
                        break;
                    case "4":   // elimina alumno de base de datos
                        System.out.println("\nDime el id del alumno que quieres eliminar:");
                        long idAlumno = Long.parseLong(sc.nextLine());
                        long filaAfectadas = daoBBDD.del(idAlumno);

                        if (filaAfectadas > 0) {
                            System.out.println("Eliminado el alumno con id " + idAlumno);
                        } else {
                            System.out.println("Ningún alumno con id " + idAlumno);
                        }
                        break;
                    case "0":
                        System.out.println("Fin del programa");
                        break;
                    default:
                        System.out.println("ERROR: Opción no reconocida");
                }
            } while (!opcion.equals("0"));
        }
    }
}
