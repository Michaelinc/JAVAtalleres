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
public class EstudianteInformatica extends Estudiante{
    
    private String codCarrera;
    private String semestre;
    private int materiasMatricualdas;

    public EstudianteInformatica(String codCarrera, String semestre, int materiasMatricualdas, String nombre, String Cedula, int telefono, String direccion, String email) {
        super(nombre, Cedula, telefono, direccion, email);
        this.codCarrera = codCarrera;
        this.semestre = semestre;
        this.materiasMatricualdas = materiasMatricualdas;
    }

    public String getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(String codCarrera) {
        this.codCarrera = codCarrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getMateriasMatricualdas() {
        return materiasMatricualdas;
    }

    public void setMateriasMatricualdas(int materiasMatricualdas) {
        this.materiasMatricualdas = materiasMatricualdas;
    }
    
    
    
}
