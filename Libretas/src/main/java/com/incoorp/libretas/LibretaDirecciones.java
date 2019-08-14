/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.libretas;

import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class LibretaDirecciones {
    
    private ArrayList<RegistroLibreta> lista;  

    public ArrayList<RegistroLibreta> getLista() {
        return lista;
    }

    public void setLista(ArrayList<RegistroLibreta> lista) {
        this.lista = lista;
    }

   
    
    public void removeEntrada(int telefono){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).telefono == telefono)
                lista.remove(i);
        }
    }
    
    public void addEntrada(RegistroLibreta libreta){
        lista.add(libreta);
    }
    
    public void updateEntrada(int n,RegistroLibreta libreta){
        lista.get(n).nombre = libreta.nombre;
        lista.get(n).email = libreta.email;
        lista.get(n).direccion = libreta.direccion;
        lista.get(n).telefono = libreta.telefono;
                
    }
    
    public void showEntradas(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).nombre + " " +
                    lista.get(i).direccion + " " + lista.get(i).telefono +
                    " " + lista.get(i).email );
        }
    }
    
    
}
