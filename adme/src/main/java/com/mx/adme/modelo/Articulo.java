/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.adme.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yharis
 */
@Entity
@Table(name = "articulo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Articulo.findAll", query = "SELECT a FROM Articulo a"),
    @NamedQuery(name = "Articulo.findByIdArticulo", query = "SELECT a FROM Articulo a WHERE a.idArticulo = :idArticulo"),
    @NamedQuery(name = "Articulo.findByDescripcion", query = "SELECT a FROM Articulo a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Articulo.findByPrecioCompra", query = "SELECT a FROM Articulo a WHERE a.precioCompra = :precioCompra"),
    @NamedQuery(name = "Articulo.findByPrecioVenta", query = "SELECT a FROM Articulo a WHERE a.precioVenta = :precioVenta"),
    @NamedQuery(name = "Articulo.findByExistencia", query = "SELECT a FROM Articulo a WHERE a.existencia = :existencia"),
    @NamedQuery(name = "Articulo.findByExistenciaMinima", query = "SELECT a FROM Articulo a WHERE a.existenciaMinima = :existenciaMinima")})
public class Articulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_articulo")
    private Integer idArticulo;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_compra")
    private BigDecimal precioCompra;
    @Column(name = "precio_venta")
    private BigDecimal precioVenta;
    @Column(name = "existencia")
    private Integer existencia;
    @Column(name = "existencia_minima")
    private Integer existenciaMinima;
    @JoinTable(name = "uso_articulo_articulo", joinColumns = {
        @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo")}, inverseJoinColumns = {
        @JoinColumn(name = "id_uso_articulo", referencedColumnName = "id_uso_articulo")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<UsoArticulo> usoArticuloList;
    @JoinTable(name = "pedido_articulo", joinColumns = {
        @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo")}, inverseJoinColumns = {
        @JoinColumn(name = "id_pedido", referencedColumnName = "id_pedido")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Pedido> pedidoList;
    @OneToMany(mappedBy = "idArticulo", fetch = FetchType.LAZY)
    private List<SinonimoArticulo> sinonimoArticuloList;

    public Articulo() {
    }

    public Articulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public Integer getExistenciaMinima() {
        return existenciaMinima;
    }

    public void setExistenciaMinima(Integer existenciaMinima) {
        this.existenciaMinima = existenciaMinima;
    }

    @XmlTransient
    public List<UsoArticulo> getUsoArticuloList() {
        return usoArticuloList;
    }

    public void setUsoArticuloList(List<UsoArticulo> usoArticuloList) {
        this.usoArticuloList = usoArticuloList;
    }

    @XmlTransient
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @XmlTransient
    public List<SinonimoArticulo> getSinonimoArticuloList() {
        return sinonimoArticuloList;
    }

    public void setSinonimoArticuloList(List<SinonimoArticulo> sinonimoArticuloList) {
        this.sinonimoArticuloList = sinonimoArticuloList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticulo != null ? idArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.idArticulo == null && other.idArticulo != null) || (this.idArticulo != null && !this.idArticulo.equals(other.idArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mx.adme.modelo.Articulo[ idArticulo=" + idArticulo + " ]";
    }
    
}
