#Problema 03#

String
nombre
tipoempleado
numerohora = 0
horasextras
double
cuotapago
double
pagoextra = 0
double
sueldopagar

System.out.println("Ingrese el nombre del empleado por favor");
nombre = entrada.nextLine();
System.out.println("Ingrese el tipo de empleado por favor(1,2,3 o 4)");
tipoempleado = entrada.nextInt();
System.out.println("Ingrese la cuota que se paga por hora extra");
cuotapago = entrada.nextDouble();
System.out.println("Ingrese las horas extras trabajadas");
horasextras = entrada.nextInt();

sueldopagar = numerohora * cuotapago;

if (tipoempleado == 1)
pagoextra = horasextras * 1.5
sueldopagar = sueldopagar + pagoextra
else
if (tipoempleado == 2)
pagoextra = horasextras * 2
sueldopagar = sueldopagar + pagoextra
 if (tipoempleado == 3)
pagoextra = horasextras * 2.5
sueldopagar = sueldopagar + pagoextra
else
if (tipoempleado == 4)
pagoextra = horasextras * 3
sueldopagar = sueldopagar + pagoextra


sueldopagar = sueldopagar + pagoextra
System.out.printf("El sueldo a pagar es:" + sueldopagar)