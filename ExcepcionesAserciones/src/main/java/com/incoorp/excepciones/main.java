/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String hex = (JOptionPane.showInputDialog("Ingrese un numero"
                                                  + " Hexadecimal"));
        try{
        int decimal = Integer.parseInt(hex,16);
        System.out.println("EL numero ingresado, convertido a decimal es: " 
                          +decimal);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Numero hexadecimal invalido");
        }
    }
    
}
