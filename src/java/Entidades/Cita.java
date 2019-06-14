/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author William Moreno
 */
@Entity
@Table(name = "citas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c")
    , @NamedQuery(name = "Cita.findByIdCitas", query = "SELECT c FROM Cita c WHERE c.idCitas = :idCitas")
    , @NamedQuery(name = "Cita.findByFechaCita", query = "SELECT c FROM Cita c WHERE c.fechaCita = :fechaCita")
    , @NamedQuery(name = "Cita.findByHoraCita", query = "SELECT c FROM Cita c WHERE c.horaCita = :horaCita")
    , @NamedQuery(name = "Cita.findByACTIVIDADESEMPLEADOidActividadesEmpleado", query = "SELECT c FROM Cita c WHERE c.aCTIVIDADESEMPLEADOidActividadesEmpleado = :aCTIVIDADESEMPLEADOidActividadesEmpleado")
    , @NamedQuery(name = "Cita.findByEMPLEADOidEmpleado", query = "SELECT c FROM Cita c WHERE c.eMPLEADOidEmpleado = :eMPLEADOidEmpleado")
    , @NamedQuery(name = "Cita.findByCLIENTEidCliente", query = "SELECT c FROM Cita c WHERE c.cLIENTEidCliente = :cLIENTEidCliente")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCitas")
    private Integer idCitas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaCita")
    @Temporal(TemporalType.DATE)
    private Date fechaCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horaCita")
    @Temporal(TemporalType.DATE)
    private Date horaCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACTIVIDADES_EMPLEADO_idActividadesEmpleado")
    private int aCTIVIDADESEMPLEADOidActividadesEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPLEADO_idEmpleado")
    private int eMPLEADOidEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLIENTE_idCliente")
    private int cLIENTEidCliente;

    public Cita() {
    }

    public Cita(Integer idCitas) {
        this.idCitas = idCitas;
    }

    public Cita(Integer idCitas, Date fechaCita, Date horaCita, int aCTIVIDADESEMPLEADOidActividadesEmpleado, int eMPLEADOidEmpleado, int cLIENTEidCliente) {
        this.idCitas = idCitas;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.aCTIVIDADESEMPLEADOidActividadesEmpleado = aCTIVIDADESEMPLEADOidActividadesEmpleado;
        this.eMPLEADOidEmpleado = eMPLEADOidEmpleado;
        this.cLIENTEidCliente = cLIENTEidCliente;
    }

    public Integer getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(Integer idCitas) {
        this.idCitas = idCitas;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Date getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Date horaCita) {
        this.horaCita = horaCita;
    }

    public int getACTIVIDADESEMPLEADOidActividadesEmpleado() {
        return aCTIVIDADESEMPLEADOidActividadesEmpleado;
    }

    public void setACTIVIDADESEMPLEADOidActividadesEmpleado(int aCTIVIDADESEMPLEADOidActividadesEmpleado) {
        this.aCTIVIDADESEMPLEADOidActividadesEmpleado = aCTIVIDADESEMPLEADOidActividadesEmpleado;
    }

    public int getEMPLEADOidEmpleado() {
        return eMPLEADOidEmpleado;
    }

    public void setEMPLEADOidEmpleado(int eMPLEADOidEmpleado) {
        this.eMPLEADOidEmpleado = eMPLEADOidEmpleado;
    }

    public int getCLIENTEidCliente() {
        return cLIENTEidCliente;
    }

    public void setCLIENTEidCliente(int cLIENTEidCliente) {
        this.cLIENTEidCliente = cLIENTEidCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCitas != null ? idCitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idCitas == null && other.idCitas != null) || (this.idCitas != null && !this.idCitas.equals(other.idCitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Cita[ idCitas=" + idCitas + " ]";
    }
    
}
