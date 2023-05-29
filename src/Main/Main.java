/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Navegador;
import Pantallas.ListaDeNavegadores;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Main {
  
   
    private static List<Navegador> listanav = new ArrayList<>();   
    public static void main(String args[]) {
        ListaDeNavegadores lista  = new ListaDeNavegadores(listanav);
        lista.setVisible(true);
        
    }
}   
