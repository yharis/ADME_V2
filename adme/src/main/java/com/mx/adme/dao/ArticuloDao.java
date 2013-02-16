/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.adme.dao;

import com.mx.adme.modelo.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yharis
 */
public interface ArticuloDao extends JpaRepository<Articulo, Integer>{
    
    
}
