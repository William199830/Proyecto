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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente")
    , @NamedQuery(name = "Cliente.findByCodigoCliente", query = "SELECT c FROM Cliente c WHERE c.codigoCliente = :codigoCliente")
    , @NamedQuery(name = "Cliente.findByUSUARIOScodigoUsuario", query = "SELECT c FROM Cliente c WHERE c.uSUARIOScodigoUsuario = :uSUARIOScodigoUsuario")
    , @NamedQuery(name = "Cliente.findByEMPRESAidEmpresa", query = "SELECT c FROM Cliente c WHERE c.eMPRESAidEmpresa = :eMPRESAidEmpresa")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCliente")
    private Integer idCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigoCliente")
    private int codigoCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USUARIOS_codigoUsuario")
    private int uSUARIOScodigoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPRESA_idEmpresa")
    private int eMPRESAidEmpresa;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, int codigoCliente, int uSUARIOScodigoUsuario, int eMPRESAidEmpresa) {
        this.idCliente = idCliente;
        this.codigoCliente = codigoCliente;
        this.uSUARIOScodigoUsuario = uSUARIOScodigoUsuario;
        this.eMPRESAidEmpresa = eMPRESAidEmpresa;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getUSUARIOScodigoUsuario() {
        return uSUARIOScodigoUsuario;
    }

    public void setUSUARIOScodigoUsuario(int uSUARIOScodigoUsuario) {
        this.uSUARIOScodigoUsuario = uSUARIOScodigoUsuario;
    }

    public int getEMPRESAidEmpresa() {
        return eMPRESAidEmpresa;
    }

    public void setEMPRESAidEmpresa(int eMPRESAidEmpresa) {
        this.eMPRESAidEmpresa = eMPRESAidEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
