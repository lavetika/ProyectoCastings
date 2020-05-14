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
@Table (name = "CadidatosNiños")
public class CandidatoNiño extends Perfil implements Serializable {

    private static final long serialVersionUID = 1L;   
    private Long id;
    private String nombreTutor;

    public CandidatoNiño() {
    }

    public CandidatoNiño(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public CandidatoNiño(Long id, String nombreTutor) {
        this.id = id;
        this.nombreTutor = nombreTutor;
    }
       
    @Column (name = "IdCandidatoNiño")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column (name = "NombreTutor")
    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
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
        if (!(object instanceof CandidatoNiño)) {
            return false;
        }
        CandidatoNiño other = (CandidatoNiño) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetoNegocio.CandidatoNi\u00f1o[ id=" + id + " ]";
    }
    
}
