package mx.uach.videoclubhb;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Método que obtiene el id del socio.
     *
     * @return id que es el id del socio.
     */
    public Long getId() {
        return id;
    }

    /**
     * Método que asigna un nombre a un socio.
     *
     * @param id que es el id del socio.
     */
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actor)) {
            return false;
        }
        Pelicula other = (Pelicula) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Método donde declaramos el formato para impresión.
     *
     * @return String con los datos de la pelicula.
     */
    @Override
    public String toString() {
        return String.format("%s %s", this.getTitulo(), this.getDuracion());
    }

}
