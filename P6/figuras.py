from abc import ABC, abstractmethod
import math

class FiguraGeometrica(ABC):
    @abstractmethod
    def calcular_area(self):
        pass

    @abstractmethod
    def calcular_perimetro(self):
        pass

class Triangulo(FiguraGeometrica):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return (self.base * self.altura) / 2

    def calcular_perimetro(self):
        return 3 * self.base

class Circulo(FiguraGeometrica):
    def __init__(self, radio):
        self.radio = radio

    def calcular_area(self):
        return math.pi * (self.radio ** 2)

    def calcular_perimetro(self):
        return 2 * math.pi * self.radio

class Rectangulo(FiguraGeometrica):
    def __init__(self, lado_a, lado_b):
        self.lado_a = lado_a
        self.lado_b = lado_b

    def calcular_area(self):
        return self.lado_a * self.lado_b

    def calcular_perimetro(self):
        return 2 * (self.lado_a + self.lado_b)
    
class Hexagono(FiguraGeometrica):
    def __init__(self, lado):
        self.lado = lado

    def calcular_area(self):
        return (math.sqrt((self.lado*self.lado)-((self.lado/2)*(self.lado/2))))*(self.lado*6)/2

    def calcular_perimetro(self):
        return 6 * self.lado

# Función para mostrar el menú y realizar cálculos
def menu():
    while True:
        print("----- Menú de Opciones -----")
        print("1. Calcular área y perímetro de un triángulo")
        print("2. Calcular área y perímetro de un círculo")
        print("3. Calcular área y perímetro de un rectángulo")
        print("4. Calcular área y perímetro de un hexagono")
        print("5. Salir")
        opcion = input("Seleccione una opción: ")

        if opcion == "1":
            base = float(input("Ingrese la base del triángulo: "))
            altura = float(input("Ingrese la altura del triángulo: "))
            triangulo = Triangulo(base, altura)
            print("Área:", triangulo.calcular_area())
            print("Perímetro:", triangulo.calcular_perimetro())

        elif opcion == "2":
            radio = float(input("Ingrese el radio del círculo: "))
            circulo = Circulo(radio)
            print("Área:", circulo.calcular_area())
            print("Perímetro:", circulo.calcular_perimetro())

        elif opcion == "3":
            lado_a = float(input("Ingrese el lado A del rectángulo: "))
            lado_b = float(input("Ingrese el lado B del rectángulo: "))
            rectangulo = Rectangulo(lado_a, lado_b)
            print("Área:", rectangulo.calcular_area())
            print("Perímetro:", rectangulo.calcular_perimetro())

        
        elif opcion == "4":
            lado = float(input("Ingrese el lado del hexagono: "))
            hexagono = Hexagono(lado)
            print("Área:", hexagono.calcular_area())
            print("Perímetro:", hexagono.calcular_perimetro())

        elif opcion == "5":
            break

        else:
            print("Opción inválida. Por favor, seleccione una opción válida.")

        print()

# Ejecutar el menú
menu()
