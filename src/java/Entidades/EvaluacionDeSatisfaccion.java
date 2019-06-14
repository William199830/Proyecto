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
@Table(name = "evaluacion_de_satisfaccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EvaluacionDeSatisfaccion.findAll", query = "SELECT e FROM EvaluacionDeSatisfaccion e")
    , @NamedQuery(name = "EvaluacionDeSatisfaccion.findByIdEvaluacionSatisfaccion", query = "SELECT e FROM EvaluacionDeSatisfaccion e WHERE e.idEvaluacionSatisfaccion = :idEvaluacionSatisfaccion")
    , @NamedQuery(name = "EvaluacionDeSatisfaccion.findByPuntajeEvaluacionSatisfaccion", query = "SELECT e FROM EvaluacionDeSatisfaccion e WHERE e.puntajeEvaluacionSatisfaccion = :puntajeEvaluacionSatisfaccion")
    , @NamedQuery(name = "EvaluacionDeSatisfaccion.findByParametrosEvaluacionSatisfaccion", query = "SELECT e FROM EvaluacionDeSatisfaccion e WHERE e.parametrosEvaluacionSatisfaccion = :parametrosEvaluacionSatisfaccion")
    , @NamedQuery(name = "EvaluacionDeSatisfaccion.findByCriteriosSatisfaccion", query = "SELECT e FROM EvaluacionDeSatisfaccion e WHERE e.criteriosSatisfaccion = :criteriosSatisfaccion")
    , @NamedQuery(name = "EvaluacionDeSatisfaccion.findByComentarios", query = "SELECT e FROM EvaluacionDeSatisfaccion e WHERE e.comentarios = :comentarios")
    , @NamedQuery(name = "EvaluacionDeSatisfaccion.findByEMPLEADOidEmpleado", query = "SELECT e FROM EvaluacionDeSatisfaccion e WHERE e.eMPLEADOidEmpleado = :eMPLEADOidEmpleado")
    , @NamedQuery(name = "EvaluacionDeSatisfaccion.findByCLIENTEidCliente", query = "SELECT e FROM EvaluacionDeSatisfaccion e WHERE e.cLIENTEidCliente = :cLIENTEidCliente")})
public class EvaluacionDeSatisfaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEvaluacionSatisfaccion")
    private Integer idEvaluacionSatisfaccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntajeEvaluacionSatisfaccion")
    private int puntajeEvaluacionSatisfaccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "parametrosEvaluacionSatisfaccion")
    private String parametrosEvaluacionSatisfaccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "criteriosSatisfaccion")
    private String criteriosSatisfaccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "comentarios")
    private String comentarios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPLEADO_idEmpleado")
    private int eMPLEADOidEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLIENTE_idCliente")
    private int cLIENTEidCliente;

    public EvaluacionDeSatisfaccion() {
    }

    public EvaluacionDeSatisfaccion(Integer idEvaluacionSatisfaccion) {
        this.idEvaluacionSatisfaccion = idEvaluacionSatisfaccion;
    }

    public EvaluacionDeSatisfaccion(Integer idEvaluacionSatisfaccion, int puntajeEvaluacionSatisfaccion, String parametrosEvaluacionSatisfaccion, String criteriosSatisfaccion, String comentarios, int eMPLEADOidEmpleado, int cLIENTEidCliente) {
        this.idEvaluacionSatisfaccion = idEvaluacionSatisfaccion;
        this.puntajeEvaluacionSatisfaccion = puntajeEvaluacionSatisfaccion;
        this.parametrosEvaluacionSatisfaccion = parametrosEvaluacionSatisfaccion;
        this.criteriosSatisfaccion = criteriosSatisfaccion;
        this.comentarios = comentarios;
        this.eMPLEADOidEmpleado = eMPLEADOidEmpleado;
        this.cLIENTEidCliente = cLIENTEidCliente;
    }

    public Integer getIdEvaluacionSatisfaccion() {
        return idEvaluacionSatisfaccion;
    }

    public void setIdEvaluacionSatisfaccion(Integer idEvaluacionSatisfaccion) {
        this.idEvaluacionSatisfaccion = idEvaluacionSatisfaccion;
    }

    public int getPuntajeEvaluacionSatisfaccion() {
        return puntajeEvaluacionSatisfaccion;
    }

    public void setPuntajeEvaluacionSatisfaccion(int puntajeEvaluacionSatisfaccion) {
        this.puntajeEvaluacionSatisfaccion = puntajeEvaluacionSatisfaccion;
    }

    public String getParametrosEvaluacionSatisfaccion() {
        return parametrosEvaluacionSatisfaccion;
    }

    public void setParametrosEvaluacionSatisfaccion(String parametrosEvaluacionSatisfaccion) {
        this.parametrosEvaluacionSatisfaccion = parametrosEvaluacionSatisfaccion;
    }

    public String getCriteriosSatisfaccion() {
        return criteriosSatisfaccion;
    }

    public void setCriteriosSatisfaccion(String criteriosSatisfaccion) {
        this.criteriosSatisfaccion = criteriosSatisfaccion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
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
        hash += (idEvaluacionSatisfaccion != null ? idEvaluacionSatisfaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaluacionDeSatisfaccion)) {
            return false;
        }
        EvaluacionDeSatisfaccion other = (EvaluacionDeSatisfaccion) object;
        if ((this.idEvaluacionSatisfaccion == null && other.idEvaluacionSatisfaccion != null) || (this.idEvaluacionSatisfaccion != null && !this.idEvaluacionSatisfaccion.equals(other.idEvaluacionSatisfaccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.EvaluacionDeSatisfaccion[ idEvaluacionSatisfaccion=" + idEvaluacionSatisfaccion + " ]";
    }
    
}
