package mx.uach.videoclubhb;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Modelo para mappear los socios del VideoClub.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 06/10/2016
 */
@Entity
public class Socio implements Serializable{

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
    private String direccion;
    private String telefono;

    /**
     * Constructor vacio.
     */
    public Socio() {
    }

    /**
     * Constructor que trae de parametros el nombre, direccion, telefono,
     * directores y actores favoritos del socio.
     *
     * @param nombre que es el nombre del socio.
     * @param direccion que es la direccion del socio.
     * @param telefono que es el telefono del socio.
     */
    public Socio(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Método que obtiene el nombre del socio.
     *
     * @return nombre que es el nombre del socio.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna un nombre a un socio.
     *
     * @param nombre que es el nombre del socio.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene la dirección del socio.
     *
     * @return direccion que es la dirección del socio.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que asigna una dirección a un socio.
     *
     * @param direccion que es la dirección del socio.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que obtiene el telefono del socio.
     *
     * @return telefono que es el telefono del socio.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método que asigna un telefono a un socio.
     *
     * @param telefono que es el telefono del socio.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        Socio other = (Socio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    /**
     * Método donde declaramos el formato para impresión.
     * 
     * @return String con los datos del socio.
     */
    @Override
    public String toString() {
        return String.format("%s %s", this.getNombre(), this.getDireccion(), this.getTelefono());
    }
}
