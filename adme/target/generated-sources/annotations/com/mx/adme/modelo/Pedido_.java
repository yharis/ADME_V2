package com.mx.adme.modelo;

import com.mx.adme.modelo.Articulo;
import com.mx.adme.modelo.Cliente;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-02-16T09:23:56")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, BigDecimal> importe;
    public static volatile SingularAttribute<Pedido, Integer> idPedido;
    public static volatile SingularAttribute<Pedido, Cliente> idCliente;
    public static volatile SingularAttribute<Pedido, Date> fechaPedido;
    public static volatile ListAttribute<Pedido, Articulo> articuloList;

}