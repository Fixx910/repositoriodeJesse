import java.util.Scanner;

abstract class Persona {
    public double id;
    public String nombre;
    public String curp;
    public String domicilio;

    public Persona(double id, String nombre, String curp, String domicilio) {
        this.id = id;
        this.nombre = nombre;
        this.curp = curp;
        this.domicilio = domicilio;
    }

    public abstract String obtenerValores();
}

class Estudiante extends Persona {
    public Estudiante(double id, String nombre, String curp, String domicilio) {
        super(id, nombre, curp, domicilio);
    }

    public String obtenerValores() {
        return "ID: " + id + "\nNombre: " + nombre + "\nCURP: " + curp + "\nDomicilio: " + domicilio;
    }
}

class Docente extends Persona {
    public Docente(double id, String nombre, String curp, String domicilio) {
        super(id, nombre, curp, domicilio);
    }

    public String obtenerValores() {
        return "ID: " + id + "\nNombre: " + nombre + "\nCURP: " + curp + "\nDomicilio: " + domicilio;
    }
}

class PAAE extends Persona {
    public PAAE(double id, String nombre, String curp, String domicilio) {
        super(id, nombre, curp, domicilio);
    }

    public String obtenerValores() {
        return "ID: " + id + "\nNombre: " + nombre + "\nCURP: " + curp + "\nDomicilio: " + domicilio;
    }
}

public class Personas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- Menu de Opciones -----");
            System.out.println("1. Obtener valores de un estudiante");
            System.out.println("2. Obtener valores de un docente");
            System.out.println("3. Obtener valores de un PAAE");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                System.out.print("Ingrese el ID del estudiante: ");
                double id = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Ingrese el nombre del estudiante: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el CURP del estudiante: ");
                String curp = scanner.nextLine();
                System.out.print("Ingrese el domicilio del estudiante: ");
                String domicilio = scanner.nextLine();

                Estudiante estudiante = new Estudiante(id, nombre, curp, domicilio);
                System.out.println(estudiante.obtenerValores());

            } else if (opcion.equals("2")) {
                System.out.print("Ingrese el ID del docente: ");
                double id = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Ingrese el nombre del docente: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el CURP del docente: ");
                String curp = scanner.nextLine();
                System.out.print("Ingrese el domicilio del docente: ");
                String domicilio = scanner.nextLine();

                Docente docente = new Docente(id, nombre, curp, domicilio);
                System.out.println(docente.obtenerValores());

            } else if (opcion.equals("3")) {
                System.out.print("Ingrese el ID del PAAE: ");
                double id = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Ingrese el nombre del PAAE: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el CURP del PAAE: ");
                String curp = scanner.nextLine();
                System.out.print("Ingrese el domicilio del PAAE: ");
                String domicilio = scanner.nextLine();

                PAAE paae = new PAAE(id, nombre, curp, domicilio);
                System.out.println(paae.obtenerValores());

            } else if (opcion.equals("4")) {
                break;

            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

            System.out.println();
        }
        scanner.close();
    
    }
}
