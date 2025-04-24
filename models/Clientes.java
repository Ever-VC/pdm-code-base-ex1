package com.example.clientesdb.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "Clientes",
        foreignKeys = {
                @ForeignKey(
                        entity = Departamentos.class,
                        parentColumns = "idDepartamento",
                        childColumns = "idDepartamento",
                        onDelete = ForeignKey.RESTRICT
                ),
                @ForeignKey(
                        entity = Municipios.class,
                        parentColumns = "idMunicipio",
                        childColumns = "idMunicipio",
                        onDelete = ForeignKey.RESTRICT
                )
        },
        indices = {
                @Index(value = "idMunicipio"),
                @Index(value = "idDepartamento")
        }
)
public class Clientes {
    @PrimaryKey(autoGenerate = true)
    private int idCliente;
    @ColumnInfo
    private String nombreCliente;
    @ColumnInfo
    private String telefono;
    @ColumnInfo
    private String correo;
    @ColumnInfo
    private  int idDepartamento;
    @ColumnInfo
    private int idMunicipio;
    @Ignore
    public Clientes(int idCliente, String nombreCliente, String telefono, String correo, int idDepartamento, int idMunicipio) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.correo = correo;
        this.idDepartamento = idDepartamento;
        this.idMunicipio = idMunicipio;
    }

    public Clientes(String nombreCliente, String telefono, String correo, int idDepartamento, int idMunicipio) {
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.correo = correo;
        this.idDepartamento = idDepartamento;
        this.idMunicipio = idMunicipio;
    }
    @Ignore
    public Clientes() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
}
