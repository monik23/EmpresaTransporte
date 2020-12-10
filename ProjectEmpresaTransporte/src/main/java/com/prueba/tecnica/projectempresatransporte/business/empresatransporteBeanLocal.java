/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectempresatransporte.business;

import com.prueba.tecnica.projectempresatransporte.entities.Conductor;
import com.prueba.tecnica.projectempresatransporte.entities.Vehiculo;
import com.prueba.tecnica.projectempresatransporte.entities.Empresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface empresatransporteBeanLocal {
    public List<Conductor> getConductor();
    
    public Conductor getConductor(final int id);
    
    public Empresa getEmpresa(final int id);
    
    public Vehiculo getVehiculo(final int id);
    
    public List<Empresa> getEmpresaByIdempresa(Integer idempresa);
    
    public List<Vehiculo> getVehiculoByconductor(Integer idconductor);
}
