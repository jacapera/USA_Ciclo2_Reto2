package com.jcapera.reto2;

import java.util.HashMap;
import java.util.Map;

/**
 *  En esta clase se crearan todos los métodos para realizar las operaciones del reto 2
 * @author jesus capera
 */
public class BaseDatosProductos {

    private Map<Integer, Producto> listaProductos = new HashMap<>();
     
    /**
     * Metodo constructor donde voy a crear una colección de datos de tipo HashMap que representara mi base datos de productos
     */
    public BaseDatosProductos() {
        listaProductos.put(1, new Producto(1, "Manzanas", 5000, 25));
        listaProductos.put(2, new Producto(2, "Limones", 2300, 15));
        listaProductos.put(3, new Producto(3, "Peras", 2700, 33));
        listaProductos.put(4, new Producto(4, "Arandanos", 9300, 5));
        listaProductos.put(5, new Producto(5, "Tomates", 2100, 42));
        listaProductos.put(6, new Producto(6, "Fresas", 4100, 3));
        listaProductos.put(7, new Producto(7, "Helado", 4500, 41));
        listaProductos.put(8, new Producto(8, "Galletas", 500, 8));
        listaProductos.put(9, new Producto(9, "Chocolate", 3500, 80));
        listaProductos.put(10, new Producto(10, "Jamon", 15000, 10));
    }

    public boolean verificarExistencia(Producto producto) {
        boolean resultado = listaProductos.containsKey(producto.getCodigo());
        return resultado;
    }

    public void agregar(Producto producto) {
        listaProductos.put(producto.getCodigo(), producto);
    }

    public void borrar(Producto producto) {
        listaProductos.remove(producto.getCodigo());
    }

    public void actualizar(Producto Producto) {
        listaProductos.replace(Producto.getCodigo(), Producto);
    }

    public double inventarioTotal() {
        double sumatoria = 0;
        for (Map.Entry<Integer, Producto> i : listaProductos.entrySet()) {
            sumatoria += i.getValue().getPrecio() * i.getValue().getInventario();
        }
        return sumatoria;
    }

    public void presentarInforme() {
        //System.out.println(precioMayor() + " " + precioMenor() + " " + String.format("%.1f", promedio()));
        System.out.println(String.format("%.1f", inventarioTotal()));

    }

    public String precioMayor() {
        double precioMayor = 0;
        String nombrePrecioMayor = "";
        for (Producto i : listaProductos.values()) {
            if (i.getPrecio() > precioMayor) {
                precioMayor = i.getPrecio();
                nombrePrecioMayor = i.getNombre();
            }
        }
        return nombrePrecioMayor;
    }

    public String precioMenor() {
        double precioMenor = listaProductos.get(1).getPrecio();
        String nombrePrecioMenor = listaProductos.get(1).getNombre();
        for (Producto i : listaProductos.values()) {
            if (i.getPrecio() < precioMenor) {
                precioMenor = i.getPrecio();
                nombrePrecioMenor = i.getNombre();
            }
        }
        return nombrePrecioMenor;
    }

    public double promedio() {
        double sumatoria = 0;
        for (Map.Entry<Integer, Producto> i : listaProductos.entrySet()) {
            sumatoria += i.getValue().getPrecio();
        }
        return sumatoria / listaProductos.size();
    }

}
