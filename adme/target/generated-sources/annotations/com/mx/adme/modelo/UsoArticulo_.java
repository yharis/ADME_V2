package com.mx.adme.modelo;

import com.mx.adme.modelo.Articulo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-02-16T09:23:56")
@StaticMetamodel(UsoArticulo.class)
public class UsoArticulo_ { 

    public static volatile SingularAttribute<UsoArticulo, Integer> idUsoArticulo;
    public static volatile SingularAttribute<UsoArticulo, String> descripcion;
    public static volatile ListAttribute<UsoArticulo, Articulo> articuloList;

}