package com.example.clientesdb.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Departamentos")
public class Departamentos {
    @PrimaryKey(autoGenerate = true)
    private int idDepartamento;
    @ColumnInfo(name = "nombreDepartamento")
    private String nombreDepartamento;
    @ColumnInfo
    private String codigoDepartamento;
    @Ignore
    public Departamentos(int idDepartamento, String nombreDepartamento, String codigoDepartamento) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.codigoDepartamento = codigoDepartamento;
    }

    public Departamentos(String nombreDepartamento, String codigoDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        this.codigoDepartamento = codigoDepartamento;
    }
    @Ignore
    public Departamentos() {
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }
}
