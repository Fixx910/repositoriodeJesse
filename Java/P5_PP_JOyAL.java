import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;

/*
    Practica 5
	Flores Lara Alberto y Saucillo Gonzalez Jesse Obed
	3BV2
 */

public class Menu {
    
    // Cola para almacenar los carros en el ferri Celebrian
    private static LinkedList<String> Celebrian = new LinkedList<String>();
    // Pila para almacenar los carros en el ferri Portos
    private static Stack<String> Portos = new Stack<String>();

    public static void main(String[] args) {
        int opc, ferri, bandera;
        int Capacidad = 10; // Capacidad máxima de cada ferri
        Scanner scanner = new Scanner(System.in);
        String Matricula;
        opc = 2; // Valor inicial para entrar al bucle do-while

        do {
            // Verificar si ambos ferris están llenos para iniciar la simulación
            if(Celebrian.size() == Capacidad && Portos.size() == Capacidad){
                System.out.println();
                Simulación();

                }else{
                    System.out.println("Bienvenido al Menu, Selecciona una opcion");
                    System.out.println("1. Ingresar un nuevo carro");
                    System.out.println("2. Adelantar la simulación de los Ferris");
                    opc = scanner.nextInt();
                    scanner.nextLine();
                    bandera = 0;

                    switch(opc){
                        case 1:
                            System.out.println("Ingrese la matrícula del Carro: ");
                            Matricula = scanner.nextLine();
                            // Seleccionar el ferri para subir el auto
                            do{
                                System.out.println("Seleccione en que Ferri desea subir el auto: ");
                                System.out.println("1. Portos");
                                System.out.println("2. Celebrian");
                                ferri = scanner.nextInt();
                                if (ferri == 1) {
                                    // Verificar si el ferri Portos está lleno
                                    if (Portos.size() == Capacidad) {
                                        System.out.println("El ferri Portos está lleno");
                                    } else {
                                        // Agregar la matrícula del carro al ferri Portos
                                        Portos.push(Matricula);
                                        System.out.println();
                                        imprimir();
                                        bandera = 1;
                                        break;
                                    }
                                } else if (ferri == 2) {
                                    // Verificar si el ferri Celebrian está lleno
                                    if (Celebrian.size() == Capacidad) {
                                        System.out.println("El ferri Celebrian está lleno");
                                    } else {
                                        // Agregar la matrícula del carro al ferri Celebrian
                                        Celebrian.offer(Matricula);
                                        System.out.println();
                                        imprimir();
                                        bandera = 1;
                                        break;
                                    }
                                } else {
                                    System.out.println("Selección inválida, intentelo de nuevo");
                                }
                            } while(bandera!=1);
                            break;

                        case 2:
                            System.out.println();
                            // Forzar Simulacion
                            Simulación();
                            break;
                        
                        default:
                            System.out.println("Ingrese una opcion valida");
                    }
                }
            } while(opc!= 2);
        }
    
    // Método para simular el viaje de los ferris
    private static void Simulación() {
        System.out.println("Simulación de viaje del ferri Portos:");
        while (!Portos.isEmpty()) {
            System.out.println("Sale el Carro con matrícula " + Portos.pop());
            imprimir();
        }

        System.out.println();
    
        System.out.println("Simulación de viaje del ferri Celebrian:");
        while (!Celebrian.isEmpty()) {
            System.out.println("Sale el Carro con matrícula " + Celebrian.poll());
            imprimir();
        }
    }
    
    // Método para imprimir el estado actual de los ferris
    private static void imprimir() {
        System.out.println("Ferri Portos: " + Portos);
        System.out.println("Ferri Celebrian: " + Celebrian);
        System.out.println();
    }

}
    


    


