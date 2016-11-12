package mx.uach.videoclubhb;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import mx.uach.videoclubhb.enums.Prestamos;

/**
 * Modelo para mappear los prestamos de las peliculas del VideoClub.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 06/10/2016
 */
@Entity
public class Prestamo{

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Date fechaEntrega;
    private Prestamos estatus;
    private Ficha ficha;
    private Cinta cinta;

    /**
     * Constructor vacio.
     */
    public Prestamo() {
    }

    /**
     * Constructor que trae de parametros la fecha de entrega, estatus, ficha y
     * cinta del prestamo.
     *
     * @param fechaEntrega que es la fecha de entrega de la cinta.
     * @param estatus que es el estado del prestamo.
     * @param ficha que es la ficha del prestamo.
     * @param cinta que es la cinta del prestamo.
     */
    public Prestamo(Date fechaEntrega, Prestamos estatus, Ficha ficha, Cinta cinta) {
        this.fechaEntrega = fechaEntrega;
        this.estatus = estatus;
        this.ficha = ficha;
        this.cinta = cinta;
    }

    /**
     * Método que obtiene la fecha de entrega de la cinta del prestamo.
     *
     * @return fechaEntrega que es la fecha de entrega de la cinta.
     */
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Método que asigna una fecha de entrega a una cinta dentro de un prestamo.
     *
     * @param fechaEntrega que es la fecha de entrega de la cinta.
     */
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Método que obtiene el estatus del prestamo.
     *
     * @return estatus que es el estatus del prestamo.
     */
    public Prestamos getEstatus() {
        return estatus;
    }

    /**
     * Método que asigna un estatus a un prestamo.
     *
     * @param estatus que es el estatus del prestamo.
     */
    public void setEstatus(Prestamos estatus) {
        this.estatus = estatus;
    }

    /**
     * Método que obtiene la ficha del prestamo.
     *
     * @return ficha que es la ficha del prestamo.
     */
    public Ficha getFicha() {
        return ficha;
    }

    /**
     * Método que asigna una ficha a un prestamo.
     *
     * @param ficha que es la ficha de un prestamo.
     */
    public void setFicha(Ficha ficha) {
        this.ficha= ficha;
    }

    /**
     * Método que obtiene la cinta del prestamo.
     *
     * @return cinta que es la cinta de un prestamo.
     */
    public Cinta getCinta() {
        return cinta;
    }

    /**
     * Método que asigna una cinta a un prestamo.
     *
     * @param cinta que es la cinta de un prestamo.
     */
    public void setCinta(Cinta cinta) {
        this.cinta = cinta;
    }
}
