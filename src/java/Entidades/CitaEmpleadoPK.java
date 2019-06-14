/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author William Moreno
 */
@Embeddable
public class CitaEmpleadoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IdActivadesEmpleado")
    private int idActivadesEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCitas")
    private int idCitas;

    public CitaEmpleadoPK() {
    }

    public CitaEmpleadoPK(int idActivadesEmpleado, int idCitas) {
        this.idActivadesEmpleado = idActivadesEmpleado;
        this.idCitas = idCitas;
    }

    public int getIdActivadesEmpleado() {
        return idActivadesEmpleado;
    }

    public void setIdActivadesEmpleado(int idActivadesEmpleado) {
        this.idActivadesEmpleado = idActivadesEmpleado;
    }

    public int getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(int idCitas) {
        this.idCitas = idCitas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idActivadesEmpleado;
        hash += (int) idCitas;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CitaEmpleadoPK)) {
            return false;
        }
        CitaEmpleadoPK other = (CitaEmpleadoPK) object;
        if (this.idActivadesEmpleado != other.idActivadesEmpleado) {
            return false;
        }
        if (this.idCitas != other.idCitas) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CitaEmpleadoPK[ idActivadesEmpleado=" + idActivadesEmpleado + ", idCitas=" + idCitas + " ]";
    }
    
}
