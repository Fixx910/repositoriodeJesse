class Persona:
    def __init__(self, id, nombre, curp, domicilio):
        self.id = id
        self.nombre = nombre
        self.curp = curp
        self.domicilio = domicilio

    def obtener_valores(self):
        pass

class Estudiante(Persona):
    def obtener_valores(self):
        return "ID: " + str(self.id) + "\nNombre: " + self.nombre + "\nCURP: " + self.curp + "\nDomicilio: " + self.domicilio

class Docente(Persona):
    def obtener_valores(self):
        return "ID: " + str(self.id) + "\nNombre: " + self.nombre + "\nCURP: " + self.curp + "\nDomicilio: " + self.domicilio

class PAAE(Persona):
    def obtener_valores(self):
        return "ID: " + str(self.id) + "\nNombre: " + self.nombre + "\nCURP: " + self.curp + "\nDomicilio: " + self.domicilio

def menu():
    while True:
        print("----- Menu de Opciones -----")
        print("1. Obtener valores de un estudiante")
        print("2. Obtener valores de un docente")
        print("3. Obtener valores de un PAAE")
        print("4. Salir")
        opcion = input("Seleccione una opción: ")

        if opcion == "1":
            id = int(input("Ingrese el ID del estudiante: "))
            nombre = str(input("Ingrese el nombre del estudiante: "))
            curp = str(input("Ingrese el CURP del estudiante: "))
            domicilio = str(input("Ingrese el domicilio del estudiante: "))
            estudiante = Estudiante(id, nombre, curp, domicilio)
            print("\n" + paae.obtener_valores() + "\nLos datos del estudiante se han registrado correctamente!")

        elif opcion == "2":
            id = int(input("Ingrese el ID del docente: "))
            nombre = str(input("Ingrese el nombre del docente: "))
            curp = str(input("Ingrese el CURP del docente: "))
            domicilio = str(input("Ingrese el domicilio del docente: "))
            docente = Docente(id, nombre, curp, domicilio)
            print("\n" + paae.obtener_valores() + "\nLos datos del docente se han registrado correctamente!")

        elif opcion == "3":
            id = int(input("Ingrese el ID del PAAE: "))
            nombre = str(input("Ingrese el nombre del PAAE: "))
            curp = str(input("Ingrese el CURP del PAAE: "))
            domicilio = str(input("Ingrese el domicilio del PAAE: "))
            paae = PAAE(id, nombre, curp, domicilio)
            print("\n" + paae.obtener_valores() + "\nLos datos del PAAE se han registrado correctamente!")

        elif opcion == "4":
            break

        else:
            print("Opción inválida. Por favor, seleccione una opción válida.")

        print()

# Ejecutar el menú
menu()
