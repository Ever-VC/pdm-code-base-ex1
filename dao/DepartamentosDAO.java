package com.example.clientesdb.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.clientesdb.models.Departamentos;

import java.util.List;

@Dao
public interface DepartamentosDAO {
    @Insert
    Long insertDepartamento(Departamentos departamento);
    @Update
    int upddateDepartamento(Departamentos departamento);
    @Delete
    int deleteDepartamento(Departamentos departamento);
    @Query("SELECT * FROM Departamentos")
    List<Departamentos> getAllDepartamentos();
}
