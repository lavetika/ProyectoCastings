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
@Table (name = "Representantes")
public class Representante implements Serializable {

    private static final long serialVersionUID = 1L;   
    private Long id;
    private String rfc, curp, nombre, direccion, telefono;

    public Representante() {
    }

    public Representante(String rfc, String curp, String nombre, String direccion, String telefono) {
        this.rfc = rfc;
        this.curp = curp;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Representante(Long id, String rfc, String curp, String nombre, String direccion, String telefono) {
        this.id = id;
        this.rfc = rfc;
        this.curp = curp;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
   
    @Column (name = "IdRepresentante")
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

    @Column (name = "Direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column (name = "Telefono")
    public String getTelefono() {
        return telefono;
    }

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
        if (!(object instanceof Representante)) {
            return false;
        }
        Representante other = (Representante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetoNegocio.Representante[ id=" + id + " ]";
    }
    
}
