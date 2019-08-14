/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.tallerjoption;

import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class TallerJoption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Temp = "";
        for(int i = 1; i <= 3; i++){
            //Se pedirá ciclicamente las tres palabras
            Temp+=JOptionPane.showInputDialog("Ingrese la Palabra " + i)+ " ";
        }
        JOptionPane.showMessageDialog(null,Temp);
    }
}
