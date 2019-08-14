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
public class Math3 implements Extremos{
    @Override
    public double max(double array[]){
        double maxTemp = array[0];
        for(int i = 1; i < array.length;i++){
            if(array[i] > maxTemp){
                maxTemp = array[i];
            }
        }
        return maxTemp; 
    }
    
    @Override
    public  double min(double array[]){
        double minTemp = array[0];
        for(int i = 1; i < array.length;i++){
            if(array[i] < minTemp){
                minTemp = array[i];
            }
        }
        return minTemp; 
    }

    @Override
    public int max(int array[]){
        double maxTemp = array[0];
        for(int i = 1; i < array.length;i++){
            if(array[i] > maxTemp){
                maxTemp = array[i];
            }
        }
        return (int) maxTemp; 
    }
    
    @Override
    public int min(int array[]){
        double minTemp = array[0];
        for(int i = 1; i < array.length;i++){
            if(array[i] < minTemp){
                minTemp = array[i];
            }
        }
        return (int) minTemp; 
    }
    
}
