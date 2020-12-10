/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectempresatransporte.persistence;

import com.prueba.tecnica.projectempresatransporte.entities.Vehiculo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface VehiculoFacadeLocal {

    void create(Vehiculo vehiculos);

    void edit(Vehiculo vehiculos);

    void remove(Vehiculo vehiculos);

    Vehiculo find(Object id);

    List<Vehiculo> findAll();

    List<Vehiculo> findRange(int[] range);

    int count();
    
}
