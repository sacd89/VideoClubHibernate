package mx.uach.videoclubhb;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Prestamo implements Serializable {

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
        this.ficha = ficha;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamo)) {
            return false;
        }
        Prestamo other = (Prestamo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Método donde declaramos el formato para impresión.
     *
     * @return String con los datos del prestamo.
     */
    @Override
    public String toString() {
        return String.format("%s %s", this.getEstatus(), this.getFicha());
    }
}
