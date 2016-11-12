package mx.uach.videoclubhb;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Modelo para mappear las listas de las peliculas del VideoClub
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 06/10/2016
 */
@Entity
public class Lista{

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Date fecha;
    private Date hora;
    private Boolean estatus;
    private Socio socio;
    private Pelicula pelicula;

    /**
     * Constructor vacio.
     */
    public Lista() {
    }

    /**
     * Constructor que trae de paramentros la fecha, hora, estatus, socio y
     * pelicula de la lista.
     *
     * @param fecha que es la fecha de la lista.
     * @param hora que es la hora de la lista.
     * @param estatus que es el estatus de la lista.
     * @param socio que es el socio de la lista.
     * @param pelicula que es la pelicula de la lista.
     */
    public Lista(Date fecha, Date hora, Boolean estatus, Socio socio, Pelicula pelicula) {
        this.fecha = fecha;
        this.hora = hora;
        this.estatus = estatus;
        this.socio = socio;
        this.pelicula = pelicula;
    }

    /**
     * Método que obtiene la fecha de la lista.
     *
     * @return fecha que es la fecha de la lista.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método que asigna una fecha a un lista.
     *
     * @param fecha que es la fecha de la lista.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Método que obtiene la hora de la lista.
     *
     * @return hora que es la hora de la lista.
     */
    public Date getHora() {
        return hora;
    }

    /**
     * Método que asigna una hora a una lista.
     *
     * @param hora que es la hora de la lista.
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * Método que obtiene el estatus de la lista.
     *
     * @return estatus que es el estatus de la lista.
     */
    public Boolean getEstatus() {
        return estatus;
    }

    /**
     * Método que asigna un estatus a una lista.
     *
     * @param estatus que es el estatus de la lista.
     */
    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    /**
     * Método que obtiene el socio de la lista.
     *
     * @return socio que es el socio de la lista.
     */
    public Socio getSocio() {
        return socio;
    }

    /**
     * Método que asigna un socio a una lista.
     *
     * @param socio que es el socio de la lista.
     */
    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    /**
     * Método que obtiene la pelicula de la lista.
     *
     * @return pelicula que es la pelicula de la lista.
     */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * Método que asigna una pelicula a la lista.
     *
     * @param pelicula que es la pelicula de la lista.
     */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}
