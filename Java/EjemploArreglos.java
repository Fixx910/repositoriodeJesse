//Flores Lara Alberto
//Saucillo Gonzalez Jesse Obed
package arreglos;


public class EjemploArreglos {
 
     public static void main(String[] args) {
         Arreglos arre=new Arreglos(5);
         //arre.imprimirArreglo();
         arre.llenarArreglo();
         System.out.println("");
         arre.imprimirArreglo();
         //arreglosumar
         Arreglos arre2=new Arreglos(5);
         //(imprime el arreglo vacio) imprimirArreglo();
         arre2.llenarArreglo();
         System.out.println("");
         arre2.imprimirArreglo();


         
         //double[] array=arre.devolverArreglo();
         //System.out.println("");
         /* 
         for(double x:array)
         {
             System.out.println("Elem -> "+x);
         }
         */
         double[][] array2=new double[2][];
         array2[0]=new double[3];
         array2[1]=new double[5];
         
         System.out.println("");

         //Obtener el numero más grande del arreglo 
         double max=arre.obtenerMaximo();
            System.out.println("El maximo es: "+max);

         //Obtener el numero más pequeño del arreglo
         double min=arre.obtenerMinimo();
         System.out.println("");
            System.out.println("El minimo es: "+min);
        
        //Sumar los elementos del arreglo
        double suma=arre.sumarElementos();
        System.out.println("");
            System.out.println("La suma es: "+suma);
        
        //Sumar dos arreglos de igual tamaño
        Arreglos arre3=new Arreglos(5);
        arre3.sumarElementos(arre, arre2);
        System.out.println("");
        
        //Producto punto de dos arreglos de igual tamaño
        double producto=arre.productoPunto(arre, arre2);
        System.out.println("");
        System.out.println("El producto punto es: "+producto);

        //Ordenar el arreglo
        arre.ordenarArreglo();
        System.out.println("");
        arre.imprimirArreglo();

        //Calcular la media del arreglo
        double media=arre.calcularMedia();
        System.out.println("");
        System.out.println("La media es: "+media);
        

        
        
         
     }
 }