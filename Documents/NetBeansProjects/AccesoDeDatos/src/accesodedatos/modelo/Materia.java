/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodedatos.modelo;

/**
 *
 * @author programador
 */
public class Materia {
  private int id=-1;
  private String nombre;
    
public Materia(int id, String nombre) {
this.id= id;
this.nombre = nombre;
}

public Materia( String nombre) {
this.nombre = nombre;
}
}