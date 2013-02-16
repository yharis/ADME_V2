/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.adme.modelo;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yharis
 */
@Entity
@Table(name = "sinonimos_articulo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SinonimoArticulo.findAll", query = "SELECT s FROM SinonimoArticulo s"),
    @NamedQuery(name = "SinonimoArticulo.findByIdSinonimo", query = "SELECT s FROM SinonimoArticulo s WHERE s.idSinonimo = :idSinonimo"),
    @NamedQuery(name = "SinonimoArticulo.findByDescripcion", query = "SELECT s FROM SinonimoArticulo s WHERE s.descripcion = :descripcion")})
public class SinonimoArticulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sinonimo")
    private Integer idSinonimo;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Articulo idArticulo;

    public SinonimoArticulo() {
    }

    public SinonimoArticulo(Integer idSinonimo) {
        this.idSinonimo = idSinonimo;
    }

    public Integer getIdSinonimo() {
        return idSinonimo;
    }

    public void setIdSinonimo(Integer idSinonimo) {
        this.idSinonimo = idSinonimo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Articulo getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Articulo idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSinonimo != null ? idSinonimo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SinonimoArticulo)) {
            return false;
        }
        SinonimoArticulo other = (SinonimoArticulo) object;
        if ((this.idSinonimo == null && other.idSinonimo != null) || (this.idSinonimo != null && !this.idSinonimo.equals(other.idSinonimo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mx.adme.modelo.SinonimoArticulo[ idSinonimo=" + idSinonimo + " ]";
    }
    
}
