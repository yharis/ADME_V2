package com.mx.adme.modelo;

import com.mx.adme.modelo.Pedido;
import com.mx.adme.modelo.SinonimoArticulo;
import com.mx.adme.modelo.UsoArticulo;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-02-16T09:23:56")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, Integer> idArticulo;
    public static volatile SingularAttribute<Articulo, Integer> existenciaMinima;
    public static volatile ListAttribute<Articulo, Pedido> pedidoList;
    public static volatile SingularAttribute<Articulo, String> descripcion;
    public static volatile SingularAttribute<Articulo, BigDecimal> precioVenta;
    public static volatile SingularAttribute<Articulo, Integer> existencia;
    public static volatile ListAttribute<Articulo, UsoArticulo> usoArticuloList;
    public static volatile SingularAttribute<Articulo, BigDecimal> precioCompra;
    public static volatile ListAttribute<Articulo, SinonimoArticulo> sinonimoArticuloList;

}