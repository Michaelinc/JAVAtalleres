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
public class ArrayReales implements Estadisticas{
    double array[];

    @Override
    public double minimo(){
        double minTemp = array[0];
        for(int i = 1; i < array.length;i++){
            if(array[i] < minTemp){
                minTemp = array[i];
            }
        }
        return minTemp; 
    }


    @Override
    public double maximo(){
        double maxTemp = array[0];
        for(int i = 1; i < array.length;i++){
            if(array[i] > maxTemp){
                maxTemp = array[i];
            }
        }
        return maxTemp; 
    }


    @Override
    public double sumatorio(){
        double sumatorio=0.0;
        for(int i = 0; i < array.length;i++){
            sumatorio+=array[i];
        }
        return sumatorio; 
    }
    
}
