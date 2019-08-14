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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factura fac = new Factura();
        Pedidos ped = new Pedidos(3, "cafe", 2000);
        Pedidos ped2 = new Pedidos(10, "Arroz", 2645);
        fac.setEmisor(new Agente("pedro","123","dasd",5645));
        fac.setCliente(new Agente("carlos","321","nggf",87687));
        fac.setListapedidos(new ArrayList<>());
        fac.setPedidos(ped);
        fac.setPedidos(ped2);
        fac.ScreenFactura();
    }
    
}
