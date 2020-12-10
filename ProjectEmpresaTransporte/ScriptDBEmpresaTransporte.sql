--Creacion DB --
CREATE DATABASE empresatransporte;

use empresatransporte;


--Creacion tablas --

CREATE TABLE conductor(
	idconductor INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idvehiculo INT (6) NOT NULL,
	idempresa INT (6) NOT NULL,
	tipoidentificacion VARCHAR(2) NOT NULL,
	numeroidentificacion INT (10) NOT NULL,
	nombrecompleto VARCHAR(100) NOT NULL,
	direccion VARCHAR(100) NOT NULL,
	ciudad VARCHAR(50) NOT NULL,
	departamento VARCHAR(50) NOT NULL,
	pais VARCHAR(50) NOT NULL,
	telefono INT (10) NOT NULL,
	estado BOOLEAN NOT NULL
	);
	
CREATE TABLE vehiculo(
	idvehiculo INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idempresa INT (6) NOT NULL,
	placa VARCHAR(20) NOT NULL,
	motor VARCHAR(20) NOT NULL,
	chasis VARCHAR(20) NOT NULL,
	modelo INT (6) NOT NULL,
	fechaMatricula date,
	pasajerosSentados INT (2) NOT NULL,
	PasajerosDePie INT (2) NOT NULL,
	pesoSeco INT (6) NOT NULL,
	pesoBruto INT (6) NOT NULL,
	cantidadPuertas INT (1) NOT NULL,
	marca VARCHAR(20) NOT NULL,
	linea VARCHAR(20) NOT NULL,
	estado BOOLEAN NOT NULL
	);
	
CREATE TABLE empresa(
	idempresa INT (6) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idconductor INT (6) NOT NULL,
	idvehiculo INT (6) NOT NULL,
	tipoidentificacion VARCHAR(2) NOT NULL,
	numeroidentificacion INT (10) NOT NULL,
	nombrecompleto VARCHAR(100) NOT NULL,
	direccion VARCHAR(100) NOT NULL,
	ciudad VARCHAR(50) NOT NULL,
	departamento VARCHAR(50) NOT NULL,
	pais VARCHAR(50) NOT NULL,
	telefono INT (10) NOT NULL
	);
	
--Generar llaves foreign--	

alter table conductor add constraint empresaconductor_fk foreign key (idempresa) references empresa (idempresa);
alter table empresa add constraint vehiculoempresa_fk foreign key (idvehiculo) references vehiculo (idvehiculo); 
alter table conductor add constraint conductorvehiculo_fk foreign key (idvehiculo) references vehiculo (idvehiculo);


-- Querys. --

SELECT v.placa, e.tipoIdentificacion, e.numeroIdentificacion, e.nombreCompleto, count(idconductor) FROM empresa e, vehiculo v, conductor c 
WHERE e.idempresa=v.idempresa and e.idempresa=c.idempresa GROUP BY c.idconductor ORDER BY v.placa;
