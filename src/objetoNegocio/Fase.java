package objetoNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    //numPrueba y prueba ¿Necesarias?
    private int numPrueba;
    private Prueba prueba;
    private CastingPresencial castingPresencial;
    
    public Fase() {
        
    }

    public Fase(int numPrueba, Prueba prueba, CastingPresencial castingPresencial) {
        this();        
        this.numPrueba = numPrueba;
        this.prueba = prueba;
        this.castingPresencial = castingPresencial;
    }

    public Fase(Long id, int numPrueba, Prueba prueba, CastingPresencial castingPresencial) {
        this();
        this.id = id;
        this.numPrueba = numPrueba;
        this.prueba = prueba;
        this.castingPresencial = castingPresencial;
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

    @OneToOne(mappedBy = "Fase", cascade = CascadeType.ALL)
    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    @OneToOne()
    @JoinColumn(name = "CastingPresencial")
    public CastingPresencial getCastingPresencial() {
        return castingPresencial;
    }

    public void setCastingPresencial(CastingPresencial castingPresencial) {
        this.castingPresencial = castingPresencial;
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
