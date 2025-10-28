"""Instrucciones
1. Escriba un programa en Python que permita leer 6 números y los agregue a una lista y usa un bucle `while`
 para recorrerla y contar cuántos números son mayores que 5.
2. Escriba un programa en Python que cree un diccionario con 5 claves (nombres de productos) y sus respectivos precios.
 Debe calcular e imprimir el precio total de los productos."""
#EJERCICIO 1
lista = []
print("Ingrese 6 números")
while len(lista) < 6:
    numero = int(input("Número: "))
    lista.append(numero)
print("Números ingresados:", lista)
mayores_5 = []
if len(lista) > 0:
    i = 0
    while i < len(lista):
        if lista[i] > 5:
            mayores_5.append(lista[i])
        i += 1
print("Números mayores que 5:", mayores_5)
print("Cantidad de números mayores que 5:", len(mayores_5))
#EJERCICIO 2
productos = {"Libertad financiera":9999, "Amor verdadero":3500, "Salud perfecta":10000, "Viaje soñado":1500, "Exito profesional":2000}
total_precio = 0
for precio in productos.values():
    total_precio += precio  
print("Productos y precios:", productos)
print("El precio total de los productos es:", total_precio)
