public class Calculadora {
    private int entero;
    private float flotante;
    private double doble;

    // Constructor por defecto
    public Calculadora() {
        entero = 10;
        flotante = 3.14f;
        doble = 2.71828;
    }

    // Constructor valores personalizados
    public Calculadora(int entero, float flotante, double doble) {
        this.entero = entero;
        this.flotante = flotante;
        this.doble = doble;
    }

    // Métodos de suma sobrecargados para enteros, float y double
    public int sumar(int a) {
        return entero + a;
    }

    public float sumar(float a) {
        return flotante + a;
    }

    public double sumar(double a) {
        return doble + a;
    }

    // Métodos de resta sobrecargados para enteros, float y double
    public int restar(int a) {
        return entero - a;
    }
    //Metodo para restar dos enteros 
    public int restardos(int a, int b) {
        return a - b;
    }

    public float restar(float a) {
        return flotante - a;
    }

    public double restar(double a) {
        return doble - a;
    }

    // Método para multiplicar enteros empleando el algoritmo de las sumas sucesivas
    public int multiplicar(int a) {
        int resultado = 0;
        for (int i = 0; i < a; i++) {
            resultado += entero;
        }
        return resultado;
    }
    
    //Metodo para multiplicar dos enteros
    public int multiplicardos(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }

    // Método para dividir enteros empleando el algoritmo de las restas sucesivas
    public int dividir(int a) {
        int resultado = 0;
        while (entero >= a) {
            entero -= a;
            resultado++;
        }
        return resultado;
    }

    //Metodo para divir dos enteros
    public int dividirdos(int a, int b) {
        int resultado = 0;
        while (a >= b) {
            a -= b;
            resultado++;
        }
        return resultado;
    }
    // Métodos de multiplicación sobrecargados para float y double
    public float multiplicar(float a) {
        return flotante * a;
    }

    public double multiplicar(double a) {
        return doble * a;
    }

    // Métodos de división sobrecargados para float y double
    public float dividir(float a) {
        return flotante / a;
    }

    public double dividir(double a) {
        return doble / a;
    }

    // Método para cálculo del módulo empleando valores enteros
        public int modulo(int a,int b) {
        int cociente = dividirdos(a,b);
        int residuo= restardos(a,multiplicardos(cociente,b));
        return residuo;
        }
}
