/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectempresatransporte.web.MB;

import java.io.Serializable;
import javax.ejb.EJB;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import com.prueba.tecnica.projectempresatransporte.entities.Conductor;
import com.prueba.tecnica.projectempresatransporte.entities.Vehiculo;
import com.prueba.tecnica.projectempresatransporte.entities.Empresa;
import com.prueba.tecnica.projectempresatransporte.business.empresatransporteBeanLocal;

@Named(value = "conductorsMB")
@ViewScoped
public class ConductoresMB implements Serializable {

    @EJB
    private empresatransporteBeanLocal empresaTransporte;  

    private List<Conductor> conductor;
    
    private Empresa empresa;

    private Vehiculo vehiculo;

    private Integer idempresa;
    
    public ConductoresMB() {
    }

    public void loadTanques() {
        conductor = empresaTransporte.getConductorByalmacen(idempresa);
        almacen = empresaTransporte.getAlmacen(idempresa);
    }

    public empresatransporteBeanLocal getAlmacenJuego() {
        return empresaTransporte;
    }

    public void setAlmacenJuego(empresatransporteBeanLocal empresaTransporte) {
        this.empresaTransporte = empresaTransporte;
    }

    public List<Conductor> getConductor() {
        return conductor;
    }

    public void setConductor(List<Conductor> conductor) {
        this.conductor = conductor;
    }

    public empresas getEmpresa() {
        return almacen;
    }

    public void setEmpresa(empresas almacen) {
        this.almacen = almacen;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdEmpresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

}
