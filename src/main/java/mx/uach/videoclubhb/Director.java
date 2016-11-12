package mx.uach.videoclubhb;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Modelo para mappear los directores de las peliculas del VideoClub
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
@Entity
public class Director {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String nombre;

    /**
     * Constructor vacio
     */
    public Director() {
    }

    /**
     * Constructor que trae de parametro el nombre del director.
     *
     * @param nombre que es el nombre del director.
     */
    public Director(String nombre) {
        this.nombre = nombre;
    }

   
    /**
     * Método que te obtiene el nombre del director.
     *
     * @return nombre del director.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar un nombre al director.
     *
     * @param nombre que es el nombre del director.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
