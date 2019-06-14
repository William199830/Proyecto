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
@Table(name = "actividades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a")
    , @NamedQuery(name = "Actividad.findByIdActividades", query = "SELECT a FROM Actividad a WHERE a.idActividades = :idActividades")
    , @NamedQuery(name = "Actividad.findByNombreActividad", query = "SELECT a FROM Actividad a WHERE a.nombreActividad = :nombreActividad")
    , @NamedQuery(name = "Actividad.findByPrioridad", query = "SELECT a FROM Actividad a WHERE a.prioridad = :prioridad")
    , @NamedQuery(name = "Actividad.findByNovedades", query = "SELECT a FROM Actividad a WHERE a.novedades = :novedades")
    , @NamedQuery(name = "Actividad.findByACTIVIDADESEMPLEADOidActividadesEmpleado", query = "SELECT a FROM Actividad a WHERE a.aCTIVIDADESEMPLEADOidActividadesEmpleado = :aCTIVIDADESEMPLEADOidActividadesEmpleado")
    , @NamedQuery(name = "Actividad.findByEMPLEADOidEmpleado", query = "SELECT a FROM Actividad a WHERE a.eMPLEADOidEmpleado = :eMPLEADOidEmpleado")
    , @NamedQuery(name = "Actividad.findByTIPOACTIVIDADidTipoActividad", query = "SELECT a FROM Actividad a WHERE a.tIPOACTIVIDADidTipoActividad = :tIPOACTIVIDADidTipoActividad")})
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idActividades")
    private Integer idActividades;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreActividad")
    private String nombreActividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "prioridad")
    private String prioridad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "novedades")
    private String novedades;
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
    @Column(name = "TIPO_ACTIVIDAD_idTipoActividad")
    private int tIPOACTIVIDADidTipoActividad;

    public Actividad() {
    }

    public Actividad(Integer idActividades) {
        this.idActividades = idActividades;
    }

    public Actividad(Integer idActividades, String nombreActividad, String prioridad, String novedades, int aCTIVIDADESEMPLEADOidActividadesEmpleado, int eMPLEADOidEmpleado, int tIPOACTIVIDADidTipoActividad) {
        this.idActividades = idActividades;
        this.nombreActividad = nombreActividad;
        this.prioridad = prioridad;
        this.novedades = novedades;
        this.aCTIVIDADESEMPLEADOidActividadesEmpleado = aCTIVIDADESEMPLEADOidActividadesEmpleado;
        this.eMPLEADOidEmpleado = eMPLEADOidEmpleado;
        this.tIPOACTIVIDADidTipoActividad = tIPOACTIVIDADidTipoActividad;
    }

    public Integer getIdActividades() {
        return idActividades;
    }

    public void setIdActividades(Integer idActividades) {
        this.idActividades = idActividades;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getNovedades() {
        return novedades;
    }

    public void setNovedades(String novedades) {
        this.novedades = novedades;
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

    public int getTIPOACTIVIDADidTipoActividad() {
        return tIPOACTIVIDADidTipoActividad;
    }

    public void setTIPOACTIVIDADidTipoActividad(int tIPOACTIVIDADidTipoActividad) {
        this.tIPOACTIVIDADidTipoActividad = tIPOACTIVIDADidTipoActividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividades != null ? idActividades.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.idActividades == null && other.idActividades != null) || (this.idActividades != null && !this.idActividades.equals(other.idActividades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Actividad[ idActividades=" + idActividades + " ]";
    }
    
}
