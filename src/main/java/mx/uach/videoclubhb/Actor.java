package mx.uach.videoclubhb;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Modelo para mappear los actores de las peliculas del VideoClub
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 06/10/2016
 */
@Entity
public class Actor implements Serializable {

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

    private String nombre;
    private String apellido;

    /**
     * Constructor vacio.
     */
    public Actor() {
    }

    /**
     * Constructor que trae de parametros el nombre y apellido del actor.
     *
     * @param nombre que es el nombre del actor.
     * @param apellido que es el apellido del actor.
     */
    public Actor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Método que te obtiene el nombre del actor.
     *
     * @return nombre que es el nombre del actor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que te asigna un nombre al actor.
     *
     * @param nombre que es el nombre del actor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que te obtiene el apellido del actor.
     *
     * @return apellido que es el apellido del actor.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método que asigna un apellido al actor.
     *
     * @param apellido que es el apellido del actor.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        Actor other = (Actor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Método donde declaramos el formato para impresión.
     *
     * @return String con los datos del actor.
     */
    @Override
    public String toString() {
        return String.format("%s %s", this.getNombre(), this.getApellido());
    }

}
