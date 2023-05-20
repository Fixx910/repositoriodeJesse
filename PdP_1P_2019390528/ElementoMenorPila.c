/*
Integrantes: 
Saucillo González Jesse Obed4
Flores Lara Alberto
Luna Zamora Juan Antonio
*/

/*
DESCRIPCIÓN: TAD pila o stack.
Estructura de datos en la que se cumple:
Los elementos se añaden y se remueven por un solo extremo.
Este extremo es llamado “tope” de la pila.
*/

//DEFINICIONES DE CONSTANTES
#define MAX_ELEMENT 1000
#define TRUE	1
#define FALSE	0

//DEFINICIONES DE TIPOS DE DATO

//Definir un boolean (Se modela con un "char")
typedef unsigned char boolean;

//Definir un elemento (Se modela con una estructura "elemento")
typedef struct elemento
{
	//Variables de la estructura "elemento" (El usuario puede modificar)
	int c;
	//***
	//***
	//***
}elemento;

//Definir una pila (Se modela con una estructura que unicamente incluye un puntero a "elemento")
typedef struct pila
{		
	elemento arreglo[MAX_ELEMENT];		//La pila es un arreglo estático de MAX_ELEMET
	int tope; 							//El tope es un entero (Indice del arreglo de elementos)
}pila;

//DECLARACIÓN DE FUNCIONES
void Initialize(pila *s);			//Inicializar pila (Iniciar una pila para su uso)
void Push(pila *s, elemento e);		//Empilar (Introducir un elemento a la pila)
elemento Pop(pila *s);				//Desempilar (Extraer un elemento de la pila)
boolean Empty(pila *s);				//Vacia (Preguntar si la pila esta vacia)
elemento Top(pila *s);				//Tope (Obtener el "elemento" del tope de la pila si extraerlo de la pila)
int Size(pila *s);					//Tamaño de la pila (Obtener el número de elementos en la pila)
void Destroy(pila *s);				//Elimina pila (Borra a todos los elementos y a la pila de memoria)

/*

DESCRIPCIÓN: TAD pila o stack.
Estructura de datos en la que se cumple:
Los elementos se añaden y se remueven por un solo extremo.
Este extremo es llamado “tope” de la pila.

*/

//LIBRERAS
#include<stdio.h>
#include<stdlib.h>


//DEFINICIÓN DE FUNCIONES

/*
void Initialize(pila *s);
Descripción: Inicializar pila (Iniciar una pila para su uso)
Recibe: pila *s (Referencia a la pila "s" a operar)
Devuelve:
Observaciones: El usuario a creado una pila y s tiene la referencia a ella, 
si esto no ha pasado se ocasionara un error.
*/
void Initialize(pila *s)
{
	(*s).tope=-1; //s->tope=-1; 
	return;
}

/*
void Push(pila *s, elemento e);
Descripción: Empilar (Introducir un elemento a la pila)
Recibe: pila *s (Referencia a la pila "s" a operar), elemento e (Elemento a introducir en la pila)
Devuelve:
Observaciones: El usuario a creado una pila y s tiene la referencia a ella, s ya ha sido inicializada.
Ademas no se valida el indice del arreglo (tope) esta fuera del arreglo es decir hay desbordamiento
y se causará en error.
*/
void Push(pila *s, elemento e)
{
	s->tope++;
	
	//Si el tope alcanzo a MAX_ELEMENT, ya no hay más espacio para elementos en el arreglo
	if(s->tope==MAX_ELEMENT)
	{
		printf("\nERROR-Push(&s,e): Desbordamiento de la pila, no hay mas espacio en la pila");
		exit(1);
	}
	
	//Insertar el elemento si no hubo error
	s->arreglo[s->tope]=e;
	return;
}

/*
elemento Pop(pila *s);
Descripción: Desempilar (Extraer un elemento de la pila)
Recibe: pila *s (Referencia a la pila "s" a operar)
Devuelve: elemento (Elemento e extraido de la pila)
Observaciones: El usuario a creado una pila y s tiene la referencia a ella, s ya ha sido inicializada.
Ademas no se valida si la pila esta vacia (tope == -1) antes de desempilar (causa error desempilar si esta esta vacía)
*/
elemento Pop(pila *s)
{
	elemento r;
	
	//Si el tope es -1, se intenta Pop de pila vacia 
	if(s->tope==-1)
	{
		printf("\nERROR-e=Pop(&s): Subdesbordamiento de la pila, no hay elementos en la pila");
		exit(1);
	}
	
	//Si no hubo error retornar el elemento indexado por tope
	r=s->arreglo[s->tope];
	s->tope--;
	return r; 	
}

