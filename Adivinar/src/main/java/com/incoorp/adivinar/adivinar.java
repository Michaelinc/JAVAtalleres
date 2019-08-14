/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.adivinar;

import static java.lang.Math.random;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class adivinar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = (int) (Math.random()*(10-1));
        int numeroUsuario = 0;
        etiqueta:
        System.out.println(numero);
        while(numero != numeroUsuario){
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog(
                                            "Numero: "));
            if(numeroUsuario < numero){
                System.out.println("El numero digitado es menor");
            }else if(numeroUsuario > numero){
                System.out.println("El numero digitado es Mayor");
            }
            
        }
        System.out.println("Numero encontrado: "+numero);
    }
    
}
