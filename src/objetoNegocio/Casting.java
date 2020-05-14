package objetoNegocio;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Estefanía Aguilar
 */
@Entity
@Table (name = "Castings")
public class Casting implements Serializable {

    private static final long serialVersionUID = 1L;   
    private Long id;
    private String codigo, nombre, descripcion;
    private Date fecha;
    private List <Perfil> canditatos;
    private Cliente cliente;
    private List <Prueba> pruebas;

    public Casting() {
        this.canditatos = new ArrayList<>();
        this.pruebas = new ArrayList<>();
    }

    public Casting(String codigo, String nombre, String descripcion, Date fecha, 
            List<Perfil> canditatos, Cliente cliente) {
        this();
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.canditatos = canditatos;
        this.cliente = cliente;
    }

    public Casting(Long id, String codigo, String nombre, String descripcion, 
            Date fecha, List<Perfil> canditatos, Cliente cliente) {
        this();
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.canditatos = canditatos;
        this.cliente = cliente;
    }
    
    @Column(name = "IdCasting")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column (name = "Codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Column (name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    @Column (name = "Candidatos")
    public List<Perfil> getCanditatos() {
        return canditatos;
    }

    public void setCanditatos(List<Perfil> canditatos) {
        this.canditatos = canditatos;
    }

    @ManyToOne
    @JoinColumn(name = "Cliente")
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @OneToMany(mappedBy = "casting", cascade = CascadeType.ALL)
    public List<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(List<Prueba> pruebas) {
        this.pruebas = pruebas;
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
        if (!(object instanceof Casting)) {
            return false;
        }
        Casting other = (Casting) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetoNegocio.Casting[ id=" + id + " ]";
    }
    
}
