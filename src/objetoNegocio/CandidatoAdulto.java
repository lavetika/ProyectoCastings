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
@Table (name = "CandidatosAdultos")
public class CandidatoAdulto extends Perfil implements Serializable {

    private static final long serialVersionUID = 1L;   
    private Long id;
    private String rfc;

    public CandidatoAdulto() {
    }

    public CandidatoAdulto(String rfc) {
        this.rfc = rfc;
    }

    public CandidatoAdulto(Long id, String rfc) {
        this.id = id;
        this.rfc = rfc;
    }    
    
    @Column (name = "IdCandidatoAdulto")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column (name = "RFC")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
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
        if (!(object instanceof CandidatoAdulto)) {
            return false;
        }
        CandidatoAdulto other = (CandidatoAdulto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetoNegocio.CandidatoAdulto[ id=" + id + " ]";
    }
    
}
