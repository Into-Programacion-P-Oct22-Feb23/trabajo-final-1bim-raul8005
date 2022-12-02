#Problema 05#
print("Ingrese el primer valor:")
valorx = float(input())

print("Ingrese el segundo valor")
valory = float(input())

if valorx > 0 and valory > 0:
    plano = "Cuadrante es = 1"
if valorx < 0 and valory > 0:
    plano = "Cuadrante es = 2"
if valorx < 0 and valory < 0:
    plano = "Cuadrante es = 3"
if valorx > 0 and valory < 0:
    plano = "Cuadrante es =4"

print(plano)