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
@Table(name = "telefono")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefono.findAll", query = "SELECT t FROM Telefono t")
    , @NamedQuery(name = "Telefono.findByTelefonoUsuario", query = "SELECT t FROM Telefono t WHERE t.telefonoUsuario = :telefonoUsuario")
    , @NamedQuery(name = "Telefono.findByUSUARIOScodigoUsuario", query = "SELECT t FROM Telefono t WHERE t.uSUARIOScodigoUsuario = :uSUARIOScodigoUsuario")})
public class Telefono implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "telefonoUsuario")
    private String telefonoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USUARIOS_codigoUsuario")
    private int uSUARIOScodigoUsuario;

    public Telefono() {
    }

    public Telefono(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public Telefono(String telefonoUsuario, int uSUARIOScodigoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
        this.uSUARIOScodigoUsuario = uSUARIOScodigoUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public int getUSUARIOScodigoUsuario() {
        return uSUARIOScodigoUsuario;
    }

    public void setUSUARIOScodigoUsuario(int uSUARIOScodigoUsuario) {
        this.uSUARIOScodigoUsuario = uSUARIOScodigoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telefonoUsuario != null ? telefonoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefono)) {
            return false;
        }
        Telefono other = (Telefono) object;
        if ((this.telefonoUsuario == null && other.telefonoUsuario != null) || (this.telefonoUsuario != null && !this.telefonoUsuario.equals(other.telefonoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Telefono[ telefonoUsuario=" + telefonoUsuario + " ]";
    }
    
}
