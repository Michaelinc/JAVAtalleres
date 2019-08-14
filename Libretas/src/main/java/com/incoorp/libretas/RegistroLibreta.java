/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.libretas;

/**
 *
 * @author michael
 */
public class RegistroLibreta {
    
    String nombre;
    String direccion;
    int telefono;
    String email;

    public RegistroLibreta() {
    }

    public RegistroLibreta(String nombre, String direccion, int telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "RegistroLibreta{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
    
    
    
}
