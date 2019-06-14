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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author William Moreno
 */
@Entity
@Table(name = "administrador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a")
    , @NamedQuery(name = "Administrador.findByIdAministrador", query = "SELECT a FROM Administrador a WHERE a.idAministrador = :idAministrador")})
public class Administrador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAministrador")
    private Integer idAministrador;
    @JoinColumn(name = "USUARIOS_codigoUsuario", referencedColumnName = "codigoUsuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario uSUARIOScodigoUsuario;

    public Administrador() {
    }

    public Administrador(Integer idAministrador) {
        this.idAministrador = idAministrador;
    }

    public Integer getIdAministrador() {
        return idAministrador;
    }

    public void setIdAministrador(Integer idAministrador) {
        this.idAministrador = idAministrador;
    }

    public Usuario getUSUARIOScodigoUsuario() {
        return uSUARIOScodigoUsuario;
    }

    public void setUSUARIOScodigoUsuario(Usuario uSUARIOScodigoUsuario) {
        this.uSUARIOScodigoUsuario = uSUARIOScodigoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAministrador != null ? idAministrador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.idAministrador == null && other.idAministrador != null) || (this.idAministrador != null && !this.idAministrador.equals(other.idAministrador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Administrador[ idAministrador=" + idAministrador + " ]";
    }
    
}
