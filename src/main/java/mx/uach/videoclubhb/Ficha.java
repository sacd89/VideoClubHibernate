package mx.uach.videoclubhb;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Modelo para mappear las Fichas de las peliculas del VideoClub
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 06/10/2016
 */
@Entity
public class Ficha implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Date fechaPrestamo;
    private Socio socio;

    /**
     * Constructor vacio.
     */
    public Ficha() {
    }

    /**
     * Constructor que trae de parametros la fecha de prestamo y el socio de la
     * ficha.
     *
     * @param fechaPrestamo que es la fecha de prestamo de la cinta.
     * @param socio que es el socio al que se le hizo el prestamo.
     */
    public Ficha(Date fechaPrestamo, Socio socio) {
        this.fechaPrestamo = fechaPrestamo;
        this.socio = socio;
    }

    /**
     * Método que obtiene la fecha del prestamo de la ficha.
     *
     * @return fechaPrestamo que es la fecha de prestamo de la ficha.
     */
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Método que asigna una fecha de prestamo a la ficha.
     *
     * @param fechaPrestamo que es la fecha de prestamo de la ficha.
     */
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * Método que obtiene el socio de la ficha.
     *
     * @return socio que es el socio de la ficha.
     */
    public Socio getSocio() {
        return socio;
    }

    /**
     * Método que asigna un socio a la ficha.
     *
     * @param socio que es el socio de la ficha.
     */
    public void setSocio(Socio socio) {
        this.socio = socio;
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
        Ficha other = (Ficha) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s", this.getFechaPrestamo(), this.getSocio());
    }

}
