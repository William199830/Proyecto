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
@Table(name = "evaluacion_de_competencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EvaluacionDeCompetencia.findAll", query = "SELECT e FROM EvaluacionDeCompetencia e")
    , @NamedQuery(name = "EvaluacionDeCompetencia.findByIdEvaluacionDeCompetencias", query = "SELECT e FROM EvaluacionDeCompetencia e WHERE e.idEvaluacionDeCompetencias = :idEvaluacionDeCompetencias")
    , @NamedQuery(name = "EvaluacionDeCompetencia.findByPuntajeEvaluacionDeCompetencias", query = "SELECT e FROM EvaluacionDeCompetencia e WHERE e.puntajeEvaluacionDeCompetencias = :puntajeEvaluacionDeCompetencias")
    , @NamedQuery(name = "EvaluacionDeCompetencia.findByObservaciones", query = "SELECT e FROM EvaluacionDeCompetencia e WHERE e.observaciones = :observaciones")
    , @NamedQuery(name = "EvaluacionDeCompetencia.findByCriterios", query = "SELECT e FROM EvaluacionDeCompetencia e WHERE e.criterios = :criterios")
    , @NamedQuery(name = "EvaluacionDeCompetencia.findByEMPLEADOidEmpleado", query = "SELECT e FROM EvaluacionDeCompetencia e WHERE e.eMPLEADOidEmpleado = :eMPLEADOidEmpleado")})
public class EvaluacionDeCompetencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEvaluacionDeCompetencias")
    private Integer idEvaluacionDeCompetencias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntajeEvaluacionDeCompetencias")
    private int puntajeEvaluacionDeCompetencias;
    @Size(max = 100)
    @Column(name = "observaciones")
    private String observaciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "criterios")
    private String criterios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPLEADO_idEmpleado")
    private int eMPLEADOidEmpleado;

    public EvaluacionDeCompetencia() {
    }

    public EvaluacionDeCompetencia(Integer idEvaluacionDeCompetencias) {
        this.idEvaluacionDeCompetencias = idEvaluacionDeCompetencias;
    }

    public EvaluacionDeCompetencia(Integer idEvaluacionDeCompetencias, int puntajeEvaluacionDeCompetencias, String criterios, int eMPLEADOidEmpleado) {
        this.idEvaluacionDeCompetencias = idEvaluacionDeCompetencias;
        this.puntajeEvaluacionDeCompetencias = puntajeEvaluacionDeCompetencias;
        this.criterios = criterios;
        this.eMPLEADOidEmpleado = eMPLEADOidEmpleado;
    }

    public Integer getIdEvaluacionDeCompetencias() {
        return idEvaluacionDeCompetencias;
    }

    public void setIdEvaluacionDeCompetencias(Integer idEvaluacionDeCompetencias) {
        this.idEvaluacionDeCompetencias = idEvaluacionDeCompetencias;
    }

    public int getPuntajeEvaluacionDeCompetencias() {
        return puntajeEvaluacionDeCompetencias;
    }

    public void setPuntajeEvaluacionDeCompetencias(int puntajeEvaluacionDeCompetencias) {
        this.puntajeEvaluacionDeCompetencias = puntajeEvaluacionDeCompetencias;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCriterios() {
        return criterios;
    }

    public void setCriterios(String criterios) {
        this.criterios = criterios;
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
        hash += (idEvaluacionDeCompetencias != null ? idEvaluacionDeCompetencias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaluacionDeCompetencia)) {
            return false;
        }
        EvaluacionDeCompetencia other = (EvaluacionDeCompetencia) object;
        if ((this.idEvaluacionDeCompetencias == null && other.idEvaluacionDeCompetencias != null) || (this.idEvaluacionDeCompetencias != null && !this.idEvaluacionDeCompetencias.equals(other.idEvaluacionDeCompetencias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.EvaluacionDeCompetencia[ idEvaluacionDeCompetencias=" + idEvaluacionDeCompetencias + " ]";
    }
    
}
