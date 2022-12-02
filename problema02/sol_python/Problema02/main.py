#Problema02
print("Ingrese la cantidad de trajes comprados: ")
cantidad_traje =  int(input())

print("Ingrese la el precio del traje comprado: ")
precio_traje = float(input())
subtotal = cantidad_traje * precio_traje

if cantidad_traje == 1 :
    descuento = subtotal * 20 / 100
    total = subtotal - descuento
if cantidad_traje == 2 :
    descuento = subtotal * 25 / 100
    total = subtotal - descuento
if cantidad_traje == 3 :
    descuento = subtotal * 40 / 100
    total = subtotal - descuento
if cantidad_traje > 3:
    descuento = subtotal * 50 / 100
    total = subtotal - descuento

print("El subtotal es :", subtotal)
print("El descuento es: ", descuento)
print("El total  a  pagar es: ", total)