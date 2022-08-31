package com.jcapera.reto2;

import java.util.Scanner;

/**
 *  Casos de prueba:
 * Entrada: AGREGAR 11 Melon 70 13        /  Salida: 	1015010.0
 * Entrada: BORRAR 10 Jamon 15000 10      /  Salida:	864100.0
 * Entrada: ACTUALIZAR 7 Helado 65000 11  /  Salida:	1544600.0
 * Entrada: BORRAR 14 Maiz 45000 12       /  Salida:    ERROR
 * Entrada: AGREGAR 11 Maiz 70000 1       /  Salida:   1084100.0
 * Entrada: ACTUALIZAR 10 Jamon 500 10    /  Salida:    869100.0
 * Entrada: BORRAR 3 Peras 2700 33        /  Salida:	925000.0
 * Entrada: BORRAR 15 Papa 1500 10        /  Salida:    ERROR
 * Entrada: ACTUALIZAR 15 Papa 1500 10    /  Salida:	ERROR
 * Entrada: AGREGAR 3 Peras 2700 33       /  Salida:	ERROR
 * @author jesus capera
 */
public class Reto2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String operacion = scanner.nextLine();
        String[] ingresoDatos = scanner.nextLine().split(" ");
        int codigo = Integer.parseInt(ingresoDatos[0]);
        String nombre = ingresoDatos[1];
        double precio = Double.parseDouble(ingresoDatos[2]);
        int inventario = Integer.parseInt(ingresoDatos[3]);
        
        Producto nuevoProducto = new Producto(codigo, nombre, precio, inventario);
        BaseDatosProductos baseOperaciones = new BaseDatosProductos();
        
        //Validando operación que se desea ejecutar
        if(operacion.equals("AGREGAR") && ( !baseOperaciones.verificarExistencia(nuevoProducto))){
            baseOperaciones.agregar(nuevoProducto);
            baseOperaciones.presentarInforme();
        }else if(operacion.equals("BORRAR") && (baseOperaciones.verificarExistencia(nuevoProducto))){
            baseOperaciones.borrar(nuevoProducto);
            baseOperaciones.presentarInforme();
        }else if(operacion.equals("ACTUALIZAR") && (baseOperaciones.verificarExistencia(nuevoProducto))){
            baseOperaciones.actualizar(nuevoProducto);
            baseOperaciones.presentarInforme();
        }
        else{
            System.out.println("ERROR");
        }
    }
}
