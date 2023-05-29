/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Celular extends Dispositivo
    implements Camara,Navegador,ReproductorDeMusica{
    
    private String marca;
    private String modelo;
    
    
    public void mostrarMensaje(String mensaje){
    
        JOptionPane.showMessageDialog(null,mensaje );
    }
    
    @Override
    public void capturarFoto() {
       
    }

    @Override
    public void grabarVideo() {
        
    }

    @Override
    public void getApertura() {
        
    }

    @Override
    public void navegar() {
     
    }

    @Override
    public void abirLink(String link) {
       
    }

    @Override
    public void reproducir() {
       
    }

    @Override
    public void adelantar() {
      
    }

    @Override
    public void retroceder() {

    }

    @Override
    public void pausar() {
    
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return "Marca: ".concat(marca)
                +"   ".concat("Modelo: ".concat(this.modelo));
    }
    
    
}
