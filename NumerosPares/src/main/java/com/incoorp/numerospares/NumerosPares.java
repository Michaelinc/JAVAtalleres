/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.numerospares;

/**
 *
 * @author michael
 */
public class NumerosPares {

    /**
     * Imprime los numeros pares entre 
     * 1539 y el 2505
     */
    public static void main(String[] args) {
        
        int numero1 = 1539;
        int numero2 = 2505;
        
        for(int i = numero1; i < numero2; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    
}
