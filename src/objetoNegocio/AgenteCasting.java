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
@Table (name = "AgentesCasting") 
public class AgenteCasting implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private int numEmpleados;
    private String rfc, curp, nombre, direccion;

    public AgenteCasting() {
    }

    public AgenteCasting(int numEmpleados, String rfc, String curp, String nombre, String direccion) {
        this.numEmpleados = numEmpleados;
        this.rfc = rfc;
        this.curp = curp;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public AgenteCasting(Long id, int numEmpleados, String rfc, String curp, String nombre, String direccion) {
        this.id = id;
        this.numEmpleados = numEmpleados;
        this.rfc = rfc;
        this.curp = curp;
        this.nombre = nombre;
        this.direccion = direccion;
    }    
    
    @Column (name = "IdAgenteCasting")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column (name = "NumEmpleados")
    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgenteCasting)) {
            return false;
        }
        AgenteCasting other = (AgenteCasting) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
