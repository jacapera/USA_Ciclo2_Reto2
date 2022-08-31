# MinTic Universidad Sergio Arboleda Ciclo2
## USA_Ciclo2_Reto2

<strong>Sistema de inventario para la cafetería de la Sergio Arboleda</strong>

Una de las cafeterías de la Sergio Arboleda vende frutas, dulces y algunas bebidas. Con el propósito de mejorar el control sobre las ventas y el inventario de la tienda, la universidad decide construir
una aplicación en Java que le permita almacenar la información de los productos y calcular algunas estadísticas sobre el inventario. Con el propósito detener una especificación más clara sobre lo que
debería hacer la aplicación, el administrador de la tienda construyen el siguiente diagrama de casos de uso:

![Casos de uso Reto2](https://user-images.githubusercontent.com/96667971/187594639-db6555ef-0e01-4cf3-badf-d8011c77b833.png)

Usted es contratado por la universidad para desarrollar el sistema de inventario con las funcionalidades presentadas en el diagrama de casos de uso en el lenguaje de programación Java.
Debido a que esta es una etapa inicial en el desarrollo de la aplicación, la base de datos será representada temporalmente mediante un HashMap llamado listaProductos que tendrá por
llave el código del producto y por valor una instancia de la clase Producto que tendrá como atributos código, nombre, precio e inventario. La Tabla 1 presenta los productos
disponibles a la fecha en la cafetería.

Tabla 1: Productos disponibles en la tienda

<table>
  <tr>
    <td><strong>código</strong></td>
    <td><strong>nombre</strong></td>
    <td><strong>precio</strong></td>
    <td><strong>inventario</strong></td>
  </tr>
  <tr>
    <td>1</td>
    <td>Manzanas</td>
    <td>5000.0</td>
    <td>25</td>
  </tr>
  <tr>
    <td>2</td>
    <td>Limones</td>
    <td>2300.0</td>
    <td>15</td>
  </tr>
    <tr>
    <td>3</td>
    <td>Peras</td>
    <td>2700.0</td>
    <td>33</td>
  </tr>
    <tr>
    <td>4</td>
    <td>Arandanos</td>
    <td>9300.0</td>
    <td>5</td>
  </tr>
    <tr>
    <td>5</td>
    <td>Tomates</td>
    <td>2100.0</td>
    <td>42</td>
  </tr>
    <tr>
    <td>6</td>
    <td>Fresas</td>
    <td>4100.0</td>
    <td>3</td>
  </tr>
    <tr>
    <td>7</td>
    <td>Helado</td>
    <td>4500.0</td>
    <td>41</td>
  </tr>
  </tr>
    <tr>
    <td>8</td>
    <td>Galletas</td>
    <td>500.0</td>
    <td>8</td>
  </tr>
  </tr>
    <tr>
    <td>9</td>
    <td>Chocolates</td>
    <td>3500.0</td>
    <td>80</td>
  </tr>
  </tr>
    <tr>
    <td>10</td>
    <td>Jamon</td>
    <td>15000.0</td>
    <td>10</td>
  </tr>
</table>

Su misión si decide aceptarla, es implementar todas las funcionalidades presentadas en el diagrama de casos de uso. Para esto es necesario construir 3 métodos que representen las operaciones de agregar,
actualizar y eliminar. Estas funciones deben implementarse en una clase con el nombre BaseDatosProductos que contenga el HashMap listaProductos.


Adicionalmente, el dueño del almacén desea generar un informe que contenga el valor total del inventario a la fecha. Este se obtiene multiplicando el precio de cada producto por el inventario
disponible y luego sumando todos los resultados. Este método debe llamarse generarInforme e implementarse en la clase BaseDatosProductos.

Por ejemplo, al generar el informe con los datos disponibles en la Tabla 1 obtendríamos: Valor del inventario: 1014100.0

Para evitar errores a la hora de agregar, actualizar y borrar productos, se debe implementar un método llamado verificarExistencia que permitirá comprobar si el producto existe o no en
la base de datos. Este método debe implementarse en la clase BaseDatosProductos.

<strong>Entrada:</strong>

-La primera línea estará formada por una cadena de texto que identifica la operación a realizar. En este caso, las operaciones válidas son: (AGREGAR, BORRAR, ACTUALIZAR)
-La segunda línea estará formada por 4 valores (código, nombre, precio, inventario) que representan el producto sobre el cual se quiere realizar la operación.
-En el caso de la operación ACTUALIZAR la segunda línea debe contener el código y los nuevos valores del producto.
-En el caso de la operación BORRAR se deben especificar todos los atributos del producto a eliminar.

<strong>Salida:</strong>

-La salida estará representada por una única línea formada por un único valor: Valor del inventario.
-Este valor debe imprimirse después de realizar las operaciones solicitadas en la entrada de datos.
-El valor del inventario debe imprimirse con un número decimal.
-En caso de solicitar ACTUALIZAR o BORRAR un producto que no existe (es decir, que el código del producto no se encuentra en la base de datos), se debe imprimir “ERROR”.
-En caso de solicitar AGREGAR un producto cuyo código ya existe en la base de datos se debe imprimir “ERROR”.



https://user-images.githubusercontent.com/96667971/187596102-237b1033-48e7-463e-99ce-57f999825d2c.mp4












