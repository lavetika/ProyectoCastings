package objetoNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

/**
 *
 * @author Estefanía Aguilar
 */
@Entity
@Table (name = "CastingsPresenciales")
public class CastingPresencial implements Serializable {

    private static final long serialVersionUID = 1L;   
    private Long id;
    private int numPersonas, numFase;
    //fase ¿Necesaria?
    private Fase fase;    
    private List <Fase> fases;

    public CastingPresencial() {
        this.fases = new ArrayList<>();
    }

    public CastingPresencial(int numPersonas, int numFase, Fase fase) {
        this();
        this.numPersonas = numPersonas;
        this.numFase = numFase;
        this.fase = fase;
    }

    public CastingPresencial(Long id, int numPersonas, int numFase, Fase fase) {
        this();
        this.id = id;
        this.numPersonas = numPersonas;
        this.numFase = numFase;
        this.fase = fase;
    }
    
    @Column (name = "IdCastingPresencial")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column (name = "NumPersonas") 
    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    @Column (name = "NumFase")
    public int getNumFase() {
        return numFase;
    }

    public void setNumFase(int numFase) {
        this.numFase = numFase;
    }

    @Column (name = "Fase")
    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    @OneToMany (mappedBy = "castingPresencial", cascade = CascadeType.ALL)
    public List<Fase> getFases() {
        return fases;
    }

    public void setFases(List<Fase> fases) {
        this.fases = fases;
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
        if (!(object instanceof CastingPresencial)) {
            return false;
        }
        CastingPresencial other = (CastingPresencial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetoNegocio.CastingPresencial[ id=" + id + " ]";
    }
    
}
