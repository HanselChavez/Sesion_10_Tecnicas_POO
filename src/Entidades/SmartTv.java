/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Estudiante
 */
public class SmartTv extends Dispositivo
    implements Navegador,ReproductorDeMusica{

    private String marca ;
    private String modelo;
    private int tipoEntrada;
    
    private final int HDMI=0;
    private final int VGA = 1;
    private final int DVI=2;
    private final int DisplayPort=3;
    private final int RCA=4;
    private final int Signal=5;
    private final int Svideo=6;
    private final int Coaxial=7;

    
    
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
    }    @Override
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
    public int getTipoConexion() {
        return tipoEntrada;
    }
    public void setTipoConexion(int tipo) {
        this.tipoEntrada = tipo;
    }
    public String getNombre() {
        String nombreEntrada="";
        switch(this.tipoEntrada){
            case 0:
                nombreEntrada = "HDMI";break;
            case 1:
                nombreEntrada = "VGA";break;
            case 2:
                nombreEntrada = "DVI";break;
            case 3:
                nombreEntrada = "DisplayPort";break;
            case 4:
                nombreEntrada = "RCA";break;
            case 5:
                nombreEntrada = "Signal";break;
            case 6:
                nombreEntrada = "Svideo";break;
            default:
                nombreEntrada = "Coaxial";break;                
        }        
        return "Marca: ".concat(marca)+"   Entrada: " +nombreEntrada;
    }
    
}
