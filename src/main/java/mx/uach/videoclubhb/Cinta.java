package mx.uach.videoclubhb;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Modelo para mappear las cintas de las peliculas del VideoClub
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 06/10/2016
 */
@Entity
public class Cinta implements Serializable {

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
        Cinta other = (Cinta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Método donde declaramos el formato para impresión.
     *
     * @return String con los datos de la cinta.
     */
    @Override
    public String toString() {
        return String.format("%s %s", this.getNumCopia(), this.getPelicula());
    }

}
