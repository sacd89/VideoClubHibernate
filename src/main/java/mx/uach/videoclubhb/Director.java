package mx.uach.videoclubhb;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Modelo para mappear los directores de las peliculas del VideoClub
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
@Entity
public class Director implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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

    /**
     * Constructor vacio
     */
    public Director() {
    }

    /**
     * Constructor que trae de parametro el nombre del director.
     *
     * @param nombre que es el nombre del director.
     */
    public Director(String nombre) {
        this.nombre = nombre;
    }

   
    /**
     * Método que te obtiene el nombre del director.
     *
     * @return nombre del director.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar un nombre al director.
     *
     * @param nombre que es el nombre del director.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        Director other = (Director) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
        /**
     * Método donde declaramos el formato para impresión.
     * 
     * @return String con los datos del director.
     */
    @Override
    public String toString() {
        return String.format("%s", this.getNombre());
    }
}
