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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author William Moreno
 */
@Entity
@Table(name = "formulario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formulario.findAll", query = "SELECT f FROM Formulario f")
    , @NamedQuery(name = "Formulario.findByIdFormulario", query = "SELECT f FROM Formulario f WHERE f.idFormulario = :idFormulario")
    , @NamedQuery(name = "Formulario.findByEVALUACIONDESATISFACCIONidEvaluacionSatisfaccion", query = "SELECT f FROM Formulario f WHERE f.eVALUACIONDESATISFACCIONidEvaluacionSatisfaccion = :eVALUACIONDESATISFACCIONidEvaluacionSatisfaccion")})
public class Formulario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFormulario")
    private Integer idFormulario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EVALUACION_DE_SATISFACCION_idEvaluacionSatisfaccion")
    private int eVALUACIONDESATISFACCIONidEvaluacionSatisfaccion;

    public Formulario() {
    }

    public Formulario(Integer idFormulario) {
        this.idFormulario = idFormulario;
    }

    public Formulario(Integer idFormulario, int eVALUACIONDESATISFACCIONidEvaluacionSatisfaccion) {
        this.idFormulario = idFormulario;
        this.eVALUACIONDESATISFACCIONidEvaluacionSatisfaccion = eVALUACIONDESATISFACCIONidEvaluacionSatisfaccion;
    }

    public Integer getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(Integer idFormulario) {
        this.idFormulario = idFormulario;
    }

    public int getEVALUACIONDESATISFACCIONidEvaluacionSatisfaccion() {
        return eVALUACIONDESATISFACCIONidEvaluacionSatisfaccion;
    }

    public void setEVALUACIONDESATISFACCIONidEvaluacionSatisfaccion(int eVALUACIONDESATISFACCIONidEvaluacionSatisfaccion) {
        this.eVALUACIONDESATISFACCIONidEvaluacionSatisfaccion = eVALUACIONDESATISFACCIONidEvaluacionSatisfaccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormulario != null ? idFormulario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formulario)) {
            return false;
        }
        Formulario other = (Formulario) object;
        if ((this.idFormulario == null && other.idFormulario != null) || (this.idFormulario != null && !this.idFormulario.equals(other.idFormulario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Formulario[ idFormulario=" + idFormulario + " ]";
    }
    
}
