package mx.uach.videoclubhb;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Modelo para mappear las cintas de las peliculas del VideoClub
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 06/10/2016
 */
@Entity
public class Cinta {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Integer numCopia;
    private Pelicula pelicula;

    /**
     * Constructor vacio.
     */
    public Cinta() {
    }

    /**
     * Constructor que trae de parametros el número de copias y la pelicula de
     * la cinta.
     *
     * @param numCopia que es el número de copias de la cinta.
     * @param pelicula que es la pelicula de la cinta.
     */
    public Cinta(Integer numCopia, Pelicula pelicula) {
        this.numCopia = numCopia;
        this.pelicula = pelicula;
    }

    /**
     * Método que te obtiene el número de copias de la cinta.
     *
     * @return numCopia que es el número de copias de la cinta.
     */
    public Integer getNumCopia() {
        return numCopia;
    }

    /**
     * Método que asigna un número de copas a la cinta.
     *
     * @param numCopia que es el número de copias de la cinta.
     */
    public void setNumCopia(Integer numCopia) {
        this.numCopia = numCopia;
    }

    /**
     * Método que obtiene la pelicula de la cinta.
     *
     * @return pelicula que es la pelicula de la cinta.
     */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * Método que asigna una pelicula a la cinta.
     *
     * @param pelicula que es la pelicula de la cinta.
     */
    public void setPelicula(Pelicula pelicula) {

        this.pelicula = pelicula;
    }

}
