/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectempresatransporte.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Monik
 */
@Entity
@Table(name = "conductor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conductor.findAll", query = "SELECT c FROM Conductor c"),
    @NamedQuery(name = "Conductor.findByIdconductor", query = "SELECT c FROM Conductor c WHERE c.idconductor = :idconductor"),
    @NamedQuery(name = "Conductor.findByTipoidentificacion", query = "SELECT c FROM Conductor c WHERE c.tipoidentificacion = :tipoidentificacion"),
    @NamedQuery(name = "Conductor.findByNumeroidentificacion", query = "SELECT c FROM Conductor c WHERE c.numeroidentificacion = :numeroidentificacion"),
    @NamedQuery(name = "Conductor.findByNombrecompleto", query = "SELECT c FROM Conductor c WHERE c.nombrecompleto = :nombrecompleto"),
    @NamedQuery(name = "Conductor.findByDireccion", query = "SELECT c FROM Conductor c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Conductor.findByCiudad", query = "SELECT c FROM Conductor c WHERE c.ciudad = :ciudad"),
    @NamedQuery(name = "Conductor.findByDepartamento", query = "SELECT c FROM Conductor c WHERE c.departamento = :departamento"),
    @NamedQuery(name = "Conductor.findByPais", query = "SELECT c FROM Conductor c WHERE c.pais = :pais"),
    @NamedQuery(name = "Conductor.findByTelefono", query = "SELECT c FROM Conductor c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Conductor.findByEstado", query = "SELECT c FROM Conductor c WHERE c.estado = :estado")})
public class Conductor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idconductor")
    private Integer idconductor;
    @Basic(optional = false)
    @Column(name = "tipoidentificacion")
    private String tipoidentificacion;
    @Basic(optional = false)
    @Column(name = "numeroidentificacion")
    private int numeroidentificacion;
    @Basic(optional = false)
    @Column(name = "nombrecompleto")
    private String nombrecompleto;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @Column(name = "departamento")
    private String departamento;
    @Basic(optional = false)
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @Column(name = "telefono")
    private int telefono;
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;
    @JoinColumn(name = "idvehiculo", referencedColumnName = "idvehiculo")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Vehiculo idvehiculo;
    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Empresa idempresa;

    public Conductor() {
    }

    public Conductor(Integer idconductor) {
        this.idconductor = idconductor;
    }

    public Conductor(Integer idconductor, String tipoidentificacion, int numeroidentificacion, String nombrecompleto, String direccion, String ciudad, String departamento, String pais, int telefono, boolean estado) {
        this.idconductor = idconductor;
        this.tipoidentificacion = tipoidentificacion;
        this.numeroidentificacion = numeroidentificacion;
        this.nombrecompleto = nombrecompleto;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Integer getIdconductor() {
        return idconductor;
    }

    public void setIdconductor(Integer idconductor) {
        this.idconductor = idconductor;
    }

    public String getTipoidentificacion() {
        return tipoidentificacion;
    }

    public void setTipoidentificacion(String tipoidentificacion) {
        this.tipoidentificacion = tipoidentificacion;
    }

    public int getNumeroidentificacion() {
        return numeroidentificacion;
    }

    public void setNumeroidentificacion(int numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Vehiculo getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(Vehiculo idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public Empresa getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Empresa idempresa) {
        this.idempresa = idempresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconductor != null ? idconductor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conductor)) {
            return false;
        }
        Conductor other = (Conductor) object;
        if ((this.idconductor == null && other.idconductor != null) || (this.idconductor != null && !this.idconductor.equals(other.idconductor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.tecnica.projectempresatransporte.entities.Conductor[ idconductor=" + idconductor + " ]";
    }
    
}
