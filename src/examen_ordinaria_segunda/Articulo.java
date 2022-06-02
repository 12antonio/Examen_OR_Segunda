/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_ordinaria_segunda;

/**
 *
 * @author DAW
 */
public class Articulo {
    private int identificador;
    private String nombre;
    private double precio_venta_cliente;
    private double precio_compra_proveedor;
    private double IVA;
    private int stock;

    
    public Articulo(int identificador, String nombre, double precio_venta_cliente, double precio_compra_proveedor, double IVA, int stock) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.precio_venta_cliente = precio_venta_cliente;
        this.precio_compra_proveedor = precio_compra_proveedor;
        this.IVA = IVA;
        this.stock = stock;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio_venta_cliente() {
        return precio_venta_cliente;
    }

    public double getPrecio_compra_proveedor() {
        return precio_compra_proveedor;
    }

    public double getIVA() {
        return IVA = 21;
    }

    public int getStock() {
        return stock;
    }
    
    
    public void setPrecio_venta_cliente(double precio_venta_cliente) {
        this.precio_venta_cliente = precio_venta_cliente;
    }

    public void setPrecio_compra_proveedor(double precio_compra_proveedor) {
        this.precio_compra_proveedor = precio_compra_proveedor;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public String toString(){
        return "\n Identificador: " + identificador
                + "\n Nombre: " + nombre
                + "\n Precios de venta: " + precio_venta_cliente
                + "\n Precios de compra: " + precio_compra_proveedor
                + "\n IVA: " + IVA
                + "\n Stock: " + stock;
    }

    

    

    
    
}
