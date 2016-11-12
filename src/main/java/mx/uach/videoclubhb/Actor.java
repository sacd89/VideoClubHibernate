/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.videoclubhb;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author dsantillanes
 */
@Entity
public class Actor implements Serializable{

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    private String nombre;
    private String apellido;

    /**
     * Constructor vacio.
     */
    public Actor() {
    }

    /**
     * Constructor que trae de parametros el nombre y apellido del actor.
     *
     * @param nombre que es el nombre del actor.
     * @param apellido que es el apellido del actor.
     */
    public Actor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Método que te obtiene el nombre del actor.
     *
     * @return nombre que es el nombre del actor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que te asigna un nombre al actor.
     *
     * @param nombre que es el nombre del actor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que te obtiene el apellido del actor.
     *
     * @return apellido que es el apellido del actor.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método que asigna un apellido al actor.
     *
     * @param apellido que es el apellido del actor.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}
