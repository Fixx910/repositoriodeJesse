//Flores Lara Alberto
//Saucillo Gonzalez Jesse Obed

package arreglos;

import java.util.Arrays;

public class Arreglos {
   double[] arreglo;
   public Arreglos(int n)
   {
       arreglo=new double[n];
   }
   
   public void llenarArreglo()
   {
       for(int i=0;i<arreglo.length;i++)
       {
           arreglo[i]=Math.random();
       }
   }
   
   public void imprimirArreglo()
   {
       for(double x:arreglo)
       {
           System.out.println("Elemento - > "+x);
       }
   }
   
   public double[] devolverArreglo()
   {
       return arreglo;
   }

   //Encontrar el numero más grande del arreglo
    public double obtenerMaximo()
    {
         double max=arreglo[0];
         for(int i=1;i<arreglo.length;i++)
         {
              if(arreglo[i]>max)
              {
                max=arreglo[i];
              }
         }
         return max;
    }

    //Encontrar el numero más pequeño del arreglo
    public double obtenerMinimo()
    {
         double min=arreglo[0];
         for(int i=1;i<arreglo.length;i++)
         {
              if(arreglo[i]<min)
              {
                min=arreglo[i];
              }
         }
         return min;
    }

    //Sumar los elementos del arreglo
    public double sumarElementos()
    {
         double suma=0;
         for(int i=0;i<arreglo.length;i++)
         {
              suma+=arreglo[i];
         }
         return suma;
    }

    //sumar dos arreglos de igual tamaño
    public void sumarElementos(Arreglos a1, Arreglos a2)
    {
         if(a1.arreglo.length==a2.arreglo.length)
         {
              for(int i=0;i<a1.arreglo.length;i++)
              {
                   System.out.println("Suma -> "+(a1.arreglo[i]+a2.arreglo[i]));
              }
         }
         else
         {
              System.out.println("Los arreglos no son del mismo tamaño");
         }
    }

    //producto punto de dos arreglos de igual tamaño
    public double productoPunto(Arreglos a1, Arreglos a2)
    {
         double producto=0;
         if(a1.arreglo.length==a2.arreglo.length)
         {
              for(int i=0;i<a1.arreglo.length;i++)
              {
                   producto+=(a1.arreglo[i]*a2.arreglo[i]);
              }
         }
         else
         {
              System.out.println("Los arreglos no son del mismo tamaño");
         }
         return producto;
    }

    //ordenar el arreglo
    public void ordenarArreglo()
    {
         Arrays.sort(arreglo);
    }

    //Calcular media arreglo
    public double calcularMedia()
    {
         double media=0;
         for(int i=0;i<arreglo.length;i++)
         {
              media+=arreglo[i];
         }
         media=media/arreglo.length;
         return media;
    }

    


           
}
