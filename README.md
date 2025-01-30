### UNIVERSIDAD TECNOLÓGICA NACIONAL FACULTAD REGIONAL GENERAL PACHECO

#### Tecnicatura Universitaria en Programación

#### Laboratorio de computación IV

# TP 4 - Ejercicios de aplicaciones de escritorio

<b>IMPORTANTE:</b> Se pide crear una pantalla principal, con un botón correspondiente a cada ejercicio. 
Esta pantalla, siempre debe estar visible y cada uno de los botones debe abrir una nueva ventana, de forma que el usuario pueda ingresar a cada uno de los ejercicios planteados mediante el botón correspondiente. 
Crear una clase llamada principal y dentro crear el método main. Este método main será el encargado de abrir la pantalla principal:

![Captura](https://github.com/user-attachments/assets/544948ef-bb60-4ce3-b830-70f9b0468bb8)

## EJERCICIO 1. 
Se le pedirá al usuario, ingresar los datos de contacto de una persona. Al hacer clic sobre 
el botón mostrar, los datos ingresados serán mostrados en un JLabel que se encuentra 
en la parte inferior (solo si completó todos los campos). 

![Captura2](https://github.com/user-attachments/assets/3ff92f67-8d52-448a-b029-74b7de3bff00)

Si hizo clic sobre el botón mostrar, pero no completó todos los campos, se cambiará el 
color de fondo del campo incompleto por color rojo. 

![Captura3](https://github.com/user-attachments/assets/9f6a82a0-cc85-4ebf-88d9-0db7c2a88f0b)

Luego de hacer clic en Mostrar, y de mostrar la información en el JLabel, recordar limpiar 
los JTextField (colocarlos en blanco y sin texto) 
El botón cerrar de la ventana, solo debe cerrar la ventana en la que se está haciendo clic.

## EJERCICIO 2.
El usuario deberá ingresar tres notas numéricas de 1 a 10 (puede ingresar números 
decimales) y luego deberá elegir del JComboBox destinado para los TPs la opción 
“Aprobado” o “Desaprobado”.

Luego, al hacer clic en el botón calcular, se llenará la información del cuadro “Notas del 
estudiante” con promedio y condición. La condición puede ser Promoción, Libre o 
Regular. 

• Siempre que el TP esté en condición Desaprobado, la condición del alumno es 
libre independientemente de las tres notas numéricas obtenidas. 

• Si alguna de las tres notas del alumno es inferior a 6, la condición del alumno es 
libre independientemente de la nota del TP. 

• Si la nota de los tres parciales es superior o igual a 8 y el TP se encuentra 
aprobado, entonces la condición es promocionado. 

• Si los tres parciales se encuentran en el rango de notas entre 6 y 8 y el Tp se 
encuentra aprobado, entonces la condición es regular. 

![Captura4](https://github.com/user-attachments/assets/134d5b75-7b1b-473c-92a1-1f9070201329)

El botón nuevo limpiará las cajas de texto, para poder cargar las notas de un nuevo 
alumno. El botón salir, será el botón encargado cerrar la pantalla del ejercicio. El botón 
cerrar de la ventana, solo debe cerrar la ventana en la que se está haciendo clic.

## EJERCICIO 3.
Se pide realizar un programa que permita al usuario seleccionar un solo sistema 
operativo y las especialidades que le agraden. También deberá completar la cantidad de 
horas que le dedica a la computadora. 

![Captura5](https://github.com/user-attachments/assets/cc0ef327-b915-4ac0-ba33-a041a5c4acec)

Al hacer clic en el botón aceptar se mostrará la información seleccionada por el usuario: 

![Captura6](https://github.com/user-attachments/assets/7b905a24-b54e-4d49-88f8-2379385e6b6a)

El botón cerrar de la ventana, solo debe cerrar la ventana en la que se está haciendo clic. 
