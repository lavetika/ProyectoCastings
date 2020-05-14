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
@Table (name = "Perfiles")
public class Perfil implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String curp, nombre;
    private int edad;

    public Perfil() {
    }

    public Perfil(String curp, String nombre, int edad) {
        this.curp = curp;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Perfil(Long id, String curp, String nombre, int edad) {
        this.id = id;
        this.curp = curp;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Column (name = "IdPerfil") 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column (name = "Curp")
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Column (name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column (name = "Edad")
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
        if (!(object instanceof Perfil)) {
            return false;
        }
        Perfil other = (Perfil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetoNegocio.Perfil[ id=" + id + " ]";
    }
    
}
