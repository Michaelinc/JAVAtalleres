/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.creacionfactura;

/**
 *
 * @author michael
 */
public class Pedidos {
    int cantidad;
    String descripcion;
    double precioU;

    public Pedidos(int cantidad, String descripcion, double precioU) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioU = precioU;
    }
    
    
    
    public double SubTotal(){
        double subtotal = cantidad * precioU;
        return subtotal;
    }
    
}
