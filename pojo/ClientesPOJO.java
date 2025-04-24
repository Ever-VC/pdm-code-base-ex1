package com.example.clientesdb.POJO;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.clientesdb.models.Clientes;
import com.example.clientesdb.models.Departamentos;
import com.example.clientesdb.models.Municipios;

public class ClientesPOJO {
    @Embedded
    public Clientes clientes;
    @Relation(
            parentColumn = "idDepartamento",
            entityColumn = "idDepartamento"
    )
    public Departamentos departamentos;
    @Relation(
            parentColumn = "idMunicipio",
            entityColumn = "idMunicipio"
    )
    public Municipios municipios;
}
