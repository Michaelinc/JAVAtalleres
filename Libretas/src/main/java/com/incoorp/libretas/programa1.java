/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.libretas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class programa1 {

    /**
     * Programa para generar una Libreta de direcciones
     */
    public static void main(String[] args) {
        
        LibretaDirecciones nuevalibreta = new LibretaDirecciones();    
        nuevalibreta.setLista(new ArrayList<RegistroLibreta>());
        menu m = new menu();
        boolean salir = false;
        
   
        String op ="";
        while(!salir){
            m.menu();
            op = JOptionPane.showInputDialog("Ingrese la opcion");
            switch(op){
                case "1":
                    RegistroLibreta rl = new RegistroLibreta();
                    rl.nombre = JOptionPane.showInputDialog("Ingrese nombre");
                    rl.direccion = JOptionPane.showInputDialog("Ingrese direccion");
                    rl.telefono = Integer.parseInt(JOptionPane.showInputDialog(
                                "Ingrese telefono"));
                    rl.email = JOptionPane.showInputDialog("Ingrese email");
                    nuevalibreta.addEntrada(rl);
                    break;
                    
                case "2":
                    int telefono=Integer.parseInt(JOptionPane.showInputDialog(
                                "Ingrese el telefono de la libreta"));
                    nuevalibreta.removeEntrada(telefono);
                    break;
                    
                case "3":
                    System.out.println("   Entradas");
                    nuevalibreta.showEntradas();
                    int fila=Integer.parseInt(JOptionPane.showInputDialog(
                                "Ingrese la posicion de la libreta"));
                    nuevalibreta.getLista().get(fila-1).nombre= JOptionPane.showInputDialog("Ingrese nombre");
                    nuevalibreta.getLista().get(fila-1).direccion = JOptionPane.showInputDialog("Ingrese direccion");
                    nuevalibreta.getLista().get(fila-1).telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese telefono"));
                    nuevalibreta.getLista().get(fila-1).email = JOptionPane.showInputDialog("Ingrese email");
                    break;
                
                case "4":
                    System.out.println("   Entradas");
                    nuevalibreta.showEntradas();
                    System.out.println("fin");
                    break;
                
                case "5":
                    salir = true;
                    break;
            }
        }       
    }
}
