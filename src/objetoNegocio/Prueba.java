package objetoNegocio;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Estefanía Aguilar
 */
@Entity
@Table (name = "Pruebas")
public class Prueba implements Serializable {

    private static final long serialVersionUID = 1L;  
    private Long id;
    private int numSala;
    private String descripcion;
    private Date fecha;

    public Prueba() {
    }

    public Prueba(int numSala, String descripcion, Date fecha) {
        this.numSala = numSala;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Prueba(Long id, int numSala, String descripcion, Date fecha) {
        this.id = id;
        this.numSala = numSala;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }       
    
    @Column (name = "IdPrueba")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column (name = "NumSala")
    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    @Column (name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Column (name = "Fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        if (!(object instanceof Prueba)) {
            return false;
        }
        Prueba other = (Prueba) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetoNegocio.Prueba[ id=" + id + " ]";
    }
    
}
