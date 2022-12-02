#Problema 08#

metros = int(input("Escriba una cantidad en metros"))
contador =1
yardas = 3
pulgadas = 2.54
pies = 12
opcion = " "
mensaje = " "
bandera = True

while contador <= metros:
    yardas = contador * yardas
    pulgadas = pulgadas * contador
    pies = pies * contador
    mensaje = print(f"{contador}, {metros}, {yardas}pie, {pulgadas}cm, {pies}pulgadas")
    contador = contador + 1
    print(mensaje)