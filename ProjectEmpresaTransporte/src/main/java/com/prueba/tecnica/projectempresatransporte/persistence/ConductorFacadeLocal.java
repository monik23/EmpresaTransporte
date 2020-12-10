/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.ProjectEmpresaTransporte.persistence;

import com.prueba.tecnica.projectempresatransporte.entities.Conductor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface ConductorFacadeLocal {

    void create(Conductor almacenes);

    void edit(Conductor almacenes);

    void remove(Conductor almacenes);

    Conductor find(Object id);

    List<Conductor> findAll();

    List<Conductor> findRange(int[] range);

    int count();
    
}
