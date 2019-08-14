/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.talleresadicionales4;

/**
 *
 * @author michael
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Math3 m3 = new Math3();
        double arr[]={3.1,2.4,4.6};
        int arr2[]={3,2,4};
        System.out.println(m3.min(arr2));
        System.out.println(m3.min(arr));
    }
    
}
