#Practica 4
#Saucillo Gonzalez Jesse Obed y Flores Lara Alberto
#3BV2

from collections import deque

class Ferris:
    def __init__(self, capacidad_maxima):
        self.capacidad_maxima = capacidad_maxima
        self.autos = deque()

    def insertar_auto(self, matricula):
        if len(self.autos) < self.capacidad_maxima:
            self.autos.append(matricula)
            return True
        else:
            return False

    def sacar_auto(self):
        raise NotImplementedError("Este método debe ser implementado en las clases hijas.")

    def imprimir_contenido(self):
        print("Contenido del ferri:")
        for matricula in self.autos:
            print(matricula)
        print()


class Portos(Ferris):
    def __init__(self, capacidad_maxima):
        super().__init__(capacidad_maxima)

    def sacar_auto(self):
        if len(self.autos) > 0:
            matricula = self.autos.pop()  # Utiliza pop() para sacar el último elemento de la pila
            return matricula
        else:
            return None


class Celebrian(Ferris):
    def __init__(self, capacidad_maxima):
        super().__init__(capacidad_maxima)

    def sacar_auto(self):
        if len(self.autos) > 0:
            matricula = self.autos.popleft()  # Utiliza popleft() para sacar el primer elemento de la cola
            return matricula
        else:
            return None


def main():
    portos = Portos(10)
    celebrian = Celebrian(10)

    while True:
        matricula = input("Ingrese la matrícula del auto (o 'salir' para terminar): ")
        matricula = matricula.lower()
        if matricula == 'salir':
            break

        ferri = input("Ingrese el ferri al que irá el auto (P para Portos, C para Celebrian): ")
        ferri = ferri.lower()
        print(ferri)
        if ferri == 'p':
            if portos.insertar_auto(matricula):
                print("Auto ingresado en Portos.")
            else:
                print("Capacidad máxima de Portos alcanzada. No se pudo ingresar el auto.")
        elif ferri == 'c':
            if celebrian.insertar_auto(matricula):
                print("Auto ingresado en Celebrian.")
            else:
                print("Capacidad máxima de Celebrian alcanzada. No se pudo ingresar el auto.")
        else:
            print("Ferri inválido. Por favor, ingrese 'P' o 'C'.")

        portos.imprimir_contenido()
        celebrian.imprimir_contenido()

    print("Comenzando el viaje...")

    while True:
        matricula = portos.sacar_auto()
        if matricula is not None:
            print("Auto saliendo de Portos:", matricula)
        else:
            break

        matricula = celebrian.sacar_auto()
        if matricula is not None:
            print("Auto saliendo de Celebrian:", matricula)
        else:
            break

        portos.imprimir_contenido()
        celebrian.imprimir_contenido()

    print("Viaje completado.")