/*
boolean Empy(pila *s);
Descripción: //Vacia (Preguntar si la pila esta vacia)
Recibe: pila *s (Referencia a la pila "s" a operar)
Devuelve: boolean (TRUE o FALSE según sea el caso)
Observaciones: El usuario a creado una pila y s tiene la referencia a ella, s ya ha sido inicializada.
*/
boolean Empty(pila *s)
{
	boolean r;	
	if(s->tope==-1)
	{
		r= TRUE;	
	}	
	else
	{
		r= FALSE;
	}	
	return r;	
}

/*
elemento Top(pila *s);
Descripción: Tope (Obtener el "elemento" del tope de la pila si extraerlo de la pila)
Recibe: pila *s (Referencia a la pila "s" a operar)
Devuelve: elemento (Elemento del tope de la pila)
Observaciones: El usuario a creado una pila y s tiene la referencia a ella, s ya ha sido inicializada.
Ademas no se valida si la pila esta vacia antes de consultar al elemento del tope (causa error si esta esta vacía).
*/
elemento Top(pila *s)
{
	//Si el tope es -1, se intenta Pop de pila vacia 
	if(s->tope==-1)
	{
		printf("\nERROR-e=Top(&s): Subdesbordamiento de la pila, no hay elementos en la pila");
		exit(1);
	}
	
	//Si no hubo error retornar el elemento indexado por tope
	return s->arreglo[s->tope];	
}

/*
int Size(pila *s);
Descripción: Tamaño de la pila (Obtener el número de elementos en la pila)
Recibe: pila *s (Referencia a la pila "s" a operar)
Devuelve: int (Tamaño de la pila -1->Vacia, 1->1 elemento, 2->2 elementos, ...)
Observaciones: El usuario a creado una pila y s tiene la referencia a ella, s ya ha sido inicializada.
*/
int Size(pila *s)
{
	return s->tope+1;
}

/*
void Destroy(pila *s);
Descripción: Elimina pila (Borra a todos los elementos en a la pila de memoria* Memoria estática (No se puede eleminar realmente)
Recibe: pila *s (Referencia a la pila "s" a operar)
Devuelve: 
Observaciones: El usuario a creado una pila y s tiene la referencia a ella.
*/
void Destroy(pila *s)
{
	//s->tope=-1;
	Initialize(s);
	return;
}


// Función para obtener el elemento menor de la pila
elemento ObtenerMenorElemento(pila *s)
{
    pila auxiliar; // Pila auxiliar para preservar el orden de los elementos originales
    elemento menor; // Elemento menor

    // Inicializar la pila auxiliar
    Initialize(&auxiliar);

    // Obtener el primer elemento de la pila original y asumirlo como el menor
    menor = Pop(s);

    // Mientras la pila original no esté vacía
    while (!Empty(s))
    {
        // Obtener el siguiente elemento de la pila original
        elemento e = Pop(s);

        // Si el elemento actual es menor que el menor actual, actualizar el menor
        if (e.c < menor.c)
            menor = e;

        // Empilar el elemento en la pila auxiliar
        Push(&auxiliar, e);
    }

    // Restaurar los elementos originales en la pila original
    while (!Empty(&auxiliar))
    {
        Push(s, Pop(&auxiliar));
    }

    return menor;
}

int main()
{
    pila miPila;
    elemento menorElemento;

    int entero;
    int numeroElementos;

    // Inicializar la pila
    Initialize(&miPila);

    // Empilar algunos elementos de ejemplo
    //El usuario agrega hasta 10 elementos
    printf("Ingrese el numero de elementos de la pila: ");
    scanf("%d", &numeroElementos);

    for (int i = 0; i < numeroElementos; i++)
    {
        printf("Ingrese el elemento %d: ", i + 1);

        scanf("%d", &entero);
        elemento e={entero};
        Push(&miPila, e);
    }

    // Obtener el elemento menor de la pila
    menorElemento = ObtenerMenorElemento(&miPila);

    // Mostrar el elemento menor
    printf("El elemento menor de la pila es: %d\n", menorElemento.c);

    return 0;
}

