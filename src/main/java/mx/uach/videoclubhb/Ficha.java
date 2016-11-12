package mx.uach.videoclubhb;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Modelo para mappear las Fichas de las peliculas del VideoClub
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 06/10/2016
 */
@Entity
public class Ficha {

    @Id
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

}
