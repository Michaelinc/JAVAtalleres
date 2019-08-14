/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.talleresadicionales3;

/**
 *
 * @author michael
 */
public class Math2 {
    
    public static double max(double array[]){
        double maxTemp = array[0];
        for(int i = 1; i < array.length;i++){
            if(array[i] > maxTemp){
                maxTemp = array[i];
            }
        }
        return maxTemp; 
    }
    
    public static double min(double array[]){
        double minTemp = array[0];
        for(int i = 1; i < array.length;i++){
            if(array[i] < minTemp){
                minTemp = array[i];
            }
        }
        return minTemp; 
    }
    
    public static double sumatorio(double array[]){
        double sumatorio=0.0;
        for(int i = 0; i < array.length;i++){
            sumatorio+=array[i];
        }
        return sumatorio; 
    }
    
    public static double mediaA(double array[]){
        double mediaArit = sumatorio(array)/array.length;
        return mediaArit; 
    }
    
    public static double mediaG(double array[]){
        double prod=array[0];
        for(int i = 1; i < array.length;i++){
            prod*=array[i];
        }
        double base = Math.pow(array.length, -1);
        return Math.pow(prod,base);
    }
    
    
    
}
