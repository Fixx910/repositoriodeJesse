//Practica 6
//Saucillo Gonzalez Jesse Obed y Flores Lara Alberto
//3BV2
package P6;
import java.util.Scanner;

abstract class FiguraGeometrica {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return 3 * base;
    }
}

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo extends FiguraGeometrica {
    private double ladoA;
    private double ladoB;

    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double calcularArea() {
        return ladoA * ladoB;
    }

    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}

class Hexagono extends FiguraGeometrica {
    private double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return (Math.sqrt((lado*lado)-((lado/2)*(lado/2)))*(lado)*6)/2;
    }

    public double calcularPerimetro() {
        return 6 * lado;
    }
}

public class Figuras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- Menú de Opciones -----");
            System.out.println("1. Calcular área y perímetro de un triángulo");
            System.out.println("2. Calcular área y perímetro de un círculo");
            System.out.println("3. Calcular área y perímetro de un rectángulo");
            System.out.println("4. Calcular área y perímetro de un hexágono");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                FiguraGeometrica triangulo = new Triangulo(base, altura);
                System.out.println("Área: " + triangulo.calcularArea());
                System.out.println("Perímetro: " + triangulo.calcularPerimetro());
            } else if (opcion.equals("2")) {
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                FiguraGeometrica circulo = new Circulo(radio);
                System.out.println("Área: " + circulo.calcularArea());
                System.out.println("Perímetro: " + circulo.calcularPerimetro());
            } else if (opcion.equals("3")) {
                System.out.print("Ingrese el lado A del rectángulo: ");
                double ladoA = scanner.nextDouble();
                System.out.print("Ingrese el lado B del rectángulo: ");
                double ladoB = scanner.nextDouble();
                FiguraGeometrica rectangulo = new Rectangulo(ladoA, ladoB);
                System.out.println("Área: " + rectangulo.calcularArea());
                System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
            } else if (opcion.equals("4")) {
                System.out.print("Ingrese el lado del hexágono: ");
                double lado = scanner.nextDouble();
                FiguraGeometrica hexagono = new Hexagono(lado);
                System.out.println("Área: " + hexagono.calcularArea());
                System.out.println("Perímetro: " + hexagono.calcularPerimetro());
            } else if (opcion.equals("5")) {
                break;
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

            System.out.println();
            scanner.nextLine(); // Consumir el salto de línea después de leer un valor numérico
        }

        scanner.close();
    }
}



