/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Estudiante
 */
public abstract class Dispositivo {
    String nombre;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String GetNombre(){
        return this.nombre;
    }
}
