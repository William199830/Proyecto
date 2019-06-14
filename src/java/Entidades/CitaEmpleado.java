/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author William Moreno
 */
@Entity
@Table(name = "citas_empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CitaEmpleado.findAll", query = "SELECT c FROM CitaEmpleado c")
    , @NamedQuery(name = "CitaEmpleado.findByIdActivadesEmpleado", query = "SELECT c FROM CitaEmpleado c WHERE c.citaEmpleadoPK.idActivadesEmpleado = :idActivadesEmpleado")
    , @NamedQuery(name = "CitaEmpleado.findByIdCitas", query = "SELECT c FROM CitaEmpleado c WHERE c.citaEmpleadoPK.idCitas = :idCitas")})
public class CitaEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CitaEmpleadoPK citaEmpleadoPK;

    public CitaEmpleado() {
    }

    public CitaEmpleado(CitaEmpleadoPK citaEmpleadoPK) {
        this.citaEmpleadoPK = citaEmpleadoPK;
    }

    public CitaEmpleado(int idActivadesEmpleado, int idCitas) {
        this.citaEmpleadoPK = new CitaEmpleadoPK(idActivadesEmpleado, idCitas);
    }

    public CitaEmpleadoPK getCitaEmpleadoPK() {
        return citaEmpleadoPK;
    }

    public void setCitaEmpleadoPK(CitaEmpleadoPK citaEmpleadoPK) {
        this.citaEmpleadoPK = citaEmpleadoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (citaEmpleadoPK != null ? citaEmpleadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CitaEmpleado)) {
            return false;
        }
        CitaEmpleado other = (CitaEmpleado) object;
        if ((this.citaEmpleadoPK == null && other.citaEmpleadoPK != null) || (this.citaEmpleadoPK != null && !this.citaEmpleadoPK.equals(other.citaEmpleadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CitaEmpleado[ citaEmpleadoPK=" + citaEmpleadoPK + " ]";
    }
    
}
