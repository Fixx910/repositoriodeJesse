#include <stdio.h>
#include <time.h>




//funcion que genera un arreglo de n elementos enteros generados de manera aleatoria
void generarArreglo(int n, int arreglo[]){

    for(int i = 0; i < n; i++){
        arreglo[i] = rand() % n;
    }
} 


//Funcion que imprime cualquier arreglo de n elementos
void imprimirArreglo(int n, int arreglo[]){
    for(int i = 0; i < n; i++){
        printf("%d ", arreglo[i]);
    }
    printf("\n");
}

//funcion de busqueda lineal
void busquedalineal(int arreglo[], int n, int elemento){
    int i = 0;
    while(i < n && arreglo[i] != elemento){
        i++;
    }
    if(i < n){
        printf("El elemento %d se encuentra en la posicion %d del arreglo", elemento, i);
    }else{
        printf("El elemento %d no se encuentra en el arreglo", elemento);
    }
}

//Funcion de busqueda e impresion de burbuja
void burbuja(int arreglo[], int n){
    int i, j, aux;
    for(i = 0; i < n; i++){
        for(j = 0; j < n - 1; j++){
            if(arreglo[j] > arreglo[j + 1]){
                aux = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = aux;
            }
        }
    }10
}

int main(){

    clock_t inicio=clock();



    //Arreglo de n elementos enteros generados de manera aleatoria
    int tamarreglo;
        //Pedir el tamaño del arreglo
    printf("Ingrese el tamaño del arreglo: ");
    scanf("%d", &tamarreglo);
    int arreglo[tamarreglo];
    //Generar el arreglo
    generarArreglo(tamarreglo, arreglo);

    //Imprimir el arreglo
    printf("El arreglo de %d elementos aleatorios es: \n", tamarreglo);
    imprimirArreglo(tamarreglo, arreglo);

    //Elemento a buscar
    int elemento;
    printf("Ingrese el elemento a buscar: ");
    scanf("%d", &elemento);

    busquedalineal(arreglo, tamarreglo, elemento);
    printf("\n");
    printf("El arreglo ordenado es: \n");
    burbuja(arreglo, tamarreglo);

    imprimirArreglo(tamarreglo, arreglo);


    clock_t fin=clock();
    double tiempo=(double)(fin-inicio)/CLOCKS_PER_SEC;
    printf("\n");

    printf("Tiempo de ejecucion: %f segundos ", tiempo);

    return 0; 

    




}