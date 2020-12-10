/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.ProjectEmpresaTransporte.persistence;

import com.prueba.tecnica.projectempresatransporte.entities.Empresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface EmpresaFacadeLocal {

    void create(Empresa empresas);

    void edit(Empresa empresas);

    void remove(Empresa empresas);

    Empresa find(Object id);

    List<Empresa> findAll();

    List<Empresa> findRange(int[] range);

    int count();
    
}
