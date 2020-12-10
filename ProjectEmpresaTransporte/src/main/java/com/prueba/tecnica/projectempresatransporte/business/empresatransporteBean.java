/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectempresatransporte.business;

import com.prueba.tecnica.projectempresatransporte.persistence.ConductorFacadeLocal;
import com.prueba.tecnica.projectempresatransporte.persistence.VehiculoFacadeLocal;
import com.prueba.tecnica.projectempresatransporte.persistence.EmpresaFacadeLocal;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;


/**
 *
 * @author Mon
 */
@Stateless
public class empresatransporteBean implements empresatransporteBeanLocal {

    @EJB
    private ConductorFacadeLocal conductoresFacade;
    
    @EJB
    private EmpresaFacadeLocal empresasFacade;
    
    @EJB
    private VehiculoFacadeLocal vehiculosFacade;

    @Override
    public List<Conductor> getConductor(){
        return conductoresFacade.findAll();
    }
    
    @Override
    public Conductor getConductor(final int id){
        return conductoresFacade.find(id);
    }
    
    @Override
    public Empresa getEmpresa(final int id){
        return empresasFacade.find(id);
    }
    
    @Override
    public Vehiculo getVehiculo(final int id){
        return vehiculosFacade.find(id);
    }
    
    @Override
    public List<Empresa> getEmpresaByIdempresa(Integer idempresa){
        return empresasFacade.findAll();
    }
    
    @Override
    public List<Vehiculo> getVehiculoByconductor(Integer idconductor){
        return vehiculosFacade.findAll();
    }
}
