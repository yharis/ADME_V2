/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.adme.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yharis
 */
@Entity
@Table(name = "uso_articulo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsoArticulo.findAll", query = "SELECT u FROM UsoArticulo u"),
    @NamedQuery(name = "UsoArticulo.findByIdUsoArticulo", query = "SELECT u FROM UsoArticulo u WHERE u.idUsoArticulo = :idUsoArticulo"),
    @NamedQuery(name = "UsoArticulo.findByDescripcion", query = "SELECT u FROM UsoArticulo u WHERE u.descripcion = :descripcion")})
public class UsoArticulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_uso_articulo")
    private Integer idUsoArticulo;
    @Size(max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToMany(mappedBy = "usoArticuloList", fetch = FetchType.LAZY)
    private List<Articulo> articuloList;

    public UsoArticulo() {
    }

    public UsoArticulo(Integer idUsoArticulo) {
        this.idUsoArticulo = idUsoArticulo;
    }

    public Integer getIdUsoArticulo() {
        return idUsoArticulo;
    }

    public void setIdUsoArticulo(Integer idUsoArticulo) {
        this.idUsoArticulo = idUsoArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Articulo> getArticuloList() {
        return articuloList;
    }

    public void setArticuloList(List<Articulo> articuloList) {
        this.articuloList = articuloList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsoArticulo != null ? idUsoArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsoArticulo)) {
            return false;
        }
        UsoArticulo other = (UsoArticulo) object;
        if ((this.idUsoArticulo == null && other.idUsoArticulo != null) || (this.idUsoArticulo != null && !this.idUsoArticulo.equals(other.idUsoArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mx.adme.modelo.UsoArticulo[ idUsoArticulo=" + idUsoArticulo + " ]";
    }
    
}
