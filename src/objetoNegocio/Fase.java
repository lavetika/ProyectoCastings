package objetoNegocio;

import java.io.Serializable;
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
@Table (name = "Fases")
public class Fase implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private int numPrueba;
    private Prueba prueba;

    public Fase() {
    }

    public Fase(int numPrueba, Prueba prueba) {
        this.numPrueba = numPrueba;
        this.prueba = prueba;
    }

    public Fase(Long id, int numPrueba, Prueba prueba) {
        this.id = id;
        this.numPrueba = numPrueba;
        this.prueba = prueba;
    }      
    
    @Column (name="IdFase")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column (name = "NumPrueba")
    public int getNumPrueba() {
        return numPrueba;
    }

    public void setNumPrueba(int numPrueba) {
        this.numPrueba = numPrueba;
    }

    @Column (name = "Prueba")
    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
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
        if (!(object instanceof Fase)) {
            return false;
        }
        Fase other = (Fase) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetoNegocio.Fase[ id=" + id + " ]";
    }
    
}
