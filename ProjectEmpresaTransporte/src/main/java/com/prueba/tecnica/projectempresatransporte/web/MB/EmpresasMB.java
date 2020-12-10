/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectempresatransporte.web.MB;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import com.prueba.tecnica.projectempresatransporte.persistence.EmpresaFacadeLocal;
import com.prueba.tecnica.projectempresatransporte.persistence.VehiculoFacadeLocal;
import com.prueba.tecnica.projectempresatransporte.persistence.ConductorFacadeLocal;
import com.prueba.tecnica.projectempresatransporte.entities.Empresa;
import com.prueba.tecnica.projectempresatransporte.entities.Vehiculo;
import com.prueba.tecnica.projectempresatransporte.entities.Conductor;

@ManagedBean(name="empresasMB")
@RequestScoped
public class EmpresasMB {
    
    @EJB
    private empresatransporteBeanLocal empresasBusiness;
    
    private List<Empresa> empresas;
    
    public EmpresasMB() {
    }
    
    @PostConstruct
    public void init(){
        empresas = new ArrayList<>();
    }
    public void queryEmpresa(){empresas = new ArrayList<>();
        empresas = empresasBusiness.getEmpresa();  
        System.out.println(empresas);
    }

    public List<Empresa> getEmpresa() {
        return empresas;
    }

    public void setEmpresa(List<Empresa> empresas) {
        this.empresas = empresas;
    }
    
    
}
