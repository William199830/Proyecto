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
@Table(name = "correo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Correo.findAll", query = "SELECT c FROM Correo c")
    , @NamedQuery(name = "Correo.findByCorreoUsuario", query = "SELECT c FROM Correo c WHERE c.correoUsuario = :correoUsuario")
    , @NamedQuery(name = "Correo.findByUSUARIOScodigoUsuario", query = "SELECT c FROM Correo c WHERE c.uSUARIOScodigoUsuario = :uSUARIOScodigoUsuario")})
public class Correo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "correoUsuario")
    private String correoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USUARIOS_codigoUsuario")
    private int uSUARIOScodigoUsuario;

    public Correo() {
    }

    public Correo(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public Correo(String correoUsuario, int uSUARIOScodigoUsuario) {
        this.correoUsuario = correoUsuario;
        this.uSUARIOScodigoUsuario = uSUARIOScodigoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
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
        hash += (correoUsuario != null ? correoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Correo)) {
            return false;
        }
        Correo other = (Correo) object;
        if ((this.correoUsuario == null && other.correoUsuario != null) || (this.correoUsuario != null && !this.correoUsuario.equals(other.correoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Correo[ correoUsuario=" + correoUsuario + " ]";
    }
    
}
