package com.mx.adme.modelo;

import com.mx.adme.modelo.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-02-16T09:23:56")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> codigoPostal;
    public static volatile SingularAttribute<Cliente, String> calleNumero;
    public static volatile ListAttribute<Cliente, Pedido> pedidoList;
    public static volatile SingularAttribute<Cliente, String> apellidos;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> colonia;

}