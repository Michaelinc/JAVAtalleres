/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.tallerbuffered;

import java.io.*;

/**
 *
 * @author michael
 */
public class TallerBuffered {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String Temp = "";
       
        for(int i = 1; i <= 3; i++){
            //Se pedirá ciclicamente las tres palabras
            System.out.print("Ingrese la Palabra " + i + ": ");
            try{
                String palabra = dataIn.readLine();
                Temp +=palabra+ " "; 
            }catch(IOException e){
                System.out.println("Error al obtener la entrada");
            }
            
        }
        
        System.out.println(Temp);
        
    }
    
}
    
    

