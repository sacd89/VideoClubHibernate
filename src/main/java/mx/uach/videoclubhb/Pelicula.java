package mx.uach.videoclubhb;

import javax.persistence.Entity;
import javax.persistence.Id;
import mx.uach.videoclubhb.enums.Genero;

/**
 * Modelo para mappear las peliculas del VideoClub
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 06/10/2016
 */
@Entity
public class Pelicula{

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String titulo;
    private Genero genero;
    private Integer duracion;
    private Director director;
    
    /**
     * Constructor vacio.
     */
    public Pelicula() {
    }

    /**
     * Constructor que trae de parametros el titulo, genero, duracion, director
     * y actores de la pelicula.
     *
     * @param titulo que es el titulo de la pelicula.
     * @param genero que es el genero de la pelicula.
     * @param duracion que es la duración de la pelicula.
     * @param director que es el director de la pelicula.
     */
    public Pelicula(String titulo, Genero genero, Integer duracion, Director director) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
    }

    /**
     * Método que obtiene el titulo de la pelicula.
     *
     * @return titulo que es el titulo de la pelicula.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método que asigna un titulo a una pelicula.
     *
     * @param titulo que es el titulo de la pelicula.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método que obtiene el genero de la pelicula.
     *
     * @return genero que es el genero de la pelicula.
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Método que asigna un genero a una pelicula.
     *
     * @param genero que es el genero de la pelicula.
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Método que obtiene la duración de la pelicula.
     *
     * @return duracion que es la duracion de la pelicula.
     */
    public Integer getDuracion() {
        return duracion;
    }

    /**
     * Método que asigna una duración a una pelicula.
     *
     * @param duracion que es la duración de la pelicula.
     */
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    /**
     * Método que obtiene el director de la pelicula.
     *
     * @return director que es el director de la pelicula.
     */
    public Director getDirector() {
        return director;
    }

    /**
     * Método que asigna un director a una pelicula.
     *
     * @param director que es el director de la pelicula.
     */
    public void setDirector(Director director) {
        this.director = director;
    }

}
