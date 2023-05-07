//Flores Lara Alberto
//Saucillo Gonzalez Jesse Obed

import java.util.Random;
import java.util.Scanner;

class Propiedades{
    public double[][] matriz(){
        //Definir una matriz de double como atributo.
        double [][]matriz;

        //Pedir al usuario las dimensiones de la matriz.
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = sc.nextInt();
        //sc.close();
        matriz = new double[filas][columnas];

        //Inicializar la matriz con elementos aleatorios.
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextDouble(0, 10);
            }
        }

        //imprimir el contenido de la matriz (de preferencia utilizar for each)
        this.imprimir(matriz);
        
        //Obtener el elemento máximo.
        System.out.println("El numero mas grande del arreglo es:" + this.mayor(matriz));
        
        //Obtener el elemento mínimo.
        System.out.println("El numero mas pequeño del arreglo es:" + this.menor(matriz));

        //Develve la matriz a la funcion main
        return matriz;
    }

    public void imprimir(double[][] matriz){
        //Se realiza la impresión de la matriz usando for each
        for (double[] fila : matriz) {
            for (double num : fila) {
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
    }

    public double mayor(double[][] matriz){
        /*
            Se busca el valor mas grande de la matriz estableciendo el valor minimo que puede
            poseer y recorriendo la matriz, reemplazando ese valor si es mas grande el valor
            que hay en la posicion de la matriz; al final devuelve el valor mas grande en la matriz.
        */
        double mayor = 0;
        for (double[] fila : matriz) {
            for (double num : fila) {
                if (num > mayor) {
                    mayor = num;
                }
            }
        }
        return mayor;
    }

    public double menor(double[][] matriz){
        //Trabaja exactamente igual que la suma, en este caso reemplaza su valor si 
        //el valor en la posicion de la matriz es menor; al final devuelve el valor mas pequeño en la matriz
        double menor = 10;
        for (double[] fila : matriz) {
            for (double num : fila) {
                if (num < menor) {
                    menor = num;
                }
            }
        }
        return menor;
    }

}

class Operaciones{
    public double[][] suma(double[][] matriz_1, double[][] matriz_2){
        //Recorre ambas matrices al mismo tiempo y le asigna a la nueva matriz
        //la suma de los valores que hay en la misma posicion de ambas matrices.
        //Al final regresa una nueva matriz
        double [][] suma;
        suma = new double[matriz_1.length][matriz_1[0].length];

        for (int i = 0; i < matriz_1.length; i++) {
            for (int j = 0; j < matriz_1[i].length; j++) {
                suma[i][j] = matriz_1[i][j] + matriz_2[i][j];
            }
        }
        return suma;
    }

    public double[][] resta(double[][] matriz_1, double[][] matriz_2){
        //Funciona igual que la suma, solo que ahora se asigna la resta
        //de los valores que hay en la misma posicion de ambas matrices.
        //Al final regresa una nueva matriz
        double [][] resta;
        resta = new double[matriz_1.length][matriz_1[0].length];

        for (int i = 0; i < matriz_1.length; i++) {
            for (int j = 0; j < matriz_1[i].length; j++) {
                resta[i][j] = matriz_1[i][j] - matriz_2[i][j];
            }
        }
        return resta;
    }

    public double[][] multi(double[][] matriz_1, double[][] matriz_2){
        /*
         En esta operacion se utilizan tres bucles anidados para multiplicar las matrices. 
         El primer bucle itera sobre las filas de la matriz 1, el segundo sobre las columnas de la matriz 2
         y el tercer bucle sobre las columnas de la matriz 1 y las filas de la matriz 2, multiplicandolos 
         y sumándolos al valor acumulado.
         Al final regresa una nueva matriz
         */
        double [][] multi;
        multi = new double[matriz_1.length][matriz_2[0].length];
        
        for (int i = 0; i < matriz_1.length; i++) {
            for (int j = 0; j < matriz_2[0].length; j++) {
                double valor = 0;
                for (int k = 0; k < matriz_1[i].length; k++) {
                    valor += matriz_1[i][k] * matriz_2[k][j];
                }
                multi[i][j]=valor;
            }
        }
        return multi;
    }
    //Se realiza la impresión de la matriz usando for each
    public void imprimir(double[][] matriz){

        for (double[] fila : matriz) {
            for (double num : fila) {
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
    }
}

public class EjercicioMatrices{

    public static void main(String[] args){

        //Definimos los objetos de Matriz_x con el constructor que contiene sus propiedades
        Propiedades Matriz_1 = new Propiedades();
        Propiedades Matriz_2 = new Propiedades();
        
        //Mostramos las propiedades de ambas matrices
        System.out.println("Esta es la primera matriz");
        double [][]matriz_1= Matriz_1.matriz();
        System.out.println("\n");
        
        System.out.println("Esta es la segunda matriz");
        double [][]matriz_2= Matriz_2.matriz();
        System.out.println("\n");

        //Definimos una nueva matriz la cual almacenara las operaciones con las matrices anteriores
        Operaciones Matriz_3 = new Operaciones();
        double [][]matriz_3;

        /*
         Corroboramos que ambas matrices tienen el mismo tamaño para ralizar la suma de lo contrario
         mandará un aviso indicando que no se pueden sumar
         */
        if(matriz_1.length==matriz_2.length && matriz_1[0].length==matriz_2[0].length){
        matriz_3= Matriz_3.suma(matriz_1, matriz_2);
        System.out.println("Esta es la suma de ambas matrices:");
        Matriz_3.imprimir(matriz_3);
        System.out.println("\n");
        }else{
            System.out.println("Las matrices no tienen las mismas dimensiones por lo tanto no se pueden sumar"+"\n");
        }

        /*
         Corroboramos que ambas matrices tienen el mismo tamaño para ralizar la resta de lo contrario
         mandará un aviso indicando que no se pueden restar
         */
        if(matriz_1.length==matriz_2.length && matriz_1[0].length==matriz_2[0].length){
        matriz_3= Matriz_3.resta(matriz_1, matriz_2);
        System.out.println("Esta es la resta de ambas matrices:");
        Matriz_3.imprimir(matriz_3);
        System.out.println("\n");
        }else{
            System.out.println("Las matrices no tienen las mismas dimensiones por lo tanto no se pueden restar"+"\n");
        }

        /*
         Corroboramos que la matriz 1 tiene la misma cantidad de columnas que la cantidad de filas de la segunda matriz 
         de lo contrario mandará un aviso indicando que no se pueden multiplicar
         */
        if(matriz_1.length==matriz_2[0].length){
        matriz_3= Matriz_3.multi(matriz_1, matriz_2);
        System.out.println("Esta es la multiplicacion de ambas matrices:");
        Matriz_3.imprimir(matriz_3);
        System.out.println("\n");
        }else{
            System.out.println("La matriz 1 no tiene la misma cantidad de columnas que la cantidad de filas de la segunda matriz por lo tanto no se pueden multiplicar");
        }
    }
}