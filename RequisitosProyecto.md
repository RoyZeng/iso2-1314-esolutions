# Introducción #

> En este documento detallaremos los diferentes requisitos funcionales y no funcionales que deberá cumplir el proyecto.

# Requisitos funcionales #

  * El sistema debe proporcionar una cobertura completa respecto al almacenamiento, la distribución y el mantenimiento de los productos dentro del propio almacén, así como entre los distintos almacenes.


  * Debe proporcionar la información referida a la caducidad de los productos si son perecederos además de cuando exista poco stock, notificando esta situación al usuario.


  * Se exige que el sistema opere a la máxima velocidad posible en el procesamiento de los artículos, actuando en tiempo real.


  * El entorno de desarrollo debe estar sincronizado, para permitir la coordinación de las actividades entre los distintos sectores de la empresa.


  * En el entorno de la aplicación deben coexistir diferentes tipos de usuario, con diferentes tipos de privilegios, identificándose este mediante usuario y esta contraseña.


  * Cada producto se identificará mediante un código numérico.


  * La aplicación debe proveernos de información acerca de las sucesivas entradas y salidas de productos , así como la causa de esta ( caducidad, mal estado, venta, traspaso de stock..)


  * El código se relaciona con el nombre, el tipo del producto, fecha de entrada y caducidad si tiene, además de la cantidad de producto que hay en stock (esta información se irá actualizando periódicamente).


  * El sistema deberá gestionar que productos pasan directamente a la tienda y cuales al almacén

# Requisitos no funcionales #

  * La aplicación debe ser accesible mediante una interfaz táctil.

  * La aplicación debe ser multiplataforma, pudiendo instalarse en cualquier entorno.

  * Base de datos implementada en SQL bajo MariaDB como SGBD.

  * Identificación de los productos mediante código de barras.

  * Entorno para análisis del problema con Visual Paradigm.

  * Lenguaje de programación a emplear: JAVA.