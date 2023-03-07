
package com.presupuesto.repository;


import java.util.List;
import org.springframework.data.repository.Repository;

import com.presupuesto.models.Unidad;

public interface UnidadRepository extends Repository<Unidad, Integer>{
    List<Unidad>findAll();
    Unidad findOne(int id);
    Unidad save(Unidad p);
    void delete(Unidad p);
}
