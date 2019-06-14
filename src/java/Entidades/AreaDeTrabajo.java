/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author William Moreno
 */
@Entity
@Table(name = "area_de_trabajo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AreaDeTrabajo.findAll", query = "SELECT a FROM AreaDeTrabajo a")
    , @NamedQuery(name = "AreaDeTrabajo.findByIdAreaDeTrabajo", query = "SELECT a FROM AreaDeTrabajo a WHERE a.idAreaDeTrabajo = :idAreaDeTrabajo")
    , @NamedQuery(name = "AreaDeTrabajo.findByAreaTrabajo", query = "SELECT a FROM AreaDeTrabajo a WHERE a.areaTrabajo = :areaTrabajo")
    , @NamedQuery(name = "AreaDeTrabajo.findByEMPLEADOidEmpleado", query = "SELECT a FROM AreaDeTrabajo a WHERE a.eMPLEADOidEmpleado = :eMPLEADOidEmpleado")})
public class AreaDeTrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAreaDeTrabajo")
    private Integer idAreaDeTrabajo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "areaTrabajo")
    private String areaTrabajo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPLEADO_idEmpleado")
    private int eMPLEADOidEmpleado;

    public AreaDeTrabajo() {
    }

    public AreaDeTrabajo(Integer idAreaDeTrabajo) {
        this.idAreaDeTrabajo = idAreaDeTrabajo;
    }

    public AreaDeTrabajo(Integer idAreaDeTrabajo, String areaTrabajo, int eMPLEADOidEmpleado) {
        this.idAreaDeTrabajo = idAreaDeTrabajo;
        this.areaTrabajo = areaTrabajo;
        this.eMPLEADOidEmpleado = eMPLEADOidEmpleado;
    }

    public Integer getIdAreaDeTrabajo() {
        return idAreaDeTrabajo;
    }

    public void setIdAreaDeTrabajo(Integer idAreaDeTrabajo) {
        this.idAreaDeTrabajo = idAreaDeTrabajo;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public int getEMPLEADOidEmpleado() {
        return eMPLEADOidEmpleado;
    }

    public void setEMPLEADOidEmpleado(int eMPLEADOidEmpleado) {
        this.eMPLEADOidEmpleado = eMPLEADOidEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAreaDeTrabajo != null ? idAreaDeTrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AreaDeTrabajo)) {
            return false;
        }
        AreaDeTrabajo other = (AreaDeTrabajo) object;
        if ((this.idAreaDeTrabajo == null && other.idAreaDeTrabajo != null) || (this.idAreaDeTrabajo != null && !this.idAreaDeTrabajo.equals(other.idAreaDeTrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.AreaDeTrabajo[ idAreaDeTrabajo=" + idAreaDeTrabajo + " ]";
    }
    
}
