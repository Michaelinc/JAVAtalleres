/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.tallerscanner;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class TallerScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanIn = new Scanner(System.in);
        String Temp = "";
       
        for(int i = 1; i <= 3; i++){
            //Se pedirá ciclicamente las tres palabras
            System.out.print("Ingrese la Palabra " + i + ": ");
            String palabra = scanIn.nextLine();
            Temp +=palabra+ " "; 
        }
        
        System.out.println(Temp);
    }
    
}
