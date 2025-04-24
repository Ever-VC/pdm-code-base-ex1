package com.example.clientesdb.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "Municipios",
        foreignKeys = {
                @ForeignKey(
                        entity = Departamentos.class,
                        parentColumns = "idDepartamento",
                        childColumns = "idDepartamento",
                        onDelete = ForeignKey.RESTRICT
                )
        },
        indices = {
                @Index(value = "idDepartamento")
        }
)
public class Municipios {
    @PrimaryKey(autoGenerate = true)
    private int idMunicipio;
    @ColumnInfo
    private String nombreMunicipio;
    @ColumnInfo
    private String coidgoMunicipio;
    @ColumnInfo
    private int idDepartamento;
    @Ignore
    public Municipios(int idMunicipio, String nombreMunicipio, String coidgoMunicipio, int idDepartamento) {
        this.idMunicipio = idMunicipio;
        this.nombreMunicipio = nombreMunicipio;
        this.coidgoMunicipio = coidgoMunicipio;
        this.idDepartamento = idDepartamento;
    }

    public Municipios(String nombreMunicipio, String coidgoMunicipio, int idDepartamento) {
        this.nombreMunicipio = nombreMunicipio;
        this.coidgoMunicipio = coidgoMunicipio;
        this.idDepartamento = idDepartamento;
    }
    @Ignore
    public Municipios() {
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getCoidgoMunicipio() {
        return coidgoMunicipio;
    }

    public void setCoidgoMunicipio(String coidgoMunicipio) {
        this.coidgoMunicipio = coidgoMunicipio;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
}
