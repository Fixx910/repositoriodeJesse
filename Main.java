public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Calculadora con valores fijos
        Calculadora calc = new Calculadora();

        // Suma de enteros, float y double
        int sumEntero = calc.sumar(5);
        float sumFlotante = calc.sumar(1.5f);
        double sumDoble = calc.sumar(3.14159);
        
        //Multiplicacion y division int
        int MultInt= calc.multiplicar(5);
        int DivInt= calc.dividir(1);

        //Multiplicacion y division float
        float MultFloat= calc.multiplicar(5.5f);
        float DivFloat= calc.dividir(1.5f);

        //Multiplicacion y division double
        double MultDouble= calc.multiplicar(5.5);
        double DivDouble= calc.dividir(1.5);

        //Modulo de un int
        int ModInt= calc.modulo(10,3);

        
        System.out.println("Suma de entero: " + sumEntero);
        System.out.println("Suma de flotante: " + sumFlotante);
        System.out.println("Suma de doble: " + sumDoble);
        
        //Multiplicacion y division int
        System.out.println("Multiplicacion de entero:"+MultInt);
        System.out.println("Division de entero:"+DivInt);

        //Multiplicacion y division float
        System.out.println("Multiplicacion de float:"+MultFloat);
        System.out.println("Division de float:"+DivFloat);

        //Multiplicacion y division double
        System.out.println("Multiplicacion de double:"+MultDouble);
        System.out.println("Division de double:"+DivDouble);

        //Modulo de un int
        System.out.println("Modulo de un int:"+ModInt);
        
    }
}
