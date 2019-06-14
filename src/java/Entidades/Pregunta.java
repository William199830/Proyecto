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
@Table(name = "preguntas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pregunta.findAll", query = "SELECT p FROM Pregunta p")
    , @NamedQuery(name = "Pregunta.findByIdPreguntas", query = "SELECT p FROM Pregunta p WHERE p.idPreguntas = :idPreguntas")
    , @NamedQuery(name = "Pregunta.findByTipoDePregunta", query = "SELECT p FROM Pregunta p WHERE p.tipoDePregunta = :tipoDePregunta")
    , @NamedQuery(name = "Pregunta.findByPuntaje", query = "SELECT p FROM Pregunta p WHERE p.puntaje = :puntaje")
    , @NamedQuery(name = "Pregunta.findByFORMULARIOidFormulario", query = "SELECT p FROM Pregunta p WHERE p.fORMULARIOidFormulario = :fORMULARIOidFormulario")
    , @NamedQuery(name = "Pregunta.findByDescripcion", query = "SELECT p FROM Pregunta p WHERE p.descripcion = :descripcion")})
public class Pregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPreguntas")
    private Integer idPreguntas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tipoDePregunta")
    private String tipoDePregunta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntaje")
    private int puntaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FORMULARIO_idFormulario")
    private int fORMULARIOidFormulario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "descripcion")
    private String descripcion;

    public Pregunta() {
    }

    public Pregunta(Integer idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    public Pregunta(Integer idPreguntas, String tipoDePregunta, int puntaje, int fORMULARIOidFormulario, String descripcion) {
        this.idPreguntas = idPreguntas;
        this.tipoDePregunta = tipoDePregunta;
        this.puntaje = puntaje;
        this.fORMULARIOidFormulario = fORMULARIOidFormulario;
        this.descripcion = descripcion;
    }

    public Integer getIdPreguntas() {
        return idPreguntas;
    }

    public void setIdPreguntas(Integer idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    public String getTipoDePregunta() {
        return tipoDePregunta;
    }

    public void setTipoDePregunta(String tipoDePregunta) {
        this.tipoDePregunta = tipoDePregunta;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getFORMULARIOidFormulario() {
        return fORMULARIOidFormulario;
    }

    public void setFORMULARIOidFormulario(int fORMULARIOidFormulario) {
        this.fORMULARIOidFormulario = fORMULARIOidFormulario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPreguntas != null ? idPreguntas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pregunta)) {
            return false;
        }
        Pregunta other = (Pregunta) object;
        if ((this.idPreguntas == null && other.idPreguntas != null) || (this.idPreguntas != null && !this.idPreguntas.equals(other.idPreguntas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Pregunta[ idPreguntas=" + idPreguntas + " ]";
    }
    
}
