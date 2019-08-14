/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.tallerinformaticashape;

/**
 *
 * @author michael
 */
public class Estudiante {
    
    private String nombre;
    private String Cedula;
    private int telefono;
    private String direccion;
    private String email;

    public Estudiante(String nombre, String Cedula, int telefono, String direccion, String email) {
        this.nombre = nombre;
        this.Cedula = Cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
