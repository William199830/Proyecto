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
@Table(name = "metas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Meta.findAll", query = "SELECT m FROM Meta m")
    , @NamedQuery(name = "Meta.findByIdMetas", query = "SELECT m FROM Meta m WHERE m.idMetas = :idMetas")
    , @NamedQuery(name = "Meta.findByClientePorMes", query = "SELECT m FROM Meta m WHERE m.clientePorMes = :clientePorMes")
    , @NamedQuery(name = "Meta.findByIngresos", query = "SELECT m FROM Meta m WHERE m.ingresos = :ingresos")
    , @NamedQuery(name = "Meta.findByBonificaci\u00f3n", query = "SELECT m FROM Meta m WHERE m.bonificaci\u00f3n = :bonificaci\u00f3n")
    , @NamedQuery(name = "Meta.findByPeriodo", query = "SELECT m FROM Meta m WHERE m.periodo = :periodo")})
public class Meta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMetas")
    private Integer idMetas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "clientePorMes")
    private int clientePorMes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ingresos")
    private int ingresos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "bonificaci\u00f3n")
    private String bonificación;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "periodo")
    private String periodo;

    public Meta() {
    }

    public Meta(Integer idMetas) {
        this.idMetas = idMetas;
    }

    public Meta(Integer idMetas, int clientePorMes, int ingresos, String bonificación, String periodo) {
        this.idMetas = idMetas;
        this.clientePorMes = clientePorMes;
        this.ingresos = ingresos;
        this.bonificación = bonificación;
        this.periodo = periodo;
    }

    public Integer getIdMetas() {
        return idMetas;
    }

    public void setIdMetas(Integer idMetas) {
        this.idMetas = idMetas;
    }

    public int getClientePorMes() {
        return clientePorMes;
    }

    public void setClientePorMes(int clientePorMes) {
        this.clientePorMes = clientePorMes;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public String getBonificación() {
        return bonificación;
    }

    public void setBonificación(String bonificación) {
        this.bonificación = bonificación;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMetas != null ? idMetas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meta)) {
            return false;
        }
        Meta other = (Meta) object;
        if ((this.idMetas == null && other.idMetas != null) || (this.idMetas != null && !this.idMetas.equals(other.idMetas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Meta[ idMetas=" + idMetas + " ]";
    }
    
}
