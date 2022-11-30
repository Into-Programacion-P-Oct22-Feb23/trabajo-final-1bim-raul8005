#Problema02
precio_traje = 35.50
descuento = 0
descuento1 = 20
descuento2 = 25
descuento3 = 40
descuento4 = 50
subtotal = 0
total = 0
cantidad_traje = input("Ingrese la cantidad de trajes comprados: \n")

subtotal = cantidad_traje * precio_traje

if (cantidad_traje ==1):
    descuento = subtotal * 20 / 100
    total = subtotal - descuento
else:
     if (cantidad_traje == 2):
        descuento = subtotal * 25 / 100
        total = subtotal - descuento

print("El total es:", total)