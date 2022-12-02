# Problema 05

contador = 1
numero = 1
serie = ""

while numero <= 100 :
    serie = serie + str(contador) + "+" + str(numero) + "/"
    numero = numero  + contador

print(serie)