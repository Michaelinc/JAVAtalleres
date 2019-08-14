/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.numeros1to100;

/**
 *
 * @author michael
 */
public class Numeros1to100 {

    /**
     * Imprime los numeros del 1 al 100,
     * tal que no terminen en 2 o 5
     * 
     * Cabe aclarar que los numeros del 1 al 10,
     * ninguno finaliza en 2 o 5
     */
    public static void main(String[] args) {
        
        for(int i = 1; i < 100; i++){
            if(i > 10){
                if(i%10 != 2 && i%10 != 5){
                    System.out.println(i);
                }
            }else{
                System.out.println(i);
            }
        }
    
    }
}
