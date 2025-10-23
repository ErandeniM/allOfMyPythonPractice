#1. Desarrolle un programa en Python que cree una lista e inicialice con 5 cadenas de caracteres leídas por teclado. 
#Copia los elementos de la lista en otra lista pero en orden inverso, y muestra sus elementos por la pantalla.
#2. Escriba un programa en python que permita crear una lista de palabras y que, a continuación de cuatro opciones:
#Contar: Pide una cadena, y debe decir cuantas veces aparece en la lista.
#Modificar: Pide una cadena, y otra cadena a modificar, y modifica todas las apariciones de la primera cadena por la segunda en la lista creada.
#Eliminar: Pide una cadena, y la elimina de la lista.
#Mostrar: Muestra la lista de cadenas.
#Terminar: Termina el programa.

# Parte 1
def parte1():
    lista_original = []
    for i in range(5):
        cadena = input("Ingrese una cadena de caracteres: ")
        lista_original.append(cadena)
    
    lista_inversa = lista_original[::-1]
    
    print("Lista en orden inverso:")
    for cadena in lista_inversa:
        print(cadena)
    return lista_original
# Parte 2
def parte2(lista_original):
    lista_palabras = lista_original.copy()
    
    while True:
        print("\nOpciones:")
        print("1. Contar")
        print("2. Modificar")
        print("3. Eliminar")
        print("4. Mostrar")
        print("5. Terminar")
        
        opcion = input("Seleccione una opción (1-5): ")
        
        if opcion == '1':
            palabra = input("Ingrese la palabra a contar: ")
            conteo = lista_palabras.count(palabra)
            print(f"La palabra '{palabra}' aparece {conteo} veces en la lista.")
        
        elif opcion == '2':
            palabra_vieja = input("Ingrese la palabra a modificar: ")
            palabra_nueva = input("Ingrese la nueva palabra: ")
            lista_palabras = [palabra_nueva if palabra == palabra_vieja else palabra for palabra in lista_palabras]
            print(f"Todas las apariciones de '{palabra_vieja}' han sido modificadas a '{palabra_nueva}'.")
        
        elif opcion == '3':
            palabra = input("Ingrese la palabra a eliminar: ")
            lista_palabras = [palabra_actual for palabra_actual in lista_palabras if palabra_actual != palabra]
            print(f"La palabra '{palabra}' ha sido eliminada de la lista.")
        
        elif opcion == '4':
            print("Lista de palabras:")
            for palabra in lista_palabras:
                print(palabra)
        
        elif opcion == '5':
            print("Terminando el programa.")
            break
        
        else:
            print("Opción no válida. Por favor, seleccione una opción del 1 al 5.")
# Ejecutar las partes del programa
lista = parte1()
parte2(lista)

