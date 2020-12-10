/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectempresatransporte.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Monik
 */
@Entity
@Table(name = "vehiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v"),
    @NamedQuery(name = "Vehiculo.findByIdvehiculo", query = "SELECT v FROM Vehiculo v WHERE v.idvehiculo = :idvehiculo"),
    @NamedQuery(name = "Vehiculo.findByIdempresa", query = "SELECT v FROM Vehiculo v WHERE v.idempresa = :idempresa"),
    @NamedQuery(name = "Vehiculo.findByPlaca", query = "SELECT v FROM Vehiculo v WHERE v.placa = :placa"),
    @NamedQuery(name = "Vehiculo.findByMotor", query = "SELECT v FROM Vehiculo v WHERE v.motor = :motor"),
    @NamedQuery(name = "Vehiculo.findByChasis", query = "SELECT v FROM Vehiculo v WHERE v.chasis = :chasis"),
    @NamedQuery(name = "Vehiculo.findByModelo", query = "SELECT v FROM Vehiculo v WHERE v.modelo = :modelo"),
    @NamedQuery(name = "Vehiculo.findByFechaMatricula", query = "SELECT v FROM Vehiculo v WHERE v.fechaMatricula = :fechaMatricula"),
    @NamedQuery(name = "Vehiculo.findByPasajerosSentados", query = "SELECT v FROM Vehiculo v WHERE v.pasajerosSentados = :pasajerosSentados"),
    @NamedQuery(name = "Vehiculo.findByPasajerosDePie", query = "SELECT v FROM Vehiculo v WHERE v.pasajerosDePie = :pasajerosDePie"),
    @NamedQuery(name = "Vehiculo.findByPesoSeco", query = "SELECT v FROM Vehiculo v WHERE v.pesoSeco = :pesoSeco"),
    @NamedQuery(name = "Vehiculo.findByPesoBruto", query = "SELECT v FROM Vehiculo v WHERE v.pesoBruto = :pesoBruto"),
    @NamedQuery(name = "Vehiculo.findByCantidadPuertas", query = "SELECT v FROM Vehiculo v WHERE v.cantidadPuertas = :cantidadPuertas"),
    @NamedQuery(name = "Vehiculo.findByMarca", query = "SELECT v FROM Vehiculo v WHERE v.marca = :marca"),
    @NamedQuery(name = "Vehiculo.findByLinea", query = "SELECT v FROM Vehiculo v WHERE v.linea = :linea"),
    @NamedQuery(name = "Vehiculo.findByEstado", query = "SELECT v FROM Vehiculo v WHERE v.estado = :estado")})
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvehiculo")
    private Integer idvehiculo;
    @Basic(optional = false)
    @Column(name = "idempresa")
    private int idempresa;
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @Column(name = "motor")
    private String motor;
    @Basic(optional = false)
    @Column(name = "chasis")
    private String chasis;
    @Basic(optional = false)
    @Column(name = "modelo")
    private int modelo;
    @Column(name = "fechaMatricula")
    @Temporal(TemporalType.DATE)
    private Date fechaMatricula;
    @Basic(optional = false)
    @Column(name = "pasajerosSentados")
    private int pasajerosSentados;
    @Basic(optional = false)
    @Column(name = "PasajerosDePie")
    private int pasajerosDePie;
    @Basic(optional = false)
    @Column(name = "pesoSeco")
    private int pesoSeco;
    @Basic(optional = false)
    @Column(name = "pesoBruto")
    private int pesoBruto;
    @Basic(optional = false)
    @Column(name = "cantidadPuertas")
    private int cantidadPuertas;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "linea")
    private String linea;
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idvehiculo", fetch = FetchType.EAGER)
    private List<Empresa> empresaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idvehiculo", fetch = FetchType.EAGER)
    private List<Conductor> conductorList;

    public Vehiculo() {
    }

    public Vehiculo(Integer idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public Vehiculo(Integer idvehiculo, int idempresa, String placa, String motor, String chasis, int modelo, int pasajerosSentados, int pasajerosDePie, int pesoSeco, int pesoBruto, int cantidadPuertas, String marca, String linea, boolean estado) {
        this.idvehiculo = idvehiculo;
        this.idempresa = idempresa;
        this.placa = placa;
        this.motor = motor;
        this.chasis = chasis;
        this.modelo = modelo;
        this.pasajerosSentados = pasajerosSentados;
        this.pasajerosDePie = pasajerosDePie;
        this.pesoSeco = pesoSeco;
        this.pesoBruto = pesoBruto;
        this.cantidadPuertas = cantidadPuertas;
        this.marca = marca;
        this.linea = linea;
        this.estado = estado;
    }

    public Integer getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(Integer idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public int getPasajerosSentados() {
        return pasajerosSentados;
    }

    public void setPasajerosSentados(int pasajerosSentados) {
        this.pasajerosSentados = pasajerosSentados;
    }

    public int getPasajerosDePie() {
        return pasajerosDePie;
    }

    public void setPasajerosDePie(int pasajerosDePie) {
        this.pasajerosDePie = pasajerosDePie;
    }

    public int getPesoSeco() {
        return pesoSeco;
    }

    public void setPesoSeco(int pesoSeco) {
        this.pesoSeco = pesoSeco;
    }

    public int getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(int pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Empresa> getEmpresaList() {
        return empresaList;
    }

    public void setEmpresaList(List<Empresa> empresaList) {
        this.empresaList = empresaList;
    }

    @XmlTransient
    public List<Conductor> getConductorList() {
        return conductorList;
    }

    public void setConductorList(List<Conductor> conductorList) {
        this.conductorList = conductorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvehiculo != null ? idvehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.idvehiculo == null && other.idvehiculo != null) || (this.idvehiculo != null && !this.idvehiculo.equals(other.idvehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.tecnica.projectempresatransporte.entities.Vehiculo[ idvehiculo=" + idvehiculo + " ]";
    }
    
}
