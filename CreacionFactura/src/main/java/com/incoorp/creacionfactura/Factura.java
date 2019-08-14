/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.creacionfactura;

import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class Factura extends Precio{
    private Agente emisor;
    private Agente cliente;
    private ArrayList<Pedidos> Listapedidos; 

    public Factura() {
    }

    public Factura(Agente emisor, Agente cliente,
            ArrayList<Pedidos> Listapedidos) {
        this.emisor = emisor;
        this.cliente = cliente;
        this.Listapedidos = Listapedidos;
    }
    
    public void ScreenFactura(){
        System.out.println("Nombre emisor: "+emisor.nombre+"\n"+
            "NIT: "+emisor.nit+"\n"+
            "Telefono: "+emisor.telefono+"\n"+"Email: "+emisor.email+
                "\n-----------------------------");
        System.out.println("Nombre cliente: "+cliente.nombre+"\n"+
            "NIT: "+cliente.nit+"\n"+
            "Telefono: "+cliente.telefono+"\n"+"Email: "+cliente.email+
                "\n-----------------------------");
        System.out.println("Cantidad"+" "+"Descripcion"+" "+"PrecioU"+
                            "\n-----------------------------");
        for(int i = 0; i < Listapedidos.size();i++){
            System.out.println("    "+Listapedidos.get(i).cantidad+
                    "        "+Listapedidos.get(i).descripcion+"     "+
                    Listapedidos.get(i).precioU);
        }
    }

    public void setListapedidos(ArrayList<Pedidos> Listapedidos) {
        this.Listapedidos = Listapedidos;
    }
    

    public Agente getEmisor() {
        return emisor;
    }

    public void setEmisor(Agente emisor) {
        this.emisor = emisor;
    }

    public Agente getCliente() {
        return cliente;
    }

    public void setCliente(Agente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Pedidos> getListapedidos() {
        return Listapedidos;
    }

    public void setPedidos(Pedidos ped) {
        Listapedidos.add(ped);
    }
    
    
    
    
}
