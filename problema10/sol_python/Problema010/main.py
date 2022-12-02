# Problema 10

suma = 0
contador = 0
bandera = True

while bandera:
    print("Ingrese un numero por favor:")
    numero = float(input())
    suma = suma + numero
    contador = contador + 1

    print("Si desea terminar el preceso ingrese X:")
    salida = input()
    if salida == "X":
        bandera = False

media = suma / contador
print("La media es: ", media)