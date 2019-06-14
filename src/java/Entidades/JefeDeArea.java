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
@Table(name = "jefe_de_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JefeDeArea.findAll", query = "SELECT j FROM JefeDeArea j")
    , @NamedQuery(name = "JefeDeArea.findByIdJefeDeArea", query = "SELECT j FROM JefeDeArea j WHERE j.idJefeDeArea = :idJefeDeArea")
    , @NamedQuery(name = "JefeDeArea.findByUSUARIOScodigoUsuario", query = "SELECT j FROM JefeDeArea j WHERE j.uSUARIOScodigoUsuario = :uSUARIOScodigoUsuario")
    , @NamedQuery(name = "JefeDeArea.findByAREADETRABAJOidAreaDeTrabajo", query = "SELECT j FROM JefeDeArea j WHERE j.aREADETRABAJOidAreaDeTrabajo = :aREADETRABAJOidAreaDeTrabajo")
    , @NamedQuery(name = "JefeDeArea.findByEVALUACIONDECOMPETENCIASidEvaluacionCompetencias", query = "SELECT j FROM JefeDeArea j WHERE j.eVALUACIONDECOMPETENCIASidEvaluacionCompetencias = :eVALUACIONDECOMPETENCIASidEvaluacionCompetencias")})
public class JefeDeArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idJefeDeArea")
    private Integer idJefeDeArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USUARIOS_codigoUsuario")
    private int uSUARIOScodigoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AREA_DE_TRABAJO_idAreaDeTrabajo")
    private int aREADETRABAJOidAreaDeTrabajo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EVALUACION_DE_COMPETENCIAS_idEvaluacionCompetencias")
    private int eVALUACIONDECOMPETENCIASidEvaluacionCompetencias;

    public JefeDeArea() {
    }

    public JefeDeArea(Integer idJefeDeArea) {
        this.idJefeDeArea = idJefeDeArea;
    }

    public JefeDeArea(Integer idJefeDeArea, int uSUARIOScodigoUsuario, int aREADETRABAJOidAreaDeTrabajo, int eVALUACIONDECOMPETENCIASidEvaluacionCompetencias) {
        this.idJefeDeArea = idJefeDeArea;
        this.uSUARIOScodigoUsuario = uSUARIOScodigoUsuario;
        this.aREADETRABAJOidAreaDeTrabajo = aREADETRABAJOidAreaDeTrabajo;
        this.eVALUACIONDECOMPETENCIASidEvaluacionCompetencias = eVALUACIONDECOMPETENCIASidEvaluacionCompetencias;
    }

    public Integer getIdJefeDeArea() {
        return idJefeDeArea;
    }

    public void setIdJefeDeArea(Integer idJefeDeArea) {
        this.idJefeDeArea = idJefeDeArea;
    }

    public int getUSUARIOScodigoUsuario() {
        return uSUARIOScodigoUsuario;
    }

    public void setUSUARIOScodigoUsuario(int uSUARIOScodigoUsuario) {
        this.uSUARIOScodigoUsuario = uSUARIOScodigoUsuario;
    }

    public int getAREADETRABAJOidAreaDeTrabajo() {
        return aREADETRABAJOidAreaDeTrabajo;
    }

    public void setAREADETRABAJOidAreaDeTrabajo(int aREADETRABAJOidAreaDeTrabajo) {
        this.aREADETRABAJOidAreaDeTrabajo = aREADETRABAJOidAreaDeTrabajo;
    }

    public int getEVALUACIONDECOMPETENCIASidEvaluacionCompetencias() {
        return eVALUACIONDECOMPETENCIASidEvaluacionCompetencias;
    }

    public void setEVALUACIONDECOMPETENCIASidEvaluacionCompetencias(int eVALUACIONDECOMPETENCIASidEvaluacionCompetencias) {
        this.eVALUACIONDECOMPETENCIASidEvaluacionCompetencias = eVALUACIONDECOMPETENCIASidEvaluacionCompetencias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJefeDeArea != null ? idJefeDeArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JefeDeArea)) {
            return false;
        }
        JefeDeArea other = (JefeDeArea) object;
        if ((this.idJefeDeArea == null && other.idJefeDeArea != null) || (this.idJefeDeArea != null && !this.idJefeDeArea.equals(other.idJefeDeArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.JefeDeArea[ idJefeDeArea=" + idJefeDeArea + " ]";
    }
    
}
