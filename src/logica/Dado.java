/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Random;
/**
 *
 * @author Estudiantes
 */
public class Dado {
    public int lanzamiento(){
       Random r = new Random();
       int valorDado = r.nextInt(6)+1;
       return valorDado;
    }
}
